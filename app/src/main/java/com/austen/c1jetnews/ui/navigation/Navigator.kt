package com.austen.c1jetnews.ui.navigation

import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey


data class PopUpTo(val navKey: NavKey, val inclusive: Boolean = false)


class Navigator(val state: NavigationState) {


    val currentStack: NavBackStack<NavKey>
        get() = state.backStacks[state.topLevelKey]
            ?: error("Stack for ${state.topLevelKey} not found")


    val currentKey: NavKey
        get() = currentStack.last()

    fun navigate(navKey: NavKey, popUpTo: PopUpTo? = null) {
        if (navKey in state.topLevelKeys) {
            state.topLevelKey = navKey
        }

        if (currentKey == navKey && popUpTo == null) return

        if (popUpTo != null) {
            val index = currentStack.indexOfLast { it == popUpTo.navKey }
            if (index != -1) {
                val fromIndex = if (popUpTo.inclusive) index else index + 1
                if (fromIndex < currentStack.size) {
                    currentStack.subList(fromIndex, currentStack.size).clear()
                }
            }
        }

        if (navKey !in state.topLevelKeys && currentKey != navKey) {
            currentStack.add(navKey)
        }
    }


    fun goUp(){
        if (currentKey == state.topLevelKey){
            state.topLevelKey = state.primaryTopLevelKey
        }else{
            currentStack.removeLastOrNull()
        }
    }

}