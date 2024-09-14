package com.example.youth_and_elderly_liveing_together_new;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

public class FragmentDaily extends Fragment {

    RecyclerView recyclerView;
    List<DataClass> dataList;
    MyAdapter adapter;
    DataClass androidData;
    SearchView searchView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // 使用 Fragment 的 layout 文件，代替原來的 setContentView()
        View view = inflater.inflate(R.layout.fragment_daily, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        searchView = view.findViewById(R.id.search);

        searchView.clearFocus();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                searchList(newText);
                return true;
            }
        });

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        dataList = new ArrayList<>();

        androidData = new DataClass("活力勁舞班", R.string.dance, "每週五晚上八點", R.drawable.dance_detail);
        dataList.add(androidData);

        androidData = new DataClass("銀髮有氧健體課", R.string.yoga, "每週五晚上八點", R.drawable.yoga_detail);
        dataList.add(androidData);

        androidData = new DataClass("手機攝影班", R.string.phone, "每週五晚上八點", R.drawable.phone_detail);
        dataList.add(androidData);

        androidData = new DataClass("銀髮歌唱班", R.string.sing, "每週五晚上八點", R.drawable.sing_detail);
        dataList.add(androidData);

        adapter = new MyAdapter(getActivity(), dataList);
        recyclerView.setAdapter(adapter);

        return view; // 返回 Fragment 的 View
    }

    private void searchList(String text){
        List<DataClass> dataSearchList = new ArrayList<>();
        for (DataClass data : dataList){
            if (data.getDataTitle().toLowerCase().contains(text.toLowerCase())) {
                dataSearchList.add(data);
            }
        }
        if (dataSearchList.isEmpty()){
            Toast.makeText(getActivity(), "Not Found", Toast.LENGTH_SHORT).show();
        } else {
            adapter.setSearchList(dataSearchList);
        }
    }
}
