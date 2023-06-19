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
    private ImageButton btnEndereco;
    private ImageButton btnObs;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_pessoa_juridica);

        btnMenuToolbar = findViewById(R.id.btnMenuToolbar);

        btnMenuToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CadPessoaJuridicaActivity.this, MenusActivity.class);
                startActivity(intent);

            }
        });

        btnFisica = findViewById(R.id.btnFisica);

        btnFisica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CadPessoaJuridicaActivity.this, CadPessoaFisicaActivity.class);
                startActivity(intent);

            }
        });

        btnEndereco = findViewById(R.id.btnEndereco);

        btnEndereco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CadPessoaJuridicaActivity.this, CadPessoaEnderecoActivity.class);
                startActivity(intent);

            }
        });

        btnObs = findViewById(R.id.btnObs);

        btnObs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CadPessoaJuridicaActivity.this, CadPessoaObservacaoActivity.class);
                startActivity(intent);

            }
        });
    }
}