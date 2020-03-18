package com.example.myapplication12312.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.Navigation;

import com.example.myapplication12312.R;

public class SlideshowFragment extends Fragment {
    Button button12;
    Button button13;
    private SlideshowViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
        button12= root.findViewById(R.id.button)       ;
        button12.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.blankFragment));
        button13= root.findViewById(R.id.button3)       ;
        button13.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_slideshow));
        return root;
    }
}
