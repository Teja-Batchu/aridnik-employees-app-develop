package com.aridnik.employee.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aridnik.employee.R;

/**
 * Created by Vinod Dirishala on 18-06-2019
 **/
public class Home extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View homeView  = inflater.inflate(R.layout.fragment_home,container,false);
        return homeView;

    }
}
