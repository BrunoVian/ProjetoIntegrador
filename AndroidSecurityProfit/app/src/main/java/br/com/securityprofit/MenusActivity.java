package br.com.securityprofit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class MenusActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menus);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_inicio) {

            Intent intent = new Intent(MenusActivity.this, MenuActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_pessoa) {
            Intent intent = new Intent(MenusActivity.this, PessoaActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_veiculo) {
            Intent intent = new Intent(MenusActivity.this, VeiculoActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_usuarios) {
            Intent intent = new Intent(MenusActivity.this, UsuarioActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_sair){
            Intent intent = new Intent(MenusActivity.this, LoginActivity.class);
            startActivity(intent);
        }
        return true;
    }
}
