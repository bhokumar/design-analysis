package com.example.tutorial.configs;

import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import com.mongodb.client.MongoClient;

public class MongoConfig extends AbstractMongoClientConfiguration {

	@Override
	public MongoClient mongoClient() {
		
		return  null;
	}

	@Override
	protected String getDatabaseName() {
		return "tuturial-db";
	}

}
