package mx.edu.tesoem.isc.eijd.t1eijd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText operacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operacion=(EditText) findViewById(R.id.txtOpc);
    }
    public void seleccion(View v)
    {
        switch (operacion.getText().toString())
        {
            case "1":
                Intent opcSuma=new Intent(this, suma.class);
                startActivity(opcSuma);
                finish();
                break;
            case "2":
                Intent opcResta=new Intent(this, resta.class);
                startActivity(opcResta);
                finish();
                break;
            case "3":
                Intent opcMult=new Intent(this, multiplicacion.class);
                startActivity(opcMult);
                finish();
                break;
            case "4":
                Intent opcDiv=new Intent(this, division.class);
                startActivity(opcDiv);
                finish();
                break;
            default:
                Toast toast = Toast.makeText(this, "Opcion Invalida", Toast.LENGTH_SHORT);
                toast.show();
                break;
        }
    }
}
