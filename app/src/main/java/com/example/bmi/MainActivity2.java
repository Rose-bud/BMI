package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    private Button btnResult;
    private ImageView imageView1;
    private int[] images={R.drawable.s1,R.drawable.s2,R.drawable.s3,R.drawable.s4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageView1=findViewById(R.id.imgChange);

        btnResult=findViewById(R.id.btnNew);
        Intent intent=getIntent();
        int index=intent.getIntExtra("index",0);
        float BMI=intent.getFloatExtra("BMI",0);

        switch(index){
            case 0:
                btnResult.setText("BMI值为"+BMI+"\n体重偏轻，应注重饮食");
                break;
            case 1:
                btnResult.setText("BMI值为"+BMI+"\n体重正常，继续保持");
                break;
            case 2:
                btnResult.setText("BMI值为"+BMI+"\n体重偏胖，注意运动");
                break;
            case 3:
                btnResult.setText("BMI值为"+BMI+"\n体重过胖，应立即减肥");
                break;
            default:
                btnResult.setText("结果错误");
        }
        imageView1.setImageResource(images[index]);
    }
}