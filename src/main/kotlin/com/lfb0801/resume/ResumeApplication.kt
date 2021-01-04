package com.lfb0801.resume

import com.expediagroup.graphql.spring.operations.Mutation
import com.expediagroup.graphql.spring.operations.Query
import com.expediagroup.graphql.spring.operations.Subscription
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component
import reactor.core.publisher.Flux
import java.time.Duration

@SpringBootApplication
class ResumeApplication

fun main(args: Array<String>) {
	runApplication<ResumeApplication>(*args)
}

@Component
class MyAwesomeQuery : Query {
	fun myAwesomeQuery() = "Query"
}

@Component
class MyAwesomeMutation : Mutation {
	fun myAwesomeMutation(widget: Widget) = widget
}

@Component
class MyAwesomeSubscription : Subscription {
	fun myAwesomeSubscription() = Flux.interval(Duration.ofSeconds(1)).map { "Subsription" }
}

data class Widget(val id: Int, val value: String)