package com.dadachen.epublib

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}