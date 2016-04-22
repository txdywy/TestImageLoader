package cn.woblog.testloadimage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;

public class CustomTargetActivity extends AppCompatActivity {
    private String imgUrl = "http://www.siweiw.com/Upload/sy/2013616/20136161824820.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_target2);
        final LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll);

        Glide.with(this).load(imgUrl).into(new SimpleTarget<GlideDrawable>() {
            @Override
            public void onResourceReady(GlideDrawable resource, GlideAnimation<? super GlideDrawable> glideAnimation) {
                linearLayout.setBackgroundDrawable(resource);
            }
        });
    }
}
