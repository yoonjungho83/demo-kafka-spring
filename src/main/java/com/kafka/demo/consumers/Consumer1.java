package com.kafka.demo.consumers;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Consumer1 {

	
	@KafkaListener(topics = "topic1", groupId = "grp-demo1")
    public void listenerTopic1(Object data) {
		log.info("[Consumer1 listenerTopic1] data = {}",data);
    }
	@KafkaListener(topics = "topic2", groupId = "grp-demo1")
	public void listenerTopic2(Object data) {
		ConsumerRecord r = (ConsumerRecord) data;
		log.info("[Consumer1 listenerTopic2] data = {}",data);
		log.info("[Consumer1 listenerTopic2] msg = {}",r.value());
	}
}
