package com.jikexueyuan.animatorfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //使用的fragment布局
        setContentView(R.layout.fragment);

        //
        getFragmentManager().beginTransaction().add(R.id.fragment,new FragmentMain()).commit();
    }

    @Override
    public void onBackPressed() {
        if (getFragmentManager().getBackStackEntryCount() > 0){
            //移除
            getFragmentManager().popBackStack();
        }else{
            super.onBackPressed();
        }


    }
}
