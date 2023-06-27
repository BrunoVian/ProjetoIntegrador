package br.com.securityprofit;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class CadPessoaObservacaoActivity extends AppCompatActivity {

    private ImageButton btnMenuToolbar2;
    private ImageButton btnEndereco2;

    private ImageButton btnDados2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_pessoa_observacao);

        btnMenuToolbar2 = findViewById(R.id.btnMenuToolbar2);

        btnMenuToolbar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CadPessoaObservacaoActivity.this, MenusActivity.class);
                startActivity(intent);

            }
        });





        btnEndereco2 = findViewById(R.id.btnEndereco2);

        btnEndereco2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CadPessoaObservacaoActivity.this, CadPessoaEnderecoActivity.class);
                startActivity(intent);

            }
        });

        btnDados2 = findViewById(R.id.btnDados2);

        btnDados2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CadPessoaObservacaoActivity.this, CadPessoaFisicaActivity.class);
                startActivity(intent);

            }
        });


    }
}