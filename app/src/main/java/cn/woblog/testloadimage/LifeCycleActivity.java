package cn.woblog.testloadimage;

import android.annotation.TargetApi;
import android.app.FragmentManager;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LifeCycleActivity extends AppCompatActivity {
    static final String FRAGMENT_TAG = "com.bumptech.glide.manager";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);

        bindLifeCycle(this);
    }

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
private void bindLifeCycle(LifeCycleActivity activity) {
    FragmentManager fm = activity.getFragmentManager();
    //将一个fragment绑定到当前界面，这样就能获取到了当前界面的生命周期了
    LifeCycleFragment current = new LifeCycleFragment();
    fm.beginTransaction().add(current, FRAGMENT_TAG).commitAllowingStateLoss();
}
}
