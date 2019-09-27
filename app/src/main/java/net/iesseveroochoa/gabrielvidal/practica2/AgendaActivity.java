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
    Button btAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);

        etNombre=findViewById(R.id.et_Nombre);
        etApellidos=findViewById(R.id.et_Apellidos);
        tvContacto=findViewById(R.id.tv_Contact);

        btAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvContacto.;

            }
        });

    }


}
