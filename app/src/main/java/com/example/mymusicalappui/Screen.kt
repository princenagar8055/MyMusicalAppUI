package com.example.mymusicalappui

import android.graphics.drawable.Icon
import androidx.annotation.DrawableRes

sealed class Screen (val title: String , val route: String) {

    sealed class DrawerScreen (val dTitle: String , val dRoute: String , @DrawableRes val icon: Int)
        : Screen(dTitle,dRoute){
        object Account: DrawerScreen(
            "ACCOUNT",
            "account",
            R.drawable.baseline_account_balance_24
        )
        object Subscription: DrawerScreen(
            "SUBSCRIPTION",
            "subscribe",
            R.drawable.outline_music_cast_24
        )
        object AddAccount:  DrawerScreen(
            "ADD ACCOUNT",
            "add_account",
            R.drawable.outline_person_add_24
        )
        object About: DrawerScreen(
            "ABOUT US",
            "about",
            R.drawable.outline_description_24

        )
    }

}

val screensInDrawer = listOf(
      Screen.DrawerScreen.Account,
      Screen.DrawerScreen.AddAccount,
      Screen.DrawerScreen.Subscription,
      Screen.DrawerScreen.About

)