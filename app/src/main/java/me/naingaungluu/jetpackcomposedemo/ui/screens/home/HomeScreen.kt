package me.naingaungluu.jetpackcomposedemo.ui.screens.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(
    onTapMenuItem: (MenuAction) -> Unit
) {
    val menuList = listOf(
        MenuItem("List View Demo", MenuAction.ListViewDemo),
        MenuItem("Interoperability Demo", MenuAction.InteroperabilityDemo),
        MenuItem("State Management Demo", MenuAction.StateManagementDemo),
    )
    LazyColumn {
        item { 
            Text(
                text = "Jetpack Compose Demo",
                style = MaterialTheme.typography.h6,
                modifier = Modifier.padding(horizontal = 10.dp, vertical = 20.dp)
            )
            Text(
                text = "VarCamp 2022",
                style = MaterialTheme.typography.subtitle2,
                modifier = Modifier.padding(horizontal = 10.dp)
            )
            Spacer(Modifier.height(20.dp))
        }
        items(menuList) { menu ->
            HomeMenuItem(
                menu,
                onTapItem = { onTapMenuItem(it) }
            )
        }
    }
}

@Composable
fun HomeMenuItem(
    menu : MenuItem,
    onTapItem : (MenuAction) -> Unit = {}
) {
    Column(
        Modifier.clickable { onTapItem(menu.action) }
    ) {
        Text(
            text = menu.name,
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth()
        )
        Divider(Modifier.fillMaxWidth())
    }
}

@Preview (showBackground = true)
@Composable
fun PreviewHomeScreen() {
    HomeScreen {}
}
