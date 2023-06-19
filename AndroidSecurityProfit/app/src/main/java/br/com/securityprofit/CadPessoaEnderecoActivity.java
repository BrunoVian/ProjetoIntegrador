package br.com.securityprofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CadPessoaEnderecoActivity extends AppCompatActivity {

    private ImageButton btnMenuToolbar;
    private ImageButton btnDados;
    private ImageButton btnObs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_pessoa_endereco);

        btnMenuToolbar = findViewById(R.id.btnMenuToolbar);

        btnMenuToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CadPessoaEnderecoActivity.this, MenusActivity.class);
                startActivity(intent);

            }
        });

        btnDados = findViewById(R.id.btnDados);

        btnDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CadPessoaEnderecoActivity.this, CadPessoaFisicaActivity.class);
                startActivity(intent);

            }
        });

        btnObs = findViewById(R.id.btnObs);

        btnObs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CadPessoaEnderecoActivity.this, CadPessoaObservacaoActivity.class);
                startActivity(intent);

            }
        });

    }
}