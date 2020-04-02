package com.example.myapplication12312.ui.slideswhow.Info_YSHT;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication12312.R;


public class Info_YSHT extends Fragment {

    private InfoYSHTViewModel mViewModel;

    public static Info_YSHT newInstance() {
        return new Info_YSHT();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.info__y_s_h_t_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(InfoYSHTViewModel.class);
        // TODO: Use the ViewModel
    }

}
