package monsh.com.lista;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by monsh on 11/08/2016.
 */
public class PaisesAdapter extends ArrayAdapter<Paises> {

    //Esta clase es el adaptador de paises

    //Contex: Se utiliza en el momento que nos solicitan colocarlo
    // layoutResourceId: Que nos va a ayudar a colocar el recurso que deseamos
    // datos[]: Conjunto de datos de tipo "paises"

    Context context;
    int layoutResourceId;
    Paises datos[] = null;

    //Definimos un constructor en el que recibimos los 2 elementos anteriores que definimos
    //y los asignamos a nuestro elemento

    public PaisesAdapter(Context context, int layoutResourceId, Paises[] datos) {
        super(context, layoutResourceId, datos);

        this.context = context;
        this.layoutResourceId = layoutResourceId;
        this.datos = datos;

    }
    //Tenemos una vista la cual iremos llenando con los elementos que vamos recibiendo
    //Nos ayudamos de LayoutInflater que nos permite ir colocando los elementos que recibimos en uno solo
    //para mas adelante tener todos juntos y poderlos desplegar como una lista.


    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        PaisesHolder holder = null;

        if (row == null) {

            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new PaisesHolder();

            holder.imagen = (ImageView) row.findViewById(R.id.imagen);
            holder.texto = (TextView) row.findViewById(R.id.tv_texto);

            row.setTag(holder);

        } else {

            holder = (PaisesHolder) row.getTag();

        }

        Paises paises = datos[position];
        holder.texto.setText(paises.pais);
        holder.imagen.setImageResource(paises.icon);

        return row;
    }

    static class PaisesHolder {
        ImageView imagen;
        TextView texto;
    }


}
