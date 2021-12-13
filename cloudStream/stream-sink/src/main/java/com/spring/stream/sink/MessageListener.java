package com.spring.stream.sink;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MessageListener {

	
	@StreamListener(Sink.INPUT)
	public void log(Message<String> greet) {
		log.info("received " + greet);
	}
}
