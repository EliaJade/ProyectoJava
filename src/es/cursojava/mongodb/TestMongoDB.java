package es.cursojava.mongodb;
import org.bson.Document;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class TestMongoDB {
	
	public static void main(String[]args) {
	
		// Replace the placeholder with your Atlas connection string
        String uri = "mongodb+srv://eliajadesmith23:1k6LBtqDEvY3Cz5b@cluster0.zmj2dxd.mongodb.net/?appName=Cluster0";
        // Construct a ServerApi instance using the ServerApi.builder() method
        ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(uri))
                .serverApi(serverApi)
                .build();
        // Create a new client and connect to the server
        System.out.println("Connecting to MongoDB...");
        try (MongoClient mongoClient = MongoClients.create(settings)) {
            try {
                // Send a ping to confirm a successful connection

                MongoDatabase database = mongoClient.getDatabase("getafemongodb");
//                Bson command = new BsonDocument("ping", new BsonInt64(1));
//                Document commandResult = database.runCommand(command);
                Document commandResult = database.runCommand(new Document("ping", 1));
                System.out.println("Pinged your deployment. You successfully connected to MongoDB!");
                System.out.println("Result: " + commandResult.toJson());
                
                
                Document doc1 = new Document();
                doc1.append("nombre", "Juan");
                doc1.append("apellido", "Perez");
                
                database.getCollection("personas").insertOne(doc1);
                
            } catch (MongoException e) {
            	System.err.println("MongoDB ping failed: " + e.getMessage());
            }
        }
    }
	
}
