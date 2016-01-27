package projetindus.medicprevention;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;

public class SignUp extends AppCompatActivity {

    Button bsignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        bsignup=(Button)findViewById(R.id.button_sign_up_save);


        bsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*EditText ident = (EditText) findViewById(R.id.identifiant);
                EditText mdp = (EditText) findViewById(R.id.mdp);
                EditText nom = (EditText) findViewById(R.id.name);
                EditText prenom= (EditText) findViewById(R.id.surname);
                EditText annee = (EditText) findViewById(R.id.birthyear);
                EditText sex = (EditText) findViewById(R.id.femme);
                EditText taille = (EditText) findViewById(R.id.taille);
                EditText poids = (EditText) findViewById(R.id.poids);


                DbConnection db = new DbConnection();
                db.addUser(ident.getText().toString(), mdp.getText().toString(), nom.getText().toString(), prenom.getText().toString(), annee.getText().toString(), sex.isActivated(), taille.getText().toString(),
                        poids.getText().toString());*/
                MongoClientURI uri = new MongoClientURI("mongodb://Ellyn:Password@ds045785.mongolab.com:45785");
                System.out.print(uri.getUsername() + "\n\n");
                MongoClient mongoClient = new MongoClient(uri);
                System.out.print(mongoClient.listDatabaseNames());
                MongoDatabase db = mongoClient.getDatabase("medic");

                System.out.print(db.getName());
                db.createCollection("test");
            }
        });
    }

}
