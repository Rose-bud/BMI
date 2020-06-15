package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private int index;
    private float BMI,height,weight;
    private static final String TAG="MainActivity";
    private Button btn;

    /*
    private ImageView imageView1;
    private int[] images={R.drawable.t1,R.drawable.t2,R.drawable.t3,R.drawable.t4,R.drawable.t5,R.drawable.t6};
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnNew);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

                EditText editHeight = findViewById(R.id.editHeight);
                EditText editWeight = findViewById(R.id.editWeight);
                height = Float.parseFloat(editHeight.getText().toString());
                weight = Float.parseFloat(editWeight.getText().toString());
                BMI = weight/(height*height)*10000;

                if(BMI >0&& BMI<18.5){
                    index=0;
                }else if(BMI>=18.5&&BMI<24){
                    index=1;
                }else if(BMI>=24&&BMI<27){
                    index=2;
                }else
                {
                    index=3;
                }

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("index", index);//传index
                intent.putExtra("BMI", BMI);//传BMI
                startActivity(intent);
    }
}




