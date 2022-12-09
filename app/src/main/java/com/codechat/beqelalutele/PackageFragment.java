package com.codechat.beqelalutele;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class PackageFragment extends Fragment {
    private static final int REQUEST_CALL = 1;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7,btn8, btn9, btn10;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_package, container, false);

        btn1 = v.findViewById(R.id.btn1);
        btn2 = v.findViewById(R.id.btn2);
        btn3 = v.findViewById(R.id.btn3);
        btn4 = v.findViewById(R.id.btn4);
        btn5 = v.findViewById(R.id.btn5);
        btn6 = v.findViewById(R.id.btn6);
        btn7 = v.findViewById(R.id.btn7);
        btn8 = v.findViewById(R.id.btn8);
        btn9 = v.findViewById(R.id.btn9);
        btn10 = v.findViewById(R.id.btn10);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPackage();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPackage();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPackage();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPackage();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPackage();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPackage();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPackage();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPackage();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPackage();
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPackage();
            }
        });


        return v;
    }
    public void myPackage() {
        String number = "*999";
        String dial = "tel:" + number;
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse(Uri.parse(String.valueOf(Uri.parse(dial)))+Uri.encode("#")));
        startActivity(intent);
    }
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_CALL) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                myPackage();
            }
        }
    }
}