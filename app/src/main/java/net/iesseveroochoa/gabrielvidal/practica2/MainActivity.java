package net.iesseveroochoa.gabrielvidal.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btAgenda;
    Button btCalculadora;
    Button btReceta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btAgenda=findViewById(R.id.bt_Agenda);
        btCalculadora=findViewById(R.id.bt_Calculadora);
        btReceta=findViewById(R.id.bt_Receta);

        btAgenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, AgendaActivity.class);
                startActivity(intent);
            }
        });
    }
}
