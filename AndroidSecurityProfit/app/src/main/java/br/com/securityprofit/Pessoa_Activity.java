package br.com.securityprofit;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Pessoa_Activity extends AppCompatActivity {

    private ImageButton btnMenuToolbar;
    private Button btnNvPessoa;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pessoa);

        btnMenuToolbar = findViewById(R.id.btnMenuToolbar);

        btnMenuToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Pessoa_Activity.this, MenusActivity.class);
                startActivity(intent);

            }
        });


        btnNvPessoa = findViewById(R.id.btnNvPessoa);

        btnNvPessoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Pessoa_Activity.this, CadPessoaFisicaActivity.class);
                startActivity(intent);

            }
        });
    }
}