package com.example.demo

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.boot.context.properties.NestedConfigurationProperty

@ConstructorBinding
@ConfigurationProperties(prefix = "bar")
data class BarProperties(val name: String, val xxx: Int)

data class Client(val name: String)

@ConstructorBinding
@ConfigurationProperties(prefix = "cz.bedla")
data class OAuth(
        @field:NestedConfigurationProperty
        val clients: Map<String, Client>
)

@ConstructorBinding
@ConfigurationProperties(prefix = "cz.bedla2")
data class OAuth2(
        val clients: Map<String, Client>
)

@ConfigurationProperties(prefix = "cz.bedla3")
data class OAuth3 @ConstructorBinding constructor(
        val clients: Map<String, Client>
)

@ConfigurationProperties(prefix = "cz.bedla4")
data class OAuth4 @ConstructorBinding constructor(
        @field:NestedConfigurationProperty
        val clients: Map<String, Client>
)

@ConstructorBinding
@ConfigurationProperties(prefix = "cz.bedla5")
data class OAuth5(
        @NestedConfigurationProperty
        val clients: Map<String, Client>
)

