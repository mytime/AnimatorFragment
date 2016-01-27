package com.jikexueyuan.animatorfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2016/1/27.
 */
public class FragmentMain extends Fragment implements View.OnClickListener {

    //主布局
    private View root;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //解析布局 fragment_main
        root = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_main, null);

        //
        root.findViewById(R.id.btnShowAnotherFragment).setOnClickListener(this);

        return root;
    }

    @Override
    public void onClick(View v) {
        /**
         * addToBackStack("AnotherFragment") 添加到后退栈，支持后退
         */
        getFragmentManager().beginTransaction()
                .addToBackStack("AnotherFragment")
                .replace(R.id.fragment,new AnotherFragment())
                .commit();
        // TODO: 2016/1/27  动画效果 
    }
}
