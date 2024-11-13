package com.example.oauth2login.client.oauth2

import com.springboilerplate.common.type.OAuth2Provider


open class OAuth2LoginUserInfo(
    val provider: OAuth2Provider,
    val id: String,
    val nickname: String
)