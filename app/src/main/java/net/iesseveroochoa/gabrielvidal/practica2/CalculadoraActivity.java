package net.iesseveroochoa.gabrielvidal.practica2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CalculadoraActivity extends AppCompatActivity {

    TextView tvResultado;

    EditText etNumero1;
    EditText etNumero2;

    Button btSuma;
    Button btResta;
    Button btMultiplicacion;
    Button btDivision;
    Button btLimpiar;
    Button btIntercambiar;
    Button btSalir;

    int valor1;
    int valor2;
    int resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        tvResultado=findViewById(R.id.tv_Resultado);
        etNumero1=findViewById(R.id.et_Numero1);
        etNumero2=findViewById(R.id.et_Numero2);
        btSuma=findViewById(R.id.bt_Suma);
        btResta=findViewById(R.id.bt_Resta);
        btMultiplicacion=findViewById(R.id.bt_Multiplicacion);
        btDivision=findViewById(R.id.bt_Division);
        btLimpiar=findViewById(R.id.bt_Limpiar);
        btIntercambiar=findViewById(R.id.bt_Intercambiar);
        btSalir=findViewById(R.id.bt_Salir);

        btSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etNumero1.getText().toString().equals("") || etNumero2.getText().toString().equals("")){
                    Toast toast1= Toast.makeText(getApplicationContext(),"No pueden haber campos vacíos", Toast.LENGTH_SHORT);
                    toast1.show();
                } else{

                    valor1=Integer.parseInt(etNumero1.getText().toString());
                    valor2=Integer.parseInt(etNumero2.getText().toString());
                    resultado=valor1+valor2;

                    tvResultado.setText(resultado+"");
                }
            }
        });

        btResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etNumero1.getText().toString().equals("") || etNumero2.getText().toString().equals("")){
                    Toast toast1= Toast.makeText(getApplicationContext(),"No pueden haber campos vacíos", Toast.LENGTH_SHORT);
                    toast1.show();
                } else{

                    valor1=Integer.parseInt(etNumero1.getText().toString());
                    valor2=Integer.parseInt(etNumero2.getText().toString());
                    resultado=valor1-valor2;

                    tvResultado.setText(resultado+"");
                }
            }
        });

        btMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etNumero1.getText().toString().equals("") || etNumero2.getText().toString().equals("")){
                    Toast toast1= Toast.makeText(getApplicationContext(),"No pueden haber campos vacíos", Toast.LENGTH_SHORT);
                    toast1.show();
                } else{

                    valor1=Integer.parseInt(etNumero1.getText().toString());
                    valor2=Integer.parseInt(etNumero2.getText().toString());
                    resultado=valor1*valor2;

                    tvResultado.setText(resultado+"");
                }
            }
        });

        btDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etNumero1.getText().toString().equals("") || etNumero2.getText().toString().equals("")){
                    Toast toast1= Toast.makeText(getApplicationContext(),"No pueden haber campos vacíos", Toast.LENGTH_SHORT);
                    toast1.show();
                } else{

                    valor1=Integer.parseInt(etNumero1.getText().toString());
                    valor2=Integer.parseInt(etNumero2.getText().toString());
                    if (valor2==0){
                        Toast toast2= Toast.makeText(getApplicationContext(),"No se puede dividir entre 0", Toast.LENGTH_SHORT);
                        toast2.show();
                    }else{

                        resultado=valor1/valor2;

                        tvResultado.setText(resultado+"");
                    }
                }
            }
        });

        btLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNumero1.setText("");
                etNumero2.setText("");

                tvResultado.setText("Resultado");
            }
        });

        btIntercambiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valor1=Integer.parseInt(etNumero1.getText().toString());
                valor2=Integer.parseInt(etNumero2.getText().toString());

                etNumero1.setText(""+valor2);
                etNumero2.setText(""+valor1);
            }
        });

        btSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CalculadoraActivity.this, MainActivity.class);
                finish();
            }
        });
    }
}
