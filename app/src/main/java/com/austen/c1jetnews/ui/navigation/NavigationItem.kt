package com.austen.c1jetnews.ui.navigation

import androidx.navigation3.runtime.NavKey
import com.austen.c1jetnews.R
import com.austen.c1jetnews.ui.home.HomeKey
import com.austen.c1jetnews.ui.interests.InterestsKey


data class NavigationItem(
    val navKey: NavKey,
    val iconResourceId:Int,
    val iconContentDescriptionResourceId:Int,
    val labelResourceId:Int,
)
val NAVIGATION_ITEM = listOf(
    NavigationItem(
        HomeKey,
        R.drawable.ic_home,
        R.string.cd_navigate_home,
        R.string.home_title
    ),
    NavigationItem(
        InterestsKey,
        R.drawable.ic_list_alt,
        R.string.cd_navigate_interests,
        R.string.interests_title
    )
)