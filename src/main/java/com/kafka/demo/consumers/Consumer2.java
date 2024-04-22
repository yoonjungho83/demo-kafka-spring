package com.kafka.demo.consumers;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Consumer2 {

	
	@KafkaListener(topics = "topic2", groupId = "grp-demo2")
	public void listenerTopic2(Object data) {
		ConsumerRecord r = (ConsumerRecord) data;
		log.info("[Consumer2 listenerTopic2] data = {}",data);
		log.info("[Consumer2 listenerTopic2] msg = {}",r.value());
	}
}
