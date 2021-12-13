package com.spring.stream.source;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSourceController {

	@Autowired
	Source source;
	
	@GetMapping("/message")
	public String greet(@PathParam("message") String message) {
		source.output().send(MessageBuilder.withPayload(message).build());
		return "send";
	}
}
