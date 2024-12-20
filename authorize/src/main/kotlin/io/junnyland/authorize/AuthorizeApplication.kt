package io.junnyland.authorize

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AuthorizeApplication

fun main(args: Array<String>) {
    runApplication<AuthorizeApplication>(*args)
}
