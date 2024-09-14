package com.example.youth_and_elderly_liveing_together_new;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.tabs.TabLayout;

public class DailyActivity extends AppCompatActivity {
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dailyhealth);

        // 獲取 TabLayout 控件
        tabLayout = findViewById(R.id.healthtab_layout);

        // 初始顯示 FragmentHealth
        if (savedInstanceState == null) {
            displayFragment(new FragmentHealth()); // 預設顯示健康相關的Fragment
        }

        // 設置 Tab 選擇監聽器
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Fragment selectedFragment = null;
                // 根據 Tab 的位置來選擇對應的 Fragment
                switch (tab.getPosition()) {
                    case 0:
                        selectedFragment = new FragmentHealth(); // 第一個 Tab 顯示 FragmentHealth
                        break;
                    case 1:
                        selectedFragment = new FragmentDaily();  // 第二個 Tab 顯示 FragmentDaily
                        break;
                }
                // 如果選擇了 Fragment，則替換顯示
                if (selectedFragment != null) {
                    displayFragment(selectedFragment);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                // 當 Tab 被取消選擇時可以不做任何事
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                // 當 Tab 被重新選擇時可以不做任何事
            }
        });
    }

    // 使用這個方法來顯示選中的 Fragment
    private void displayFragment(Fragment fragment) {
        // 開啟 FragmentTransaction 並替換當前的 Fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fragment); // 替換成新的 Fragment
        transaction.commit(); // 提交事務，讓更改生效
    }
}
