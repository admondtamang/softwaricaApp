package com.softwarica.softwaricaapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.softwarica.softwaricaapp.Fragment.AboutFragment;
import com.softwarica.softwaricaapp.Fragment.HomeFragment;
import com.softwarica.softwaricaapp.Fragment.RegisterFragment;
import com.softwarica.softwaricaapp.Model.Student;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

//    public static ArrayList<String> students;
    BottomNavigationView bottomNavigation;
    FrameLayout main_layout;
    public static List<Student> students=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Start homefragment at startup
        getSupportFragmentManager().beginTransaction().replace(R.id.main_layout,
                new HomeFragment()).commit();

        bottomNavigation=findViewById(R.id.bottom_navigation);
        main_layout=findViewById(R.id.main_layout);
        students.add(new Student("Aryan",19,"Male","balaju",R.drawable.male));
        students.add(new Student("Rupesh",21,"Male","balaju",R.drawable.male));
        students.add(new Student("Sita",19,"Female","balaju",R.drawable.female));
        students.add(new Student("riteshita",59,"Other","india",R.drawable.other));

        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment=null;
                switch (menuItem.getItemId()){
                    case R.id.nav_home:
                        fragment=new HomeFragment();
                        break;
                    case R.id.nav_about:
                        fragment=new AboutFragment();
                        break;
                    case R.id.nav_register:
                        fragment=new RegisterFragment();
                        break;
                }


                getSupportFragmentManager().beginTransaction().replace(R.id.main_layout,
                        fragment).commit();
                return true;
            }
        });
    }
}
