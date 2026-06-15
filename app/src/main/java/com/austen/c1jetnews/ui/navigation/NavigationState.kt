package com.austen.c1jetnews.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.runtime.NavEntryDecorator
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.rememberDecoratedNavEntries
import androidx.navigation3.runtime.rememberSaveableStateHolderNavEntryDecorator

class NavigationState(
    val primaryTopLevelKey: NavKey,
    topLevelKey: MutableState<NavKey>,
    val topLevelKeys: Set<NavKey>,
    val backStacks: Map<NavKey, NavBackStack<NavKey>>,
) {
    var topLevelKey: NavKey by topLevelKey

    private val currentTopLevelKeys: List<NavKey>
        get() = if (topLevelKey == primaryTopLevelKey) {
            listOf(primaryTopLevelKey)
        } else {
            listOf(primaryTopLevelKey, topLevelKey)
        }


    @Composable
    fun toDecoratedEntries(
        entryProvider: (NavKey) -> NavEntry<NavKey>,
        entryDecorators: List<NavEntryDecorator<NavKey>> = listOf(rememberSaveableStateHolderNavEntryDecorator()),
    ): List<NavEntry<NavKey>> {
        val decoratedEntries = backStacks.mapValues { (_, stack) ->
            rememberDecoratedNavEntries(
                backStack = stack,
                entryProvider = entryProvider,
                entryDecorators = entryDecorators,
            )
        }
        return currentTopLevelKeys
            .flatMap { decoratedEntries[it] ?: emptyList() }
    }


}