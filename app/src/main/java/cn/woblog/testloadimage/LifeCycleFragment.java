package cn.woblog.testloadimage;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Build;
import android.util.Log;

/**
 * Created by ren on 2016/5/4 0004.
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class LifeCycleFragment extends Fragment {
    private static final String TAG = "LifeCycleFragment";

    @Override
    public void onStart() {
        super.onStart();
        //TODO 这里回调你的生命周期状态
        Log.d(TAG,"onStart");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }
}
