package com.example.myapplication12312.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.Navigation;

import com.example.myapplication12312.R;

public class HomeFragment extends Fragment {
Button test;
Button profile;
Button spis_uch;
Button professii;
//Button specialnosti;
    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        final View root = inflater.inflate(R.layout.fragment_home, container, false);
        test= root.findViewById(R.id.button2);
        profile= root.findViewById(R.id.profile);
        spis_uch= root.findViewById(R.id.spis_uch);
        professii= root.findViewById(R.id.professii);
        //specialnosti= root.findViewById(R.id.specialnosti);
        test.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_slideshow));
        profile.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_gallery));
        spis_uch.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_slideshow));
        professii.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.blankFragment2));
      //  specialnosti.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.specialnosti2));
        return root;
    }
}
