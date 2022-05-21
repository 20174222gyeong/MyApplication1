package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //추가 메인 엑티비티 xml 아이디
        ListView lv=findViewById(R.id.wow);
        stonelist flAdapter=new stonelist();

        lv.setAdapter(flAdapter);

        flAdapter.addstone(ContextCompat.getDrawable(this,R.drawable.image),"그린액션","맛있어");
        flAdapter.addstone(ContextCompat.getDrawable(this,R.drawable.image),"당나귀","맛있어");
        flAdapter.addstone(ContextCompat.getDrawable(this,R.drawable.image),"큰언니회","맛있어");
        flAdapter.addstone(ContextCompat.getDrawable(this,R.drawable.image),"푸른야학","맛있어");
        flAdapter.addstone(ContextCompat.getDrawable(this,R.drawable.image),"애니멀 애니몰","맛있어");
        flAdapter.addstone(ContextCompat.getDrawable(this,R.drawable.image),"두드림","맛있어");
    }
}