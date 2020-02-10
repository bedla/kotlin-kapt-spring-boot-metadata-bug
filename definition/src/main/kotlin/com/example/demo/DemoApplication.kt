package com.example.demo

import bar.FooProperties
import bar.MyProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(*[
    FooProperties::class,
    BarProperties::class,
    OAuth::class,
    OAuth2::class,
    OAuth3::class,
    OAuth4::class,
    OAuth5::class,
    MyProperties::class
])
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
