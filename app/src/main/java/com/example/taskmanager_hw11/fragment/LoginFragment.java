package com.example.taskmanager_hw11.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.taskmanager_hw11.R;
import com.example.taskmanager_hw11.activity.MainActivity;
import com.google.android.material.textfield.TextInputLayout;

public class LoginFragment extends Fragment {


    private TextInputLayout mEditTextUserName;
    private TextInputLayout mEditTextNumber;
    private Button mButtonSignIn;
    private Button mButtonSignUp;

    public LoginFragment() {
        // Required empty public constructor
    }
    public static LoginFragment newInstance() {
        LoginFragment fragment = new LoginFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        if(savedInstanceState != null){
           //ToDo
        }
        findViews(view);
        initViews();
        setListeners();

        return view;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        //ToDo
    }

    private void findViews(View view) {
        mEditTextUserName = view.findViewById(R.id.edit_txt_username);
        mEditTextNumber = view.findViewById(R.id.edit_txt_number);
        mButtonSignIn = view.findViewById(R.id.btn_signin);
        mButtonSignUp = view.findViewById(R.id.btn_signup);
    }

    private void initViews() {

    }

    private void setListeners() {
        mButtonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mEditTextUserName.getEditText().getText().toString().trim().isEmpty()) {
                    mEditTextUserName.setErrorEnabled(true);
                    mEditTextUserName.setError("Complete Field");
                }

                else if(mEditTextNumber.getEditText().getText().toString().length() == 0) {
                    mEditTextUserName.setErrorEnabled(false);
                    mEditTextNumber.setErrorEnabled(true);
                    mEditTextNumber.setError("Complete Field");
                }



                else
                {
                    mEditTextUserName.setErrorEnabled(false);
                    mEditTextNumber.setErrorEnabled(false);

                    Intent intent = new Intent(getActivity(), MainActivity.class);

                    startActivity(intent);
                }
            }

        });
        mButtonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ToDo

            }

        });
    }
}