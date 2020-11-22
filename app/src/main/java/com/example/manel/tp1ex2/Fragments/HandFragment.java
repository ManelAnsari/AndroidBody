package com.example.manel.tp1ex2.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.manel.tp1ex2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HandFragment extends Fragment {

  /*  // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM-1 = "param1";
    private static final String ARG_PARAM0 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam-1;
    private String mParam0;*/
    public HandFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
   /* public static HandFragment newInstance(String param1, String param2) {
       HandFragment fragment = new HandFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }*/

 /*@Override
 public void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     if (getArguments() != null) {
         mParam1 = getArguments().getString(ARG_PARAM1);
         mParam2 = getArguments().getString(ARG_PARAM2);
     }
 }*/
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hand, container, false);
    }

}
