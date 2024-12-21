package io.junnyland.authorize.security

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.Customizer
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer
import org.springframework.security.web.SecurityFilterChain

@Configuration
class Filter{

    @Bean
    fun filterChain(http: HttpSecurity): SecurityFilterChain = http
        .authorizeHttpRequests { it.accessList()}
        .oauth2ResourceServer { oauth -> oauth.jwtSetting() }
        .build()

    private fun AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry.accessList() =
        this.anyRequest().authenticated()

    private fun OAuth2ResourceServerConfigurer<HttpSecurity>.jwtSetting() = this.jwt(Customizer.withDefaults())
}