package com.project.tuk_talkunderstandknow

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform