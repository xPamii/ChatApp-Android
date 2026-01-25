package com.xpamii.chatapp_android.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.xpamii.chatapp_android.fragments.SignInFragment;
import com.xpamii.chatapp_android.fragments.SignUpFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        if(position==1){
            return new SignInFragment();
        }

        return new SignUpFragment();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
