package com.lynexsoft.iggloo.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform