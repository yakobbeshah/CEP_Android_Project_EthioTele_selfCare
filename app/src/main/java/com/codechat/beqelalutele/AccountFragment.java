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
import android.widget.EditText;

public class AccountFragment extends Fragment {
    private static final int REQUEST_CALL = 1;
    Button balance, recharge, transfer, callBack;
    EditText cardnumber, tranferphone, transferamount, callphone;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_account, container, false);

        balance = v.findViewById(R.id.ask);
        recharge = v.findViewById(R.id.recharge);
        transfer = v.findViewById(R.id.transfer);
        callBack = v.findViewById(R.id.call_back);
        cardnumber = v.findViewById(R.id.card_number);
        tranferphone = v.findViewById(R.id.transfer_number);
        transferamount = v.findViewById(R.id.transfer_ammount);
        callphone = v.findViewById(R.id.call_phone);

        balance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                balanceAsk();
            }
        });
        recharge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rechargeAccount();
            }
        });
        transfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tranferBallence();
            }
        });
        callBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callMeBack();
            }
        });

        return v;
    }
    public void balanceAsk() {
        String number = "*804";
        String dial = "tel:" + number;
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse(Uri.parse(String.valueOf(Uri.parse(dial)))+Uri.encode("#")));
        startActivity(intent);
    }
    public void rechargeAccount() {
        String rechargeNumber = cardnumber.getText().toString();
        String number = "*805*"+rechargeNumber;
        String dial = "tel:" + number;
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse(Uri.parse(String.valueOf(Uri.parse(dial)))+Uri.encode("#")));
        startActivity(intent);
        cardnumber.setText("");
    }
    public void tranferBallence() {
        String transferNumber = tranferphone.getText().toString();
        String transferAmmount = transferamount.getText().toString();
        String number = "*806*"+transferNumber+"*"+transferAmmount;
        String dial = "tel:" + number;
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse(Uri.parse(String.valueOf(Uri.parse(dial)))+Uri.encode("#")));
        startActivity(intent);
        tranferphone.setText("");
        transferamount.setText("");
    }
    public void callMeBack() {
        String callPhone= callphone.getText().toString();
        String number = "*807*"+callPhone;
        String dial = "tel:" + number;
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse(Uri.parse(String.valueOf(Uri.parse(dial)))+Uri.encode("#")));
        startActivity(intent);
        callphone.setText("");
    }
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_CALL) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                balanceAsk();
                rechargeAccount();
                tranferBallence();
                callMeBack();
            }
        }
    }

}


