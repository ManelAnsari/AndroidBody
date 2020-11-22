package com.example.manel.tp1ex2.Fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.manel.tp1ex2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    Button btnhead, btnbody, btnhand, btnleg;
    private OnButtonClickedListener mCallback;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        btnbody = v.findViewById(R.id.btnBody);
        btnhead = v.findViewById(R.id.btnhead);
        btnleg = v.findViewById(R.id.btnleg);
        btnhand = v.findViewById(R.id.btnhand);
        //---------------------clicklistener
        btnbody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCallback.OnBtnbodyClicked(view);
            }
        });
        btnhand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCallback.OnBtnhandClicked(view);

            }
        });
        btnleg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCallback.OnBtnlegClicked(view);

            }
        });
        btnhead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCallback.OnBtnheadClicked(view);

            }
        });
        return v;
    }

    public interface OnButtonClickedListener {
        public void OnBtnheadClicked(View v);

        public void OnBtnhandClicked(View v);

        public void OnBtnlegClicked(View v);

        public void OnBtnbodyClicked(View v);
    }



    private void createCallbackToParentActivity() {
        try {
            //Parent activity will automatically subscribe to callback
            mCallback = (OnButtonClickedListener) getActivity();
        } catch (ClassCastException e) {
            throw new ClassCastException(e.toString() + " must implement OnButtonClickedListener");
        }
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        // 4 - Call the method that creating callback after being attached to parent activity
        this.createCallbackToParentActivity();


    }
}