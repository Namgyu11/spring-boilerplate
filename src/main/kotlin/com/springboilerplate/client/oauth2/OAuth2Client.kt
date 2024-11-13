package com.springboilerplate.client.oauth2


import com.example.oauth2login.client.oauth2.OAuth2LoginUserInfo
import com.springboilerplate.common.type.OAuth2Provider

interface OAuth2Client {
    fun generateLoginPageUrl(): String
    fun getAccessToken(authorizationCode: String): String
    fun retrieveUserInfo(accessToken: String): OAuth2LoginUserInfo
    fun supports(provider: OAuth2Provider): Boolean
}