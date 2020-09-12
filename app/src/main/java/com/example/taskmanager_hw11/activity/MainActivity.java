package com.example.taskmanager_hw11.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.taskmanager_hw11.R;
import com.example.taskmanager_hw11.fragment.LoginFragment;

    public class MainActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            FragmentManager fragmentManager = getSupportFragmentManager();
            Fragment fragment = fragmentManager.findFragmentById(R.id.container);
            if (fragment == null) {
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.container, LoginFragment.newInstance())
                        .commit();
            }
        }
    }