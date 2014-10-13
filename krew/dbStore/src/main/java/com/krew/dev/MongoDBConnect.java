package com.krew.dev;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class MongoDBConnect {
	
	private static MongoDBConnect instance;
	private MongoClient _mongoClient;
	private DB _monDB;
	private DBCollection _monCollection;
	
	public static MongoDBConnect getInstance() {
		if(instance == null) {
			return new MongoDBConnect();
		} else {
			return instance;
		}
	}
	
	private MongoDBConnect() {
		try {
			this._mongoClient = new MongoClient( "localhost" , 27017 );
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setDB(String dbName) {
		this._monDB = this._mongoClient.getDB(dbName);
	}
	
	public void setCollection(String collection) {
		this._monCollection = this._monDB.getCollection(collection);
	}
	
	
	
}
