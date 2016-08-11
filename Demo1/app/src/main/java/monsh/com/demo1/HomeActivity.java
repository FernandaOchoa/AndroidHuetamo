package monsh.com.demo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    //Create my variable instance

    private TextView correo;
    private TextView contrasena;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Asociate views with my instance variables
        correo = (TextView) findViewById(R.id.tv_mail);
        contrasena = (TextView)findViewById(R.id.tv_contra);

        //Create String to hold extras from intent
        String email, password;

        //Creo un objeto de tipo bundle, llamado extras
        Bundle extras  = getIntent().getExtras();
        email =(String) extras.get("Mail");
        password = (String) extras.get("Pass");

        correo.setText(email);
        contrasena.setText(password);


        Toast.makeText(getApplicationContext(),email +  password,Toast.LENGTH_LONG).show();
    }
}
