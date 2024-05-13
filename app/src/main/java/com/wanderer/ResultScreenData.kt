package com.wanderer

data class Bus(
    val name: String,
    val stops: List<String>
)
data class Stop(
    val name: String,
    val busName: String
)


