package com.codechat.beqelalutele;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class HomeActivity extends AppCompatActivity {
    private static final int REQUEST_CALL = 1;
    final DrawerLayout drawerLayout = findViewById(R.id.drawerLayout);
    BottomNavigationView bottmNav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findViewById(R.id.imageMenu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
        findViewById(R.id.phoneHelp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callHelp();
            }
        });
//        findViewById(R.id.buttonAccount).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                AccountBalance();
//            }
//        });
        bottmNav=findViewById(R.id.navigetion_bottom);
        bottmNav.setOnNavigationItemSelectedListener(navListener);

        //if we dont assin fragment when we start the app it will be empty becouse we didnt
        //select any thing so we shoul assigh the fragment that we want to show when the app is started

        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer
        ,new HomeFragment()).commit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener=
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                  Fragment selectedFragment=null;
                  switch (item.getItemId()){
                      case R.id.home:
                          //creat fragment
                          selectedFragment=new HomeFragment();
                          break;
                      case R.id.account:
                          selectedFragment=new AccountFragment();
                          break;
                      case R.id.g_package:
                          selectedFragment=new PackageFragment();
                          break;
                      case R.id.credit:
                          selectedFragment=new CreditFragemnt();
                          break;
                  }
                 // here we show our fragment and we replace()with container where we wnat to display the fragment in
                 getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,selectedFragment).commit();

                  // true means that we select the clicked item,if we return false still show the fragment
                    //but item will not be selected
                  return true;

                }
            };

    private void callHelp() {
        String number = "994";
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(HomeActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(HomeActivity.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            }
        }
        String dial = "tel:" + number;
        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
    }
//    private void AccountBalance() {
//        String number = "*804";
//        if (number.trim().length() > 0) {
//            if (ContextCompat.checkSelfPermission(HomeActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                ActivityCompat.requestPermissions(HomeActivity.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
//            }
//        }
//        String dial = "tel:" + number ;
//        Intent intent = new Intent(Intent.ACTION_CALL);
//        intent.setData(Uri.parse(Uri.parse(dial)+Uri.encode("#")));
//        startActivity(intent);
//    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_CALL) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                callHelp();
              //  AccountBalance();
            } else {
                Toast.makeText(this, "Permission Denied", Toast.LENGTH_SHORT).show();
            }
        }
    }


}