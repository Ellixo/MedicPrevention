package projetindus.medicprevention;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

import org.bson.Document;

import java.util.Iterator;
import java.util.Set;


public class DbConnection {

   /* MongoClientURI uri = new MongoClientURI( "mongodb://Ellyn:Peau2Lours@ds045785.mongolab.com:45785/medic" );
    MongoClient mongoClient = new MongoClient(uri);
    MongoDatabase db = mongoClient.getDatabase(uri.getDatabase());


    public MongoDatabase getDb() {
        return db;
    }

    public void addTruc ()
    {
        Document document = new Document("nom", "truc");
        db.getCollection("users").insertOne(document);
    }
    public void addUser(String ident, String mdp, String nom, String prenom, String naissance, boolean femme, String taille, String poids) {
        char sexe = 'h';
        if (femme) sexe='f';

        Document document = new Document();
        document.append("id",ident);
        document.append("mdp",mdp);
        document.append("nom",nom);
        document.append("prenom",prenom);
        document.append("naissance",naissance);
        document.append("sexe",sexe);
        document.append("taille",taille);
        document.append("poids",poids);

        db.getCollection("users").insertOne(document);
    }

    public String getDBName() {

        return "medic";
    }

*/
}

