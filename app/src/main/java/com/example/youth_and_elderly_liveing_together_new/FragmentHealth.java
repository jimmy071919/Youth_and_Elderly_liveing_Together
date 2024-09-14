package com.example.youth_and_elderly_liveing_together_new;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class FragmentHealth extends Fragment {

    private String mParam1;
    private String mParam2;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    public FragmentHealth() {
        // Required empty public constructor
    }

    public static FragmentHealth newInstance(String param1, String param2) {
        FragmentHealth fragment = new FragmentHealth();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_health, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        Button gotoNext = view.findViewById(R.id.gotoNext);

        // Set up the RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);

        ArrayList<RCModel> modelArrayList = new ArrayList<>();
        RCAdapter rcAdapter = new RCAdapter(getContext(), modelArrayList);
        recyclerView.setAdapter(rcAdapter);

        String[] titles = {"97%", "155卡路里", "77 BPM", "平淡"};
        int[] images = {
                R.drawable.blood,
                R.drawable.fire,
                R.drawable.heart,
                R.drawable.face
        };

        for (int i = 0; i < titles.length; i++) {
            RCModel rcModel = new RCModel(titles[i], images[i]);
            modelArrayList.add(rcModel);
        }

        rcAdapter.notifyDataSetChanged();

        // Set the click listener for the button
        gotoNext.setOnClickListener(new ButtonClickListener(getContext()));

        return view;
    }
}
