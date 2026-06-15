package com.austen.c1jetnews.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.scene.rememberSceneState
import androidx.navigation3.ui.NavDisplay
import com.austen.c1jetnews.ui.home.HomeKey
import com.austen.c1jetnews.ui.home.homeEntry
import com.austen.c1jetnews.ui.interests.InterestsKey
import com.austen.c1jetnews.ui.interests.interestsEntry
import com.austen.c1jetnews.ui.navigation.NavigationState
import com.austen.c1jetnews.ui.post.postEntry


@Composable
fun rememberNavigationState(
    primaryTopLevelKey: NavKey,
    topLevelKeys: Set<NavKey>,
    initialBackStack: List<NavKey>
): NavigationState {
    val initialTopLevelKey = initialBackStack.first()
    val topLevelKey = remember { mutableStateOf(initialTopLevelKey) }

    val backStacks = remember { mutableMapOf<NavKey, NavBackStack<NavKey>>() }
    // primaryTopLevelKey:NavKey
    // topLevelKey: MutableState<NavKey>
    // topLevelKeys:Set<NavKey>
    // backStacks: Map<NavKey, NavBackStack<NavKey>>
    return NavigationState(
        primaryTopLevelKey = primaryTopLevelKey,
        topLevelKey = topLevelKey,
        topLevelKeys = topLevelKeys,
        backStacks = backStacks
    )


}

@Composable
fun JetNewsNavDisplay(modifier: Modifier = Modifier) {
    val navigationState = rememberNavigationState(
        HomeKey,
        setOf(
            HomeKey,
            InterestsKey
        ), listOf(HomeKey)
    )


    val entryProvider = entryProvider {
        homeEntry() // Home UI 入口

        postEntry() // Post 详情 UI 入口

        interestsEntry() // interests UI 入口
    }

    val navEntries = navigationState.toDecoratedEntries(entryProvider)

    val listDetailSceneStrategy = rememberLis

    rememberSceneState(entries = navEntries, sceneStrategies = )

    NavDisplay(
        entries = sceneState,
        entryProvider = entryProvider
    )

}