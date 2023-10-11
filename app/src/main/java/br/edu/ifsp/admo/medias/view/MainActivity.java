package br.edu.ifsp.admo.medias.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import br.edu.ifsp.admo.medias.R;

public class MainActivity extends AppCompatActivity {

    private EditText primeiro_valor;
    private EditText segundo_valor;
    private EditText terceiro_valor;
    private EditText quarto_valor;
    private EditText quinto_valor;
    private Button btnAritmetica;
    private Button btnPonderada;
    private Button btnHarmonica;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findById();
        setClick();
    }

    public void findById(){
        primeiro_valor = findViewById(R.id.editTextNumeroUm);
        segundo_valor = findViewById(R.id.editTextNumeroDois);
        terceiro_valor = findViewById(R.id.editTextNumeroTres);
        quarto_valor = findViewById(R.id.editTextNumeroquatro);
        quinto_valor = findViewById(R.id.editTextNumeroCinco);
        btnAritmetica = findViewById(R.id.btn_aritmetica);
        btnPonderada = findViewById(R.id.btn_ponderada);
        btnHarmonica = findViewById(R.id.btn_harmonica);
    }

    private void setClick(){
        btnAritmetica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Click Aritmetica");
            }
        });

        btnPonderada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Click Pondetada");
            }
        });

        btnHarmonica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Click Harmonica");
            }
        });
    }

    public void leitura(){}
}