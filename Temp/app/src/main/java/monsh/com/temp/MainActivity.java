package monsh.com.temp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

   /*
    Formulas (from wikipedia) http://en.wikipedia.org/wiki/Farenheit

    [*C] = ([*F] -32) x 5/9 --> From Fahrenheit to celsius
    [*F] = [*C] x 9/5 + 32 -->From Celsius to Fahrenheit
    */

public class MainActivity extends AppCompatActivity {

    private EditText grados;
    private TextView res;
    private Button f;
    private Button c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grados = (EditText) findViewById(R.id.edt_grados);
        res = (TextView) findViewById(R.id.tv_res);
        f = (Button) findViewById(R.id.btn_far);
        c = (Button) findViewById(R.id.btn_cent);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Call to convertCel

                String editTextVal = grados.getText().toString();
                if (editTextVal.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Introduce un valor", Toast.LENGTH_SHORT).show();
                } else {
                    double doubleEditText = Double.parseDouble(editTextVal);
                    double converterVal = convertToCelsius(doubleEditText);
                    String strRes = String.valueOf(converterVal);

                    res.setText(strRes + "°C");
                }
            }
        });

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Call to convertCel

                String editTextVal = grados.getText().toString();
                if (editTextVal.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Introduce un valor", Toast.LENGTH_SHORT).show();
                } else {
                    double doubleEditText = Double.parseDouble(editTextVal);
                    double converterVal = convertToFarherenheit(doubleEditText);
                    String strRes = String.valueOf(converterVal);

                    res.setText(strRes);
                }
            }
        });
    }

    /*
    Formulas (from wikipedia) http://en.wikipedia.org/wiki/Farenheit

    [*C] = ([*F] -32) x 5/9 --> From Fahrenheit to celsius
    [*F] = [*C] x 9/5 + 32 -->From Celsius to Fahrenheit
    */


    //Create a method to calc to celsius
    // [*F] = [*C] x 9/5 + 32 -->From Celsius to Fahrenheit
    public double convertToCelsius(double farVal) {
        double resultCel;
        resultCel = (farVal - 32) * 5 / 9;
        return resultCel;
    }

    //Create a method to calc to far
    // [*C] = ([*F] -32) x 5/9 --> From Fahrenheit to celsius
    public double convertToFarherenheit(double celVal) {
        double resultFar;
        resultFar = (celVal) * 9 / 5 + 32;
        return resultFar;
    }


}
