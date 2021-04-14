package com.androiddevs.mvvmnewsapp.ui.view_model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J\u000e\u0010\u000b\u001a\u00020&2\u0006\u0010\'\u001a\u00020(J\u0012\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0+0*J\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0.H\u0002J\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0.H\u0002J\b\u00100\u001a\u000201H\u0002J\u0019\u00102\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103J\u0019\u00104\u001a\u00020&2\u0006\u00105\u001a\u00020(H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103J\u000e\u00106\u001a\u00020#2\u0006\u0010$\u001a\u00020%J\u000e\u0010\u001a\u001a\u00020&2\u0006\u00105\u001a\u00020(R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u001c\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00067"}, d2 = {"Lcom/androiddevs/mvvmnewsapp/ui/view_model/NewsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "newsRepository", "Lcom/androiddevs/mvvmnewsapp/repository/NewsRepository;", "(Landroid/app/Application;Lcom/androiddevs/mvvmnewsapp/repository/NewsRepository;)V", "breakingNews", "Landroidx/lifecycle/MutableLiveData;", "Lcom/androiddevs/mvvmnewsapp/utils/Resource;", "Lcom/androiddevs/mvvmnewsapp/model/NewsResponse;", "getBreakingNews", "()Landroidx/lifecycle/MutableLiveData;", "breakingNewsPage", "", "getBreakingNewsPage", "()I", "setBreakingNewsPage", "(I)V", "breakingNewsResponse", "getBreakingNewsResponse", "()Lcom/androiddevs/mvvmnewsapp/model/NewsResponse;", "setBreakingNewsResponse", "(Lcom/androiddevs/mvvmnewsapp/model/NewsResponse;)V", "getNewsRepository", "()Lcom/androiddevs/mvvmnewsapp/repository/NewsRepository;", "searchNews", "getSearchNews", "searchNewsPage", "getSearchNewsPage", "setSearchNewsPage", "searchNewsResponse", "getSearchNewsResponse", "setSearchNewsResponse", "deleteArticle", "Lkotlinx/coroutines/Job;", "article", "Lcom/androiddevs/mvvmnewsapp/model/Article;", "", "countryCode", "", "getSaveNews", "Landroidx/lifecycle/LiveData;", "", "handleBreakingNewResponse", "response", "Lretrofit2/Response;", "handleSearchNewResponse", "hasInternetConnection", "", "safeBreakingNewsCall", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "safeSearchNewsCall", "searchQuery", "saveArticle", "app_debug"})
public final class NewsViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.androiddevs.mvvmnewsapp.utils.Resource<com.androiddevs.mvvmnewsapp.model.NewsResponse>> breakingNews = null;
    private int breakingNewsPage = 1;
    @org.jetbrains.annotations.Nullable()
    private com.androiddevs.mvvmnewsapp.model.NewsResponse breakingNewsResponse;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.androiddevs.mvvmnewsapp.utils.Resource<com.androiddevs.mvvmnewsapp.model.NewsResponse>> searchNews = null;
    private int searchNewsPage = 1;
    @org.jetbrains.annotations.Nullable()
    private com.androiddevs.mvvmnewsapp.model.NewsResponse searchNewsResponse;
    @org.jetbrains.annotations.NotNull()
    private final com.androiddevs.mvvmnewsapp.repository.NewsRepository newsRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.androiddevs.mvvmnewsapp.utils.Resource<com.androiddevs.mvvmnewsapp.model.NewsResponse>> getBreakingNews() {
        return null;
    }
    
    public final int getBreakingNewsPage() {
        return 0;
    }
    
    public final void setBreakingNewsPage(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.androiddevs.mvvmnewsapp.model.NewsResponse getBreakingNewsResponse() {
        return null;
    }
    
    public final void setBreakingNewsResponse(@org.jetbrains.annotations.Nullable()
    com.androiddevs.mvvmnewsapp.model.NewsResponse p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.androiddevs.mvvmnewsapp.utils.Resource<com.androiddevs.mvvmnewsapp.model.NewsResponse>> getSearchNews() {
        return null;
    }
    
    public final int getSearchNewsPage() {
        return 0;
    }
    
    public final void setSearchNewsPage(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.androiddevs.mvvmnewsapp.model.NewsResponse getSearchNewsResponse() {
        return null;
    }
    
    public final void setSearchNewsResponse(@org.jetbrains.annotations.Nullable()
    com.androiddevs.mvvmnewsapp.model.NewsResponse p0) {
    }
    
    public final void getBreakingNews(@org.jetbrains.annotations.NotNull()
    java.lang.String countryCode) {
    }
    
    public final void searchNews(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery) {
    }
    
    private final com.androiddevs.mvvmnewsapp.utils.Resource<com.androiddevs.mvvmnewsapp.model.NewsResponse> handleBreakingNewResponse(retrofit2.Response<com.androiddevs.mvvmnewsapp.model.NewsResponse> response) {
        return null;
    }
    
    private final com.androiddevs.mvvmnewsapp.utils.Resource<com.androiddevs.mvvmnewsapp.model.NewsResponse> handleSearchNewResponse(retrofit2.Response<com.androiddevs.mvvmnewsapp.model.NewsResponse> response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job saveArticle(@org.jetbrains.annotations.NotNull()
    com.androiddevs.mvvmnewsapp.model.Article article) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.androiddevs.mvvmnewsapp.model.Article>> getSaveNews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteArticle(@org.jetbrains.annotations.NotNull()
    com.androiddevs.mvvmnewsapp.model.Article article) {
        return null;
    }
    
    private final boolean hasInternetConnection() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.androiddevs.mvvmnewsapp.repository.NewsRepository getNewsRepository() {
        return null;
    }
    
    public NewsViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.NotNull()
    com.androiddevs.mvvmnewsapp.repository.NewsRepository newsRepository) {
        super(null);
    }
}