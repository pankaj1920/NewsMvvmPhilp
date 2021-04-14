package com.androiddevs.mvvmnewsapp.ui.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.androiddevs.mvvmnewsapp.R
import com.androiddevs.mvvmnewsapp.model.Article
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class BreakingNewsFragmentDirections private constructor() {
  private data class ActionBreakingNewsFragment2ToArticleFragment(
    public val article: Article
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_breakingNewsFragment2_to_articleFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(Article::class.java)) {
        result.putParcelable("article", this.article as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(Article::class.java)) {
        result.putSerializable("article", this.article as Serializable)
      } else {
        throw UnsupportedOperationException(Article::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  public companion object {
    public fun actionBreakingNewsFragment2ToArticleFragment(article: Article): NavDirections =
        ActionBreakingNewsFragment2ToArticleFragment(article)
  }
}
