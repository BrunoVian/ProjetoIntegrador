package br.com.securityprofit;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class UsuarioActivity extends AppCompatActivity {

    private ImageButton btnMenuToolbar;
    private Button btnNvUsuario;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);

        btnMenuToolbar = findViewById(R.id.btnMenuToolbar);

        btnMenuToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(UsuarioActivity.this, MenusActivity.class);
                startActivity(intent);

            }
        });

        btnNvUsuario = findViewById(R.id.btnNvUsuario);

        btnNvUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(UsuarioActivity.this, CadUsuarioActivity.class);
                startActivity(intent);

            }
        });
    }
}