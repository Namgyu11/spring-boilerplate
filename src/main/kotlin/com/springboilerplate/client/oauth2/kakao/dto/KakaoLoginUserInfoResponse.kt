package com.springboilerplate.client.oauth2.kakao.dto

import com.example.oauth2login.client.oauth2.OAuth2LoginUserInfo
import com.example.oauth2login.client.oauth2.kakao.dto.KakaoUserPropertiesResponse
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import com.springboilerplate.common.type.OAuth2Provider

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
class KakaoLoginUserInfoResponse(
    id: Long,
    properties: KakaoUserPropertiesResponse
) : OAuth2LoginUserInfo(
    provider = OAuth2Provider.KAKAO,
    id = id.toString(),
    nickname = properties.nickname
)