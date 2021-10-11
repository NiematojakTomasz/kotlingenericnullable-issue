package com.example

import kotlinx.serialization.Serializable

@Serializable
class B(
    val a: A<String?, Unit>
)