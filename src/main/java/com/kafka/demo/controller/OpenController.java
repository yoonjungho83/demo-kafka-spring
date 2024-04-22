package com.kafka.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.demo.model.MsgDto;
import com.kafka.demo.producers.Producer1;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/kafka")
@RequiredArgsConstructor
public class OpenController {

	private final Producer1 poroducer1;
	

	/**
	 * @param messageDto
	 * kafka producer 
	 */
	@PostMapping("/sendMsg")
     public String sendMsg(@RequestBody MsgDto  msgDto) {
         log.info("sendMsg : {}" , msgDto);
         poroducer1.create(msgDto);
         
         return msgDto.getTopic() + " = " + msgDto.getMsg();
    }
}
