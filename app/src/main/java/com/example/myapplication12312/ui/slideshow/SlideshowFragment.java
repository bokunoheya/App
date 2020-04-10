package com.example.myapplication12312.ui.slideshow;

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

public class SlideshowFragment extends Fragment {
    Button button;
    Button button6;
    Button button7;
    private SlideshowViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
        button= root.findViewById(R.id.button)       ;
        button.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.blankFragment));
        button6= root.findViewById(R.id.button6)       ;
        button6.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.apt));
        button7= root.findViewById(R.id.button7)       ;
        button7.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.mrtk));
        return root;
    }
}
