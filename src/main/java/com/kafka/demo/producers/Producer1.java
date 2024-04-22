package com.kafka.demo.producers;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.kafka.demo.model.MsgDto;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class Producer1 {

	private final KafkaTemplate<String, Object> kafkaTemplate;


    public void create(MsgDto msgDto) {
        kafkaTemplate.send(msgDto.getTopic(), msgDto.getMsg());
    }
}
