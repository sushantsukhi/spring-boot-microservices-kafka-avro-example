package com.happycoding.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	@Value("${topic.id}")
	private String topicId;

	public void send(String message, String value) {
		kafkaTemplate.send(topicId, value);
	}
	
}