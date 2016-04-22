package cn.woblog.testloadimage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import cn.woblog.testloadimage.adapter.ImageAdapter;

public class ListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private ImageAdapter mAdapter;

    private RecyclerView rv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recyclerView = (RecyclerView) findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(mAdapter = new ImageAdapter(this));

        rv1 = (RecyclerView) findViewById(R.id.rv1);
        rv1.setLayoutManager(new LinearLayoutManager(this));
        rv1.setAdapter(mAdapter);

        mAdapter.setData(getTestData());
    }

    private List<String> getTestData() {
        List<String> strings = new ArrayList<>();
        strings.add("http://img15.3lian.com/2015/f2/50/d/73_.jpg");
        strings.add("http://att.191.cn/attachment/Mon_1012/63_5974_9775edfdf2ca75a.jpg");
        strings.add("http://img.wallpapersking.com/d7/2012-8/2012081210374.jpg");
        strings.add("http://img.tuku.cn/file_big/201501/275c279cfc3f4547b29ffe8f39a2f04c.jpg");
        strings.add("http://pic15.nipic.com/20110720/7434631_111124480000_2.jpg");
        strings.add("http://pic4.nipic.com/20090827/3095621_083213047918_2.jpg");
        strings.add("http://pic7.nipic.com/20100421/4419638_165829027550_2.jpg");
        strings.add("http://t0.fansimg.com/uploads2010/08/userid245794time20100828130123.jpg");
        strings.add("http://pic23.nipic.com/20120812/8092962_193710223307_2.jpg");
        strings.add("http://pic23.nipic.com/20120918/10031483_133215033311_2.jpg");
        strings.add("http://pic4.nipic.com/20091012/3248724_144511066284_2.jpg");
        strings.add("http://pic.nipic.com/2008-03-11/200831115126384_2.jpg");
        strings.add("http://pic1a.nipic.com/2009-02-20/2009220152758211_2.jpg");
        strings.add("http://pic.nipic.com/2008-07-05/20087584237954_2.jpg");
        strings.add("http://pic7.nipic.com/20100421/4419638_165829027550_2.jpg");
        strings.add("http://5.26923.com/download/pic/000/263/ff5bc9a1c0386778a0ba1a783fd0fa2c.jpg");
        strings.add("http://pic4.nipic.com/20090803/2618170_100713057_2.jpg");
        strings.add("http://img2.duitang.com/uploads/item/201304/10/20130410194927_CVYsE.thumb.600_0.jpeg");
        strings.add("http://img.web07.cn/uploads/Photo/c101201/12911A0640P-23292.jpg");
        return strings;
    }
}
