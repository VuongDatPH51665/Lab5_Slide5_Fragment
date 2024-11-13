package com.vn.fragment.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.vn.fragment.Fragment.ListUserFragment;
import com.vn.fragment.Fragment.LoginFragment;

public class ViewsFragment extends FragmentStateAdapter {
    public ViewsFragment(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position==0){
            return LoginFragment.newInstance();
        }else if(position==1){
            return ListUserFragment.newInstance();
        }
        return LoginFragment.newInstance();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
