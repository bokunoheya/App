package com.example.myapplication12312;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Specialnosti#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Specialnosti extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Specialnosti() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Specialnosti.
     */
    // TODO: Rename and change types and number of parameters
    public static Specialnosti newInstance(String param1, String param2) {
        Specialnosti fragment = new Specialnosti();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragmentse, container, false);
        Button button8= root.findViewById(R.id.button8);
        Button button9= root.findViewById(R.id.button9);
        Button button10= root.findViewById(R.id.button10);
        button8.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.apt));
        button9.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.apt));
        button10.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.mrtk));
        return root;
    }
}
