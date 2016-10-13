package dao;

import java.io.File;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

import util.Constants;

public class Connector {
	
	public GraphDatabaseFactory dbFactory;
	public GraphDatabaseService db;
	 
	
	public void Conect() {
		dbFactory = new GraphDatabaseFactory();
		db = dbFactory.newEmbeddedDatabase(new File(Constants.urlN4eoj));

	}

	
}
