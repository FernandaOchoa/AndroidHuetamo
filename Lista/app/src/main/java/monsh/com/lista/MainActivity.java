package monsh.com.lista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Declaro mi lista
     private ListView ls;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declaro y relleno mi lista
        Paises paises_datos[] = new Paises[]{
                new Paises (R.mipmap.ic_item,"Mexico"),
                new Paises(R.mipmap.ic_item,"USA"),
                new Paises(R.mipmap.ic_item,"China"),
                new Paises(R.mipmap.ic_item,"Israel"),
                new Paises(R.mipmap.ic_item,"Australia"),
                new Paises(R.mipmap.ic_item,"Alemania"),
                new Paises(R.mipmap.ic_item,"Corea"),
                new Paises(R.mipmap.ic_item,"Francia"),
                new Paises(R.mipmap.ic_item,"Italia"),
                new Paises(R.mipmap.ic_item,"Sudafrica"),
                new Paises(R.mipmap.ic_item,"Kasajistan"),
                new Paises (R.mipmap.ic_item,"Mexico"),
                new Paises(R.mipmap.ic_item,"USA"),
                new Paises(R.mipmap.ic_item,"China"),
                new Paises(R.mipmap.ic_item,"Israel"),
                new Paises(R.mipmap.ic_item,"Australia"),
                new Paises(R.mipmap.ic_item,"Alemania"),
                new Paises(R.mipmap.ic_item,"Corea"),
                new Paises(R.mipmap.ic_item,"Francia"),
                new Paises(R.mipmap.ic_item,"Italia"),
                new Paises(R.mipmap.ic_item,"Sudafrica"),
                new Paises(R.mipmap.ic_item,"Kasajistan"),
        };

        //Al adaptador le paso el contenido del arreglo lleno
        PaisesAdapter adapter = new PaisesAdapter(this,R.layout.row,paises_datos);

        //Me traigo la lista y la enlazo a la vista, ademas asigno el adaptador lleno
        ls = (ListView)findViewById(R.id.ls);
        ls.setAdapter(adapter);

        //Escucho los eventos en los items (elementos de la lista)
        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id) {
                TextView t = (TextView)arg1.findViewById(R.id.tv_texto);
                Toast.makeText(getApplicationContext(),t.getText()+" "+position,Toast.LENGTH_SHORT).show();
            }
        });

    }
}
