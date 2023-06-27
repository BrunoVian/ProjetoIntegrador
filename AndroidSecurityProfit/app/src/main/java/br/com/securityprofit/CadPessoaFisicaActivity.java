package br.com.securityprofit;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageButton;


public class CadPessoaFisicaActivity extends AppCompatActivity {

    private ImageButton btnMenuToolbar;
    private ImageButton btnJuridica1;
    private ImageButton btnEndereco;
    private ImageButton btnObs3;


    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_pessoa_fisica);

        btnMenuToolbar = findViewById(R.id.btnMenuToolbar);

        btnMenuToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CadPessoaFisicaActivity.this, MenusActivity.class);
                startActivity(intent);

            }
        });


        btnEndereco = findViewById(R.id.btnEndereco);

        btnEndereco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CadPessoaFisicaActivity.this, CadPessoaEnderecoActivity.class);
                startActivity(intent);

            }
        });



        btnObs3 = findViewById(R.id.btnObs3);

        btnObs3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CadPessoaFisicaActivity.this, CadPessoaEnderecoActivity.class);
                startActivity(intent);

            }
        });



    }
}