package me.naingaungluu.jetpackcomposedemo.ui.screens.home

sealed class MenuAction {
    object ListViewDemo : MenuAction()
    object InteroperabilityDemo : MenuAction()
    object StateManagementDemo : MenuAction()
}

data class MenuItem(
    val name : String,
    val action : MenuAction
)
