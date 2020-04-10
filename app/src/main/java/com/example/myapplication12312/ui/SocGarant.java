package com.example.myapplication12312.ui;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.myapplication12312.R;

public class SocGarant extends Fragment {

    private SocGarantViewModel mViewModel;

    public static SocGarant newInstance() {
        return new SocGarant();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root= inflater.inflate(R.layout.soc_garant_fragment, container, false);
        Button button16=root.findViewById(R.id.button16);
        button16.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.soc_gar_child));
        Button button11=root.findViewById(R.id.button11);
        button11.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.govAcSt));
        Button button15=root.findViewById(R.id.button15);
        button15.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.pitanie));
        Button button14=root.findViewById(R.id.button14);
        button14.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.merySocPod));
        Button button13=root.findViewById(R.id.button13);
        button13.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.govSocSt));
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(SocGarantViewModel.class);
        // TODO: Use the ViewModel
    }

}
