package com.austen.c1jetnews.ui.home

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import com.austen.c1jetnews.AppDrawer
import com.austen.c1jetnews.HomeTopbar
import com.austen.c1jetnews.NewItem
import com.austen.c1jetnews.PopularSection
import com.austen.c1jetnews.PostCardHistory
import com.austen.c1jetnews.TopNewItem
import com.austen.c1jetnews.ui.navigation.NAVIGATION_ITEM
import kotlinx.coroutines.launch
import kotlinx.serialization.Serializable

@Serializable
data object HomeKey : NavKey


fun EntryProviderScope<NavKey>.homeEntry(){
    entry<HomeKey>{
        HomeScreen()
    }
}


@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerContent = {
            AppDrawer(
                navigate = {},
                closeDrawer = {},
                navigationItems = NAVIGATION_ITEM,
                drawerState = drawerState,
                currentTopLevelKey = HomeKey
            )
        },
        drawerState = drawerState,
    ) {
        Scaffold(
            topBar = {
                HomeTopbar(onDrawer = {
                    if (drawerState.isOpen) {
                        scope.launch {
                            drawerState.close()
                        }
                    } else {
                        scope.launch {
                            drawerState.open()
                        }
                    }
                })
            }
        ) { innerPadding ->
            LazyColumn(
                modifier =
                    Modifier
                        .padding(innerPadding)

            ) {
                item {
                    TopNewItem()
                }
                items(3) {
                    NewItem()
                }
                item {
                    PopularSection()
                }
                items(3) {
                    PostCardHistory()
                }
            }
        }
    }
}