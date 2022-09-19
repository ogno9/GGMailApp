package com.example.gmailclone

import model.Account
import model.MailData

val mailList = listOf(
    MailData(
        mailId = 1,
        userName = "Christy",
        subject = "Weekly Android News",
        body = "Hello Roger we have got exciting addition to the android api",
        timeStamp = "20:10"
    ),
    MailData(
        mailId = 2,
        userName = "Bob Sanders",
        subject = "Congratulations!",
        body = "Here is your free prize, collect it now!",
        timeStamp = "20:50"
    ),
    MailData(
        mailId = 3,
        userName = "Harold",
        subject = "Test",
        body = "Test for messaging, test complete",
        timeStamp = "21:10"
    ),
    MailData(
        mailId = 4,
        userName = "Work Foundation",
        subject = "Hiring",
        body = "We are hiring now! Sign up today!",
        timeStamp = "21:40"
    ),
    MailData(
        mailId = 5,
        userName = "John Doe",
        subject = "Hello",
        body = "Nice to meet you, my name is John Doe",
        timeStamp = "22:10"
    ),
    MailData(
        mailId = 6,
        userName = "John Doe",
        subject = "Hello",
        body = "Nice to meet you, my name is John Doe",
        timeStamp = "22:10"
    ),
    MailData(
        mailId = 7,
        userName = "John Doe",
        subject = "Hello",
        body = "Nice to meet you, my name is John Doe",
        timeStamp = "22:10"
    ),
    MailData(
        mailId = 8,
        userName = "John Doe",
        subject = "Hello",
        body = "Nice to meet you, my name is John Doe",
        timeStamp = "22:10"
    ),
    MailData(
        mailId = 9,
        userName = "John Doe",
        subject = "Hello",
        body = "Nice to meet you, my name is John Doe",
        timeStamp = "22:10"
    ),
    MailData(
        mailId = 10,
        userName = "John Doe",
        subject = "Hello",
        body = "Nice to meet you, my name is John Doe",
        timeStamp = "22:10"
    ),
    MailData(
        mailId = 11,
        userName = "John Doe",
        subject = "Hello",
        body = "Nice to meet you, my name is John Doe",
        timeStamp = "22:10"
    ),

)

val accountList = listOf<Account>(
    Account(icon = R.drawable.logo, userName = "Siegesmann",
        email = "siegesmann@gmail.com", unReadMails = 33),
    Account(userName = "Chris Morty", email = "chris@gmail.com", unReadMails = 80),
    Account(userName = "John Doe", email = "johndoe@gmail.com", unReadMails = 99)
)