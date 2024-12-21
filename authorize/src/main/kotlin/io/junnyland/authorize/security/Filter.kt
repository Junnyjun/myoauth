import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.web.SecurityFilterChain

@Configuration
class Filter{

    @Bean
    fun filterChain:SecurityFilterChain(http:Http)
}