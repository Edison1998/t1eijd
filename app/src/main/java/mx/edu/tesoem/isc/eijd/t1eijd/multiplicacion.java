package mx.edu.tesoem.isc.eijd.t1eijd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class multiplicacion extends AppCompatActivity {
    EditText num1,num2;
    TextView resultado;
    float numero1,numero2,numero3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicacion);
        num1=(EditText) findViewById(R.id.n1);
        num2=(EditText) findViewById(R.id.n2);
    }
    public void resolver(View v)
    {
        if((num1.getText().toString().equals(""))&&(num2.getText().toString().equals("")))
        {
            resultado=(TextView) findViewById(R.id.txtRes);
            num1.setText("0.0");
            num2.setText("0.0");
            resultado.setText("Resultado: 0");
        }
        else if((num1.getText().toString().equals(""))&&(!num2.getText().toString().equals("")))
        {
            resultado=(TextView) findViewById(R.id.txtRes);
            resultado.setText("Resultado: 0");
        }
        else if((num2.getText().toString().equals(""))&&(!num1.getText().toString().equals("")))
        {
            resultado=(TextView) findViewById(R.id.txtRes);
            resultado.setText("Resultado: 0");
        }
        else
        {
            numero1=Float.parseFloat(num1.getText().toString());
            numero2=Float.parseFloat(num2.getText().toString());
            numero3=numero1*numero2;
            resultado=(TextView) findViewById(R.id.txtRes);
            resultado.setText("Resultado: "+numero3);
        }
    }
    public void menu(View v)
    {
        Intent menu=new Intent(this,MainActivity.class);
        startActivity(menu);
        finish();
    }
}
