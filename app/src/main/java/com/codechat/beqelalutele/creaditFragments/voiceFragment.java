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


public class voiceFragment extends Fragment {
    private static final int REQUEST_CALL = 1;
    RelativeLayout day_1, day_2, day_3, day_4, day_5, day_6;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_voice, container, false);
        // Inflate the layout for this fragment
        day_1 = v.findViewById(R.id.day_1);
        day_2 = v.findViewById(R.id.day_2);
        day_3 = v.findViewById(R.id.day_3);
        day_4 = v.findViewById(R.id.day_4);
        day_5 = v.findViewById(R.id.day_5);
        day_6 = v.findViewById(R.id.day_6);
        day_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Day_1();
            }
        });
        day_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Day_2();
            }
        });
        day_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Day_3();
            }
        });
        day_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Day_4();
            }
        });
        day_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Day_5();
            }
        });
        day_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Day_6();
            }
        });
        return v;
    }
    public void Day_1() {
        String number = "*810*2*95";
        String dial = "tel:" + number;
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse(Uri.parse(String.valueOf(Uri.parse(dial)))+Uri.encode("#")));
        startActivity(intent);
    }
    public void Day_2() {
        String number = "*810*2*50";
        String dial = "tel:" + number;
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse(Uri.parse(String.valueOf(Uri.parse(dial)))+Uri.encode("#")));
        startActivity(intent);
    }
    public void Day_3() {
        String number = "*810*2*9*25";
        String dial = "tel:" + number;
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse(Uri.parse(String.valueOf(Uri.parse(dial)))+Uri.encode("#")));
        startActivity(intent);
    }
    public void Day_4() {
        String number = "*810*2*9*15";
        String dial = "tel:" + number;
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse(Uri.parse(String.valueOf(Uri.parse(dial)))+Uri.encode("#")));
        startActivity(intent);
    }
    public void Day_5() {
        String number = "*810*2*9*10";
        String dial = "tel:" + number;
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse(Uri.parse(String.valueOf(Uri.parse(dial)))+Uri.encode("#")));
        startActivity(intent);
    }
    public void Day_6() {
        String number = "*810*2*9*9*5";
        String dial = "tel:" + number;
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse(Uri.parse(String.valueOf(Uri.parse(dial)))+Uri.encode("#")));
        startActivity(intent);
    }
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_CALL) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Day_1();
                Day_2();
                Day_3();
                Day_4();
                Day_5();
                Day_6();
            }
        }
    }
}