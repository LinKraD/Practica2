package net.iesseveroochoa.gabrielvidal.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AgendaActivity extends AppCompatActivity {

    TextView tvContacto;

    EditText etNombre;
    EditText etApellidos;
    EditText etEMail;
    EditText etTelefono;
    EditText etNotas;

    Button btAceptar;
    Button btReiniciar;
    Button btSalir;

    String contacto="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);

        etNombre=findViewById(R.id.et_Nombre);
        etApellidos=findViewById(R.id.et_Apellidos);
        etEMail=findViewById(R.id.et_eMail);
        etTelefono=findViewById(R.id.et_Telefono);
        etNotas=findViewById(R.id.et_Notas);
        tvContacto=findViewById(R.id.tv_Contact);
        btAceptar=findViewById(R.id.bt_Aceptar);
        btReiniciar=findViewById(R.id.bt_Reiniciar);
        btSalir=findViewById(R.id.bt_Salir);

        btAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                contacto=etNombre.getText()+" "+etApellidos.getText();

                tvContacto.setText(contacto);

            }
        });

        btReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNombre.setText("");
                etApellidos.setText("");
                etEMail.setText("");
                etTelefono.setText("");
                etNotas.setText("");
            }
        });

        btSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AgendaActivity.this, MainActivity.class);
                finish();
            }
        });

    }


}
