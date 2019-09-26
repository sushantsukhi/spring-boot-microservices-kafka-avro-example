package com.happycoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.happycoding.service.KafkaProducer;

@RestController
public class ProviderResource {

	@Autowired
	KafkaProducer kafkaProducer;

	@GetMapping(value = "kafka-example")
	public String producer(@RequestParam("value") String value) {
		kafkaProducer.send("", value);
		return "Message sent to the Kafka Topic java_in_use_topic Successfully";
	}

}