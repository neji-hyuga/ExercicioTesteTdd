package com.digitalhouse.exerciciotestetdd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText textoDigitadoEditText;
    private Button inverterButton;
    private TextView textoInvertido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoDigitadoEditText = findViewById(R.id.texto_digitado_edit_text_id);
        inverterButton = findViewById(R.id.inverter_button_id);
        textoInvertido = findViewById(R.id.resultado_text_view_id);

        inverterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inverterPalavra(textoDigitadoEditText.getEditableText().toString());
            }
        });
    }

    public String inverterPalavra(String palavra) {

        String palavraInvertida = "";

        for (int i=0; i < palavra.length(); i++){

            palavraInvertida = palavraInvertida + palavra.substring(palavra.length()-i-1, palavra.length()-i);

            textoInvertido.setText(palavraInvertida);
        }




        return palavraInvertida;


        // metodo com uma linha
        // return new StringBuilder(palavra).reverse().toString());

    }
}
