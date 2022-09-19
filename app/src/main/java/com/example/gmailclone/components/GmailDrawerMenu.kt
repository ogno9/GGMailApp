package com.example.gmailclone.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import model.DrawerMenuData

@Composable
fun GmailDrawerMenu(scrollState: ScrollState){

    val menuList = listOf(
        DrawerMenuData.Divider,
        DrawerMenuData.AllInboxes,
        DrawerMenuData.Divider,
        DrawerMenuData.HeaderOne, // All Labels
        DrawerMenuData.Primary,
        DrawerMenuData.Snoozed,
        DrawerMenuData.Important,
        DrawerMenuData.Chats,
        DrawerMenuData.Sent,
        DrawerMenuData.Drafts,
        DrawerMenuData.Spam,
        DrawerMenuData.Trash,
        DrawerMenuData.Categories,
        DrawerMenuData.Social,
        DrawerMenuData.Promotions,
        DrawerMenuData.HeaderTwo, // Google Apps
        DrawerMenuData.Starred,
        DrawerMenuData.Contacts,
        DrawerMenuData.Settings,
        DrawerMenuData.Calendar,
        DrawerMenuData.Help
    )

    Column(Modifier.verticalScroll(scrollState)) {
        Text("Gmail", color = Color.Red,
            modifier = Modifier.padding(start = 20.dp, top = 20.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold)
        menuList.forEach{
            item ->
            
            when{
                item.isDivider ->{
                    Divider(modifier = Modifier.padding(bottom = 20.dp, top = 20.dp))
                }
                item.isHeader ->{
                    Text(text = item.title!!, fontWeight = FontWeight.Light,
                         modifier =  Modifier.padding(start = 20.dp, bottom = 20.dp,
                             top = 20.dp))
                }else ->{
                MailDrawerItem(item = item)
                }
            }

        }
    }
}



@Composable
fun MailDrawerItem(item: DrawerMenuData){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(top = 16.dp)
    ){
        Image(imageVector = item.icon!!, 
              contentDescription = item.title!!, 
              modifier = Modifier.weight(0.5f)
        )
        Text(text = item.title, modifier = Modifier.weight(2.0f))
    }
}