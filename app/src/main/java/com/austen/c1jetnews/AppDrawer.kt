package com.austen.c1jetnews

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.DrawerState
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation3.runtime.NavKey
import com.austen.c1jetnews.ui.navigation.NavigationItem

@Composable
fun AppDrawer(
    modifier: Modifier = Modifier,
    drawerState: DrawerState,
    currentTopLevelKey: NavKey,
    navigate: (NavKey) -> Unit,
    navigationItems: List<NavigationItem>,
    closeDrawer: () -> Unit
) {
    ModalDrawerSheet(
        modifier = modifier,
        drawerState = drawerState
    ) {
        JetNewsLogo(modifier = Modifier.padding(horizontal = 28.dp, vertical = 2.dp))
        navigationItems.forEach { navigationItem ->
            key(navigationItem.navKey) {
                NavigationDrawerItem(
                    label = { Text(stringResource(navigationItem.labelResourceId)) },
                    icon = {
                        Icon(
                            painterResource(navigationItem.iconResourceId),
                            contentDescription = null
                        )
                    },
                    selected = currentTopLevelKey == navigationItem.navKey,
                    onClick = {
                        navigate(navigationItem.navKey)
                        closeDrawer()
                    },
                    modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
                )
            }
        }
    }
}


@Composable
private fun JetNewsLogo(modifier: Modifier = Modifier) {
    Row(modifier = modifier) {
        Icon(painterResource(R.drawable.ic_jetnews_logo), contentDescription = null)
        Spacer(Modifier.width(8.dp))
        Image(
            painter = painterResource(R.drawable.ic_jetnews_wordmark),
            contentDescription = null,
            colorFilter = ColorFilter.tint(color = Color.Blue)
        )
    }
}