package br.com.securityprofit;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class CadPessoaObservacaoActivity extends AppCompatActivity {

    private ImageButton btnMenuToolbar;
    private ImageButton btnEndereco;

    private ImageButton btnDados;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_pessoa_observacao);

        btnMenuToolbar = findViewById(R.id.btnMenuToolbar);

        btnMenuToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CadPessoaObservacaoActivity.this, MenusActivity.class);
                startActivity(intent);

            }
        });

        btnEndereco = findViewById(R.id.btnEndereco);

        btnEndereco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CadPessoaObservacaoActivity.this, CadPessoaEnderecoActivity.class);
                startActivity(intent);

            }
        });

        btnDados = findViewById(R.id.btnDados);

        btnDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CadPessoaObservacaoActivity.this, CadPessoaFisicaActivity.class);
                startActivity(intent);

            }
        });
    }
}