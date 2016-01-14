package projetindus.medicprevention;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.Manifest.permission.READ_CONTACTS;

/**
 * Page de login via mail & mot de passe
 */
public class LoginActivity extends AppCompatActivity{

    Button bsignin,bsignup;
    EditText mail,pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        bsignin=(Button)findViewById(R.id.button_sign_in);
        mail=(EditText)findViewById(R.id.email);
        pwd=(EditText)findViewById(R.id.password);

        bsignup=(Button)findViewById(R.id.button_sign_up);


        bsignin.setOnClickListener(new View.OnClickListener() {
            // coder la fonction de connection avec la recherche dans la Base de données

           @Override
           public void onClick(View v) {
               startActivity(new Intent(LoginActivity.this, Calendrier.class));
           }
        });

        bsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, SignUp.class));
            }
        });
    }
}

