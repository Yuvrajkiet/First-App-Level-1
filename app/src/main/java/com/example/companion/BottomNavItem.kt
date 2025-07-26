package com.example.companion

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Chat
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(val route: String, val icon: ImageVector, val label: String) {
    object Home : BottomNavItem("home", Icons.Filled.Home, "Home")
    object Timetable : BottomNavItem("timetable", Icons.Filled.DateRange, "Timetable")
    object Assignments : BottomNavItem("assignments", Icons.AutoMirrored.Filled.List, "Assignments")
    object Chat : BottomNavItem("chat", Icons.AutoMirrored.Filled.Chat, "Chat")
    object Profile : BottomNavItem("profile", Icons.Filled.Person, "Profile")
}
