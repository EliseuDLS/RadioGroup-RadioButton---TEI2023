package com.example.aulacheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBoxVerde;
    private CheckBox checkBoxAzul;
    private CheckBox checkBoxVermelho;
    private RadioButton radioButtonArroz;
    private RadioButton radioButtonFeijão;
    private RadioGroup radioGroupAlmoco;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxVerde = findViewById(R.id.checkBoxVerde);
        checkBoxAzul = findViewById(R.id.checkBoxAzul);
        checkBoxVermelho = findViewById(R.id.checkBoxVermelho);

        radioButtonArroz = findViewById(R.id.radioButtonArroz);
        radioButtonFeijão = findViewById(R.id.radioButtonFeijão);
        radioGroupAlmoco = findViewById(R.id.radioGroupAlmoco);

        textoResultado = findViewById(R.id.textoResultado);

        radioButtonListener();
    }

    public void checkBox(){

        String texto = "";

        if (checkBoxVerde.isChecked()){
            texto = "Verde selecionado - ";
        } if (checkBoxAzul.isChecked()){
            texto += "Azul selecionado - ";
        } if (checkBoxVermelho.isChecked()){
            texto += "Vermelho selecionado";
        }

        textoResultado.setText(texto);
    }

    public void radioButton(){
        if (radioButtonArroz.isChecked()){
            textoResultado.setText("Arroz selecionado");
        } else if (radioButtonFeijão.isChecked()){
            textoResultado.setText("Feijão selecionado");
        }
    }

    public void radioButtonListener(){
        radioGroupAlmoco.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButtonArroz){
                    textoResultado.setText("Arroz");
                } else if (checkedId == R.id.radioButtonFeijão){
                    textoResultado.setText("Feijão");
                }
            }
        });
    }

    public void enviar (View view){
        //checkBox();
        //radioButton();
    }
}
