package com.example.youth_and_elderly_liveing_together_new;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new FragmentHealth();  // 第一個 Fragment
            case 1:
                return new FragmentDaily();   // 第二個 Fragment, 不要使用 FragmentActivity
            default:
                return new FragmentHealth();  // 默認 Fragment
        }
    }

    @Override
    public int getItemCount() {
        return 2;  // 返回頁面的總數
    }
}
