package com.codechat.beqelalutele.creaditFragments;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.codechat.beqelalutele.R;


public class airFragment extends Fragment {
    private static final int REQUEST_CALL = 1;
    RelativeLayout month_1, month_2, month_3, month_4, month_5, month_6;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_air, container, false);
        // Inflate the layout for this fragment
        month_1 = v.findViewById(R.id.month_1);
        month_2 = v.findViewById(R.id.month_2);
        month_3 = v.findViewById(R.id.month_3);
        month_4 = v.findViewById(R.id.month_4);
        month_5 = v.findViewById(R.id.month_5);
        month_6 = v.findViewById(R.id.month_6);
        month_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Month_1();
            }
        });
        month_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Month_2();
            }
        });
        month_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Month_3();
            }
        });
        month_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Month_4();
            }
        });
        month_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Month_5();
            }
        });
        month_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Month_6();
            }
        });
        return v;
    }
    public void Month_1() {
        String number = "*810*1*100";
        String dial = "tel:" + number;
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse(Uri.parse(String.valueOf(Uri.parse(dial)))+Uri.encode("#")));
        startActivity(intent);
    }
    public void Month_2() {
        String number = "*810*1*50";
        String dial = "tel:" + number;
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse(Uri.parse(String.valueOf(Uri.parse(dial)))+Uri.encode("#")));
        startActivity(intent);
    }
    public void Month_3() {
        String number = "*810*1*9*25";
        String dial = "tel:" + number;
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse(Uri.parse(String.valueOf(Uri.parse(dial)))+Uri.encode("#")));
        startActivity(intent);
    }
    public void Month_4() {
        String number = "*810*1*9*15";
        String dial = "tel:" + number;
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse(Uri.parse(String.valueOf(Uri.parse(dial)))+Uri.encode("#")));
        startActivity(intent);
    }
    public void Month_5() {
        String number = "*810*1*9*10";
        String dial = "tel:" + number;
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse(Uri.parse(String.valueOf(Uri.parse(dial)))+Uri.encode("#")));
        startActivity(intent);
    }
    public void Month_6() {
        String number = "*810*1*9*9*5";
        String dial = "tel:" + number;
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse(Uri.parse(String.valueOf(Uri.parse(dial)))+Uri.encode("#")));
        startActivity(intent);
    }
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_CALL) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Month_1();
                Month_2();
                Month_3();
                Month_4();
                Month_5();
                Month_6();
            }
        }
    }
}