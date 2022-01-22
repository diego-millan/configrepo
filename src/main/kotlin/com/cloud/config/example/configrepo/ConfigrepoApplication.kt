package com.cloud.config.example.configrepo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class ConfigrepoApplication

fun main(args: Array<String>) {
	runApplication<ConfigrepoApplication>(*args)
}
