package com.jikexueyuan.animatorfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by iwan on 2016/1/27.
 */
public class AnotherFragment extends Fragment {

    //根布局
    private View root;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        root = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_another,null);

        return root;
    }
}
