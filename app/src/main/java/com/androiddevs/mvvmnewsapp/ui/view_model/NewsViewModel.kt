package com.androiddevs.mvvmnewsapp.ui.view_model

import android.animation.TypeEvaluator
import android.app.Application
import android.content.Context
import android.net.ConnectivityManager
import android.net.ConnectivityManager.*
import android.net.NetworkCapabilities.*
import android.os.Build
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.androiddevs.mvvmnewsapp.model.Article
import com.androiddevs.mvvmnewsapp.model.NewsResponse
import com.androiddevs.mvvmnewsapp.repository.NewsRepository
import com.androiddevs.mvvmnewsapp.utils.Resource
import kotlinx.coroutines.launch
import retrofit2.Response
import java.io.IOException

class NewsViewModel(
    // we cannot use constructor parameter by default in our viewmodel
    // if we want to do that bcz we need newsRepository in our viewModel
    // we need to create viewmodel provider factory to define how our own viewmodel should be created
    app: Application,
    val newsRepository: NewsRepository
) : AndroidViewModel(app) {
    val breakingNews: MutableLiveData<Resource<NewsResponse>> = MutableLiveData()

    // here we are setting breaking new page number as 1 bcz if we rotate our device in fragement it will again becone to null or 0
    var breakingNewsPage = 1

    var breakingNewsResponse: NewsResponse? = null

    val searchNews: MutableLiveData<Resource<NewsResponse>> = MutableLiveData()
    var searchNewsPage = 1
    var searchNewsResponse: NewsResponse? = null

    init {
        getBreakingNews("in")
    }


    fun getBreakingNews(countryCode: String) {
        // viewModelScope will make sure this coroutine will be alive till the time our viewModelScope is alive
        viewModelScope.launch {

        safeBreakingNewsCall(countryCode)


        }

    }

    fun searchNews(searchQuery: String) {
        viewModelScope.launch {
         safeSearchNewsCall(searchQuery)
        }
    }


    private fun handleBreakingNewResponse(response: Response<NewsResponse>): Resource<NewsResponse> {
        // this handleBreakingNewResponse will now decide wheather we want to emmit succes or error state in our live data
        if (response.isSuccessful) {
            response.body()?.let { resultResponse ->
                // when we get sucess we want to increase our count page number so that we are able to load next page
                breakingNewsPage++
                if (breakingNewsResponse == null) {
                    breakingNewsResponse == resultResponse
                } else {
                    val oldArticle = breakingNewsResponse?.articles
                    val newArticle = resultResponse.articles
                    oldArticle?.addAll(newArticle)
                }

                //if it is not null we want to return sucess
                // if breakingNewsResponse is null we will return resultResponse else will return breakingNewsResponse
                return Resource.Sucess(breakingNewsResponse ?: resultResponse)
            }
        }

        // if response is not sucess we want to return error
        return Resource.Error(response.message())
    }

    private fun handleSearchNewResponse(response: Response<NewsResponse>): Resource<NewsResponse> {
        // this handleBreakingNewResponse will now decide wheather we want to emmit succes or error state in our live data
        if (response.isSuccessful) {
            response.body()?.let { resultResponse ->
                // when we get sucess we want to increase our count page number so that we are able to load next page
                searchNewsPage++
                if (searchNewsResponse == null) {
                    searchNewsResponse == resultResponse
                } else {
                    val oldArticle = searchNewsResponse?.articles
                    val newArticle = resultResponse.articles
                    oldArticle?.addAll(newArticle)
                }

                //if it is not null we want to return sucess
                // if breakingNewsResponse is null we will return resultResponse else will return breakingNewsResponse
                return Resource.Sucess(searchNewsResponse ?: resultResponse)
            }
        }

        // if response is not sucess we want to return error
        return Resource.Error(response.message())
    }

    fun saveArticle(article: Article) = viewModelScope.launch {
        newsRepository.upsert(article)
    }

    fun getSaveNews() = newsRepository.getSavedNews()

    fun deleteArticle(article: Article) = viewModelScope.launch {
        newsRepository.deleteArticle(article)
    }

    private suspend fun safeBreakingNewsCall(countryCode:String){
        breakingNews.postValue(Resource.Loading())
        try {
            if (hasInternetConnection()){
                // before we make the actual networkcall we want to emit the loading state to our live data
                //bcz our fragment can handle the loading state
                breakingNews.postValue(Resource.Loading())
                // now we can make the networkRequest
                val response = newsRepository.getBreakingNews(countryCode, breakingNewsPage)

                breakingNews.postValue(handleBreakingNewResponse(response))
            }else{
                // if we dont have internet connection
                breakingNews.postValue(Resource.Error("No Internet Connection"))
            }
        }catch (t:Throwable){
            // getBreakingNews throws an exception
            when(t){
                is IOException -> breakingNews.postValue(Resource.Error("Network Failure ${t.message}"))

                else -> breakingNews.postValue(Resource.Error("Josn conversion Error"))
            }
        }
    }



    private suspend fun safeSearchNewsCall(searchQuery:String){
        searchNews.postValue(Resource.Loading())
        try {
            if (hasInternetConnection()){
                // before we make the actual networkcall we want to emit the loading state to our live data
                //bcz our fragment can handle the loading state
                breakingNews.postValue(Resource.Loading())
                // now we can make the networkRequest
                val response = newsRepository.searchNews(searchQuery, searchNewsPage)

                searchNews.postValue(handleSearchNewResponse(response))
            }else{
                // if we dont have internet connection
                searchNews.postValue(Resource.Error("No Internet Connection"))
            }
        }catch (t:Throwable){
            // getBreakingNews throws an exception
            when(t){
                is IOException -> searchNews.postValue(Resource.Error("Network Failure ${t.message}"))

                else -> searchNews.postValue(Resource.Error("Josn conversion Error"))
            }
        }
    }

    private fun hasInternetConnection(): Boolean {
        // this connectivityManager is used to deduct wheather user is connected to internet or not
        val connectivityManager = getApplication<NewsApplication>().getSystemService(
            Context.CONNECTIVITY_SERVICE
        ) as ConnectivityManager

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {

            //if it is null it mean not internet so returing false
            val activeNetwork = connectivityManager.activeNetwork ?: return false
            //if it is null it mean not internet so returing false
            val capabilities =
                connectivityManager.getNetworkCapabilities(activeNetwork) ?: return false
            // with capablites we have access to diffrent type of network and we can check if those are avialable or not
            return when {
                capabilities.hasTransport(TRANSPORT_WIFI) -> true
                capabilities.hasTransport(TRANSPORT_CELLULAR) -> true
                capabilities.hasTransport(TRANSPORT_ETHERNET) -> true

                else -> false
            }
        }else{
            //below version M
            connectivityManager.activeNetworkInfo?.run {
                return when(type){
                    TYPE_WIFI -> true
                    TYPE_MOBILE -> true
                    TYPE_ETHERNET -> true

                    else -> false
                }
            }
        }
        return false
    }

}