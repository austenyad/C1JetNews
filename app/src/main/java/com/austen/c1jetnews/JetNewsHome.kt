package com.austen.c1jetnews

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
fun JetNewHome(modifier: Modifier = Modifier) { // 外部 modifier 确定 当前组件在 父组件中的 ：大小、位置
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    ModalNavigationDrawer(
        modifier = modifier,
        drawerState = drawerState,
        drawerContent = {
            HomeDrawerContent()
        }) {
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
                        .padding(horizontal = 15.dp)
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
                items(100) {
                    NewItem()
                }
            }
        }
    }


}



