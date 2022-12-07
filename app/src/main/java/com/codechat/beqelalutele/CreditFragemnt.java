package com.codechat.beqelalutele;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;

public class CreditFragemnt extends Fragment {

   TabLayout tabLayout;
   ViewPager2 viewPager2;
   MyViewPagerAdapter myViewPagerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view= inflater.inflate(R.layout.fragment_credit, container, false);
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
}