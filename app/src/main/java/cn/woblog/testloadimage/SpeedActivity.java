package cn.woblog.testloadimage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class SpeedActivity extends AppCompatActivity {
    private String imgUrl = "http://www.siweiw.com/Upload/sy/2013616/20136161824820.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);

        ImageView iv1 = (ImageView) findViewById(R.id.iv1);
        Glide.with(this).load(imgUrl).centerCrop().into(iv1);
        ImageView iv2 = (ImageView) findViewById(R.id.iv2);
//        Glide.with(this).load(imgUrl).centerCrop().into(iv2);
//        ImageView iv3 = (ImageView) findViewById(R.id.iv3);
//        Glide.with(this).load(imgUrl).centerCrop().into(iv3);
//        ImageView iv4 = (ImageView) findViewById(R.id.iv4);
//        Glide.with(this).load(imgUrl).centerCrop().into(iv4);

        //如果是用centerCrop，必须始终width和height,设置weight会抛出如下异常
        //java.lang.IllegalStateException: Center crop requires calling resize with positive width and height.
        Picasso.with(this).load(imgUrl).
//                centerCrop().
                into(iv2);
    }
}
