package com.akirachix.blogreader

import android.graphics.drawable.Drawable


data class Article(
    val author: String,
    val authorProfilePicture: String,
    val title: String,
    val publishingDate: String,
    val articlePreview: String,
    val articlePhoto:String,
    val fullPostLink: String
)

