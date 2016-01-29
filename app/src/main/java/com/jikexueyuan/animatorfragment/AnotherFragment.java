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
public class AnotherFragment extends Fragment implements View.OnClickListener {

    //根布局
    private View root;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //实例化一个布局
        root = inflater.inflate(R.layout.fragment_another,container,false);

        root.setOnClickListener(this);

        //查找按钮，设置监听事件
        root.findViewById(R.id.btnCallBack).setOnClickListener(this);

        return root;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnCallBack:
                getFragmentManager().popBackStack();
                break;
        }

    }
}
