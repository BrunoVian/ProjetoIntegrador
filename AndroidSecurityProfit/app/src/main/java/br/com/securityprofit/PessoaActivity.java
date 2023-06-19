package br.com.securityprofit;

import android.os.Bundle;
import android.view.Menu;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

public class PessoaActivity extends AppCompatActivity {

    private Toolbar toolbar;

    private Menu menu_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pessoa);

        toolbar = findViewById(R.id.toolbar);
        getSupportActionBar().setTitle("Pessoa");

    }




}