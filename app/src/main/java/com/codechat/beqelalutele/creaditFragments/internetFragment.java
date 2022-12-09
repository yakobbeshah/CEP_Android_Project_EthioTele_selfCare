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


public class internetFragment extends Fragment {
    private static final int REQUEST_CALL = 1;
    RelativeLayout inter_1, inter_2, inter_3, inter_4, inter_5, inter_6;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_internet, container, false);
        // Inflate the layout for this fragment
        inter_1 = v.findViewById(R.id.inter_1);
        inter_2 = v.findViewById(R.id.inter_2);
        inter_3 = v.findViewById(R.id.inter_3);
        inter_4 = v.findViewById(R.id.inter_4);
        inter_5 = v.findViewById(R.id.inter_5);
        inter_6 = v.findViewById(R.id.inter_6);
        inter_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Inter_1();
            }
        });
        inter_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Inter_2();
            }
        });
        inter_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Inter_3();
            }
        });
        inter_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Inter_4();
            }
        });
        inter_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Inter_5();
            }
        });
        inter_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Inter_6();
            }
        });
        return v;
    }
    public void Inter_1() {
        String number = "*810*9*3*105";
        String dial = "tel:" + number;
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse(Uri.parse(String.valueOf(Uri.parse(dial)))+Uri.encode("#")));
        startActivity(intent);
    }
    public void Inter_2() {
        String number = "*810*9*3*60";
        String dial = "tel:" + number;
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse(Uri.parse(String.valueOf(Uri.parse(dial)))+Uri.encode("#")));
        startActivity(intent);
    }
    public void Inter_3() {
        String number = "*810*9*3*9*56";
        String dial = "tel:" + number;
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse(Uri.parse(String.valueOf(Uri.parse(dial)))+Uri.encode("#")));
        startActivity(intent);
    }
    public void Inter_4() {
        String number = "*810*9*3*9*38";
        String dial = "tel:" + number;
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse(Uri.parse(String.valueOf(Uri.parse(dial)))+Uri.encode("#")));
        startActivity(intent);
    }
    public void Inter_5() {
        String number = "*810*9*3*9*12";
        String dial = "tel:" + number;
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse(Uri.parse(String.valueOf(Uri.parse(dial)))+Uri.encode("#")));
        startActivity(intent);
    }
    public void Inter_6() {
        String number = "*810*9*3*9*9*5";
        String dial = "tel:" + number;
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse(Uri.parse(String.valueOf(Uri.parse(dial)))+Uri.encode("#")));
        startActivity(intent);
    }
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_CALL) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Inter_1();
                Inter_2();
                Inter_3();
                Inter_4();
                Inter_5();
                Inter_6();
            }
        }
    }
}