package com.example.klocktest

import com.soywiz.klock.DateTimeTz

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }

    fun time(): DateTimeTz {
        return DateTimeTz.nowLocal()
    }
}