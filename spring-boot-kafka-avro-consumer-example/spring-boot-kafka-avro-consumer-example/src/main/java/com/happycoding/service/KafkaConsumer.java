package com.happycoding.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	@Autowired
	private MongoTemplate mongoTemplate;

	@KafkaListener(topics = "#{'${topic.id}'}", containerFactory = "kafkaListenerContainerFactory")
	public void consumeJson(String value) {
		//System.out.println("Consumed JSON key:" + key);
		// System.out.println("Consumed JSON partition:" + partition);
		// System.out.println("Consumed JSON topic:" + topic);
		System.out.println("Consumed JSON Message:" + value);
	}
}