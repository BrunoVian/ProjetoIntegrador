package br.com.securityprofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CadUsuarioActivity extends AppCompatActivity {

    private ImageButton btnMenuToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_usuario);

        btnMenuToolbar = findViewById(R.id.btnMenuToolbar);

        btnMenuToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CadUsuarioActivity.this, MenusActivity.class);
                startActivity(intent);

            }
        });
    }
}