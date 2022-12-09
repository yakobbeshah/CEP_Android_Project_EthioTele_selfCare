package com.codechat.beqelalutele;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.google.android.material.tabs.TabLayout;

public class CreditFragemnt extends Fragment {
    private static final int REQUEST_CALL = 1;
    Button can, match;
   TabLayout tabLayout;
   ViewPager2 viewPager2;
   MyViewPagerAdapter myViewPagerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view= inflater.inflate(R.layout.fragment_credit, container, false);

       can = view.findViewById(R.id.can);
        match = view.findViewById(R.id.match);
        can.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                matchCreadit();
            }
        });
        match.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                canCreadit();
            }
        });
       tabLayout =view.findViewById(R.id.tab_Layout);
       viewPager2=view.findViewById(R.id.view_pager);
       myViewPagerAdapter=new MyViewPagerAdapter(this);
      viewPager2.setAdapter(myViewPagerAdapter);
      tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
          @Override
          public void onTabSelected(TabLayout.Tab tab) {
             viewPager2.setCurrentItem(tab.getPosition());
          }

          @Override
          public void onTabUnselected(TabLayout.Tab tab) {
              viewPager2.setCurrentItem(tab.getPosition());
          }

          @Override
          public void onTabReselected(TabLayout.Tab tab) {
            viewPager2.setCurrentItem(tab.getPosition());
          }
      });
      viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
          @Override
          public void onPageSelected(int position) {
              super.onPageSelected(position);
              tabLayout.getTabAt(position).select();
          }
      });
    return view;
    }
    public void canCreadit() {
        String number = "*810*9*5*1";
        String dial = "tel:" + number;
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse(Uri.parse(String.valueOf(Uri.parse(dial)))+Uri.encode("#")));
        startActivity(intent);
    }
    public void matchCreadit() {
        String number = "*810*9*5*2";
        String dial = "tel:" + number;
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse(Uri.parse(String.valueOf(Uri.parse(dial)))+Uri.encode("#")));
        startActivity(intent);
    }
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_CALL) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                canCreadit();
                matchCreadit();
            }
        }
    }

}