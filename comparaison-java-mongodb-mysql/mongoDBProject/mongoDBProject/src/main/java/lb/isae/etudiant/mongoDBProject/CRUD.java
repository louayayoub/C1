/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lb.isae.etudiant.mongoDBProject;
import java.util.List;
import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;
import java.util.Iterator;
/**
 *
 * @author unknow
 */
public class CRUD {
   
   private final static String HOST = "localhost";
   private final static int  PORT = 27017;
   private final static String DATABASE = "RealmCLI";
   private MongoClient mongoClient;
   private  MongoDatabase db;
   
   public CRUD() {
     try {
         //crate connection to mongoDB
          mongoClient = new MongoClient(new ServerAddress(HOST, PORT));
          
          // get database 
          // if database doesn't exists, mongodb will create it
          db =  mongoClient.getDatabase(DATABASE);
      }catch (Exception ex) {
         System.out.println(ex.getMessage());
      }
  
   }
   
   //Create user with name and password
   public void create(String name, String pass) {
      try {
         db.getCollection("users").insertOne(new Document()
         .append("UserName", name).append("Password", pass));
      } catch (Exception ex) {
         System.out.println(ex.getMessage());
      }
   }

   //Create user with name , password and description
   public void create(String name, String pass ,String desc) {
      try {
         db.getCollection("users").insertOne(new Document()
         .append("UserName", name).append("Password", pass).append("description", desc));
      } catch (Exception ex) {
         System.out.println(ex.getMessage());
      }
   }
   
   //Create user with name , password , description and roles
   public void create(String name, String pass, String desc,
         List<String> role) {
      try {
         db.getCollection("users").insertOne(new Document()
         .append("UserName", name).append("Password", pass)
         .append("description", desc).append("UserRole", role));
      } catch (Exception ex) {
         System.out.println(ex.getMessage());
      }
   }

   //show all users
   public void viewAll() {
      try {
  
          FindIterable<Document> iter = db.getCollection("users").find();
          Iterator iterator = iter.iterator();
          while(iterator.hasNext())
          {
            Document result = (Document) iterator.next();
            System.out.println(result);
          }

      } catch (Exception ex) {
          System.out.println(ex.getMessage());
      }
   }
   
   //update the role of user by name 
   public void updateRole(String name, List<String> role) {

      try {
         db.getCollection("users")
         .updateOne(new Document("UserName", name),
         new Document("$set", new Document("category", role)));

      } catch (Exception ex) {
         System.out.println(ex.getMessage());
      }
   }

   //delete user by name
   public void deleteUser(String name) {

      try {
         db.getCollection("users")
         .deleteOne(new Document("UserName", name));

      } catch (Exception ex) {
         System.out.println(ex.getMessage());
      }
    }

}
