package com.example.mymusicalappui

import androidx.annotation.DrawableRes

data class Lib(@DrawableRes val icon: Int,val name: String)

    val libraries = listOf<Lib>(
        Lib(R.drawable.ic_playlist,"PLAYLIST"),
        Lib(R.drawable.ic_mic,"ARTIST"),
        Lib(R.drawable.ic_album,"ALBUM"),
        Lib(R.drawable.ic_song,"SONGS"),
        Lib(R.drawable.ic_genre,"GENRE")
    )

