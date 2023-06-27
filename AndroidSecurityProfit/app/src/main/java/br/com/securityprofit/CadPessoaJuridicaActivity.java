package br.com.securityprofit;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CadPessoaJuridicaActivity extends AppCompatActivity {

    private ImageButton btnMenuToolbar;
    private ImageButton btnFisica;
    private ImageButton btnEndereco1;
    private ImageButton btnObs1;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_pessoa_juridica);



        btnEndereco1 = findViewById(R.id.btnEndereco1);

        btnEndereco1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CadPessoaJuridicaActivity.this, CadPessoaEnderecoActivity.class);
                startActivity(intent);

            }
        });

        btnObs1 = findViewById(R.id.btnObs1);

        btnObs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CadPessoaJuridicaActivity.this, CadPessoaObservacaoActivity.class);
                startActivity(intent);

            }
        });


        };

    }
