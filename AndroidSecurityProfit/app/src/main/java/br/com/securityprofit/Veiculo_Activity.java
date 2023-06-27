package br.com.securityprofit;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Veiculo_Activity extends AppCompatActivity {

    private ImageButton btnMenuToolbar;
    private Button btnNvVeiculo;



    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veiculo);


        btnMenuToolbar = findViewById(R.id.btnMenuToolbar);

        btnMenuToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Veiculo_Activity.this, MenusActivity.class);
                startActivity(intent);

            }
        });


        btnNvVeiculo = findViewById(R.id.btnNvVeiculo);

        btnNvVeiculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Veiculo_Activity.this, CadVeiculoActivity.class);
                startActivity(intent);

            }
        });

    }
}