package com.springboilerplate.auth.service

import com.springboilerplate.client.oauth2.OAuth2ClientService
import com.example.oauth2login.common.JwtHelper
import com.springboilerplate.common.type.OAuth2Provider
import org.springframework.stereotype.Service

@Service
class OAuth2LoginService(
    private val oAuth2ClientService: OAuth2ClientService,
    private val socialMemberService: SocialMemberService,
    private val jwtHelper: JwtHelper
) {

    fun login(provider: OAuth2Provider, authorizationCode: String): String {
        return oAuth2ClientService.login(provider, authorizationCode)
            .let { socialMemberService.registerIfAbsent(it) }
            .let { jwtHelper.generateAccessToken(user.id!!) }
    }
}