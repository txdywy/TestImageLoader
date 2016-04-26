package cn.woblog.testloadimage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * 圆角图片
 */
public class CircleImageActivity extends AppCompatActivity {

    private ImageView imageView;

    private String url ="http://img1.imgtn.bdimg.com/it/u=2332039348,1866544533&fm=21&gp=0.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_image);
        imageView = (ImageView) findViewById(R.id.iv);


    }

    public void testNormal(View view){
        Glide.with(this).load(url).into(imageView);
    }
    public void testCircle1(View view){
        Glide.with(this).load(url).transform(new RoundTransformation(this,10)).into(imageView);
    }
    public void testCircle2(View view){
        Glide.with(this).load(url).transform(new CircleTransformation(this)).into(imageView);
    }

}
