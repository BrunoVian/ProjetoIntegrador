package br.com.securityprofit;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import br.com.securityprofit.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarHome.toolbar);
        binding.appBarHome.toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        navigationView.setNavigationItemSelectedListener(this);

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.frmIncicio, R.id.nav_slideshow)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_home);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.drawer_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_inicio) {
            Intent intent = new Intent(HomeActivity.this, MenuActivity.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.nav_pesso) {
            Intent intent = new Intent(HomeActivity.this, Pessoa_Activity.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.nav_veiculo) {
            Intent intent = new Intent(HomeActivity.this, Veiculo_Activity.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.nav_usuarios) {
            Intent intent = new Intent(HomeActivity.this, Usuario_Activity.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.nav_sair) {
            Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_home);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_inicio) {
            Intent intent = new Intent(HomeActivity.this, MenuActivity.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.nav_pesso) {
            Intent intent = new Intent(HomeActivity.this, Pessoa_Activity.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.nav_veiculo) {
            Intent intent = new Intent(HomeActivity.this, Veiculo_Activity.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.nav_usuarios) {
            Intent intent = new Intent(HomeActivity.this, Usuario_Activity.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.nav_sair) {
            Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
            startActivity(intent);
            return true;
        }

        return false;
    }
}
