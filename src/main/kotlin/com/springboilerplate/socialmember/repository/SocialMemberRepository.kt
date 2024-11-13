package com.springboilerplate.socialmember.repository


import com.springboilerplate.common.type.OAuth2Provider
import com.springboilerplate.socialmember.entity.SocialMember
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface SocialMemberRepository : CrudRepository<SocialMember, Long> {

    fun findByProviderAndProviderId(kakao: OAuth2Provider, id: String): SocialMember?
}