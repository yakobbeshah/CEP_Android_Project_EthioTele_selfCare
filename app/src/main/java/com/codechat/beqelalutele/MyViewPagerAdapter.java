package com.codechat.beqelalutele;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.codechat.beqelalutele.creaditFragments.internetFragment;
import com.codechat.beqelalutele.creaditFragments.airFragment;
import com.codechat.beqelalutele.creaditFragments.voiceFragment;

public class MyViewPagerAdapter extends FragmentStateAdapter {

    public MyViewPagerAdapter(@NonNull CreditFragemnt fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
       switch (position){
           case 0:
               return new voiceFragment();
           case 1:
               return new airFragment();
           case 2:
               return new internetFragment();
           default:
               return new voiceFragment();
       }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
