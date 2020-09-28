package com.example.universitiesinkuwait;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.uni_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.ku) {
            MainAct2();

        } else {
            if (item.getItemId() == R.id.aum) {
                MainAct3();
            }
        }

        if (item.getItemId() == R.id.auk){
            MainAct4();
        }else{
            if (item.getItemId() == R.id.gust){
                MainAct5();
            }
        }
        return super.onOptionsItemSelected(item);



    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = findViewById(R.id.botNav);
        NavController navController = Navigation.findNavController(this,  R.id.frag);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);



        Menu ku = (Menu) findViewById(R.id.ku);





        Button b = findViewById(R.id.nextBtn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }

        });





    }



    public void openDialog(){
        Popup Warning = new Popup();
        Warning.show(getSupportFragmentManager(), "Please select one of the universities from the top right corner");
    }

    public void MainAct2() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void MainAct3() {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public void MainAct4() {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
    public void MainAct5() {
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }


}