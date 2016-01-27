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

        //查找按钮 设置监听
        root.findViewById(R.id.btnShowAnotherFragment).setOnClickListener(this);

        return root;
    }

    @Override
    public void onClick(View v) {
        /**
         * R.animator.enter 进入效果 ,R.animator.exit 退出效果
         * addToBackStack("AnotherFragment") 添加到后退栈，支持后退
         *
         */
        getFragmentManager().beginTransaction()
                //arg:进入，退出，进入，退出
                .setCustomAnimations(R.animator.enter,R.animator.exit,R.animator.enter,R.animator.exit)
                .addToBackStack("AnotherFragment")
                .replace(R.id.fragment,new AnotherFragment())
                .commit();

    }
}
