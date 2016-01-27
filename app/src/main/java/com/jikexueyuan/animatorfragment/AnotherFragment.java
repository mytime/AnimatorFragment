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
        root = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_another,null);

        //查找按钮，设置监听事件
        root.findViewById(R.id.btnCallBack).setOnClickListener(this);

        return root;
    }

    @Override
    public void onClick(View v) {
        //在FrameLayout帧上加载一个新的碎片，并设置淡入淡出效果
        getFragmentManager().beginTransaction()
                .setCustomAnimations(R.animator.enter,R.animator.exit)
                .replace(R.id.fragment,new FragmentMain())
                .commit();
    }
}
