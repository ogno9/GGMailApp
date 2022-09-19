package model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class DrawerMenuData (
    val icon: ImageVector? = null, val title: String? = null,
    val isDivider: Boolean = false, val isHeader: Boolean = false,
    ){
    object AllInboxes: DrawerMenuData(
        icon = Icons.Outlined.AllInbox,
        title = "All Inboxes"
    )
    object Primary: DrawerMenuData(
        icon = Icons.Outlined.Inbox,
        title = "Primary"
    )
    object Social: DrawerMenuData(
        icon = Icons.Outlined.Person,
        title = "Social"
    )
    object Starred: DrawerMenuData(
        icon = Icons.Outlined.StarOutline,
        title = "Starred"
    )
    object Contacts: DrawerMenuData(
        icon = Icons.Outlined.Contacts,
        title = "Contacts"
    )
    object Settings: DrawerMenuData(
        icon = Icons.Outlined.Settings,
        title = "Settings"
    )
    object Help: DrawerMenuData(
        icon = Icons.Outlined.Help,
        title = "Help & Feedback"
    )
    object Promotions: DrawerMenuData(
        icon = Icons.Outlined.Tag,
        title = "Promotions"
    )
    object Snoozed: DrawerMenuData(
        icon = Icons.Outlined.Snooze,
        title = "Snoozed"
    )
    object Important: DrawerMenuData(
        icon = Icons.Outlined.StarOutline,
        title = "Starred"
    )
    object Calendar: DrawerMenuData(
        icon = Icons.Outlined.CalendarToday,
        title = "Calendar"
    )
    object Divider : DrawerMenuData(
        isDivider = true
    )
    object HeaderOne : DrawerMenuData(
        isHeader = true,
        title = "ALL LABELS"
    )
    object HeaderTwo : DrawerMenuData(
        isHeader = true,
        title = "GOOGLE APPS"
    )
    object Drafts : DrawerMenuData(
        icon = Icons.Outlined.Drafts,
        title = "Drafts"
    )
    object Sent : DrawerMenuData(
        icon = Icons.Outlined.AirplaneTicket,
        title = "Sent"
    )
    object Chats : DrawerMenuData(
        icon = Icons.Outlined.Chat,
        title = "Chats"
    )
    object Spam : DrawerMenuData(
        icon = Icons.Outlined.Stop,
        title = "Spam"
    )
    object Trash : DrawerMenuData(
        icon = Icons.Outlined.RestoreFromTrash,
        title = "Trash"
    )
    object Categories : DrawerMenuData(
        icon = Icons.Outlined.Category,
        title = "Categories"
    )


}