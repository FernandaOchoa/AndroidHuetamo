package monsh.com.demo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//Inicio de actividad, que extiende de la clase de compatibilidad
public class MainActivity extends AppCompatActivity {

    //Crear mis variables de Instancia
    private EditText mail;
    private EditText pass;
    private Button send;


    //Cuando la actividad se crea
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView asocio la vista con el controlador
        setContentView(R.layout.activity_main);

        //Asocio la vista con mi variable de instancia
        mail = (EditText) findViewById(R.id.edt_mail);
        pass =(EditText) findViewById(R.id.edt_pass);
        send = (Button) findViewById(R.id.btn_send);

        //Agrego mi escuchador de click al boton
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email, password;

                email = mail.getText().toString();
                password = pass.getText().toString();

                Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
                intent.putExtra("Mail",email);
                intent.putExtra("Pass", password);

                startActivity(intent);

               Toast.makeText(getApplicationContext(),"Yo soy un mensajito "+email+ " "+ password,Toast.LENGTH_LONG).show();
            }
        });
    }
}
