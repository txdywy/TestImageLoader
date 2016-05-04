package cn.woblog.testloadimage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void testSpeed(View view){
        startActivity(new Intent(MainActivity.this,SpeedActivity.class));
    }
    public void testList(View view){
        startActivity(new Intent(MainActivity.this,ListActivity.class));
    }
    public void customTarget(View view){
        startActivity(new Intent(MainActivity.this,CustomTargetActivity.class));
    }
    public void circleImage(View view){
        startActivity(new Intent(MainActivity.this,CircleImageActivity.class));
    }
    public void testLifeCycle(View view){
        startActivity(new Intent(MainActivity.this,LifeCycleActivity.class));
    }


}
