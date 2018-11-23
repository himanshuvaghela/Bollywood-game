package com.example.purvampujari.bolllywood;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity{
String player1,player2,movie2,movie1;
    int score1,score2;
    TextView textVieww,textViewc,textView01,textView02,textView03,textView11,textView12,textView13;
    ImageView imageView,imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        SharedPreferences sharedPreferences=getSharedPreferences("mydata", Context.MODE_PRIVATE);
        textView01=(TextView)findViewById(R.id.textView01);
        textView02=(TextView)findViewById(R.id.textView02);
        textView03=(TextView)findViewById(R.id.textView03);
        textView11=(TextView)findViewById(R.id.textView11);
        textView12=(TextView)findViewById(R.id.textView12);
        textView13=(TextView)findViewById(R.id.textView13);
        textVieww=(TextView)findViewById(R.id.textVieww);
        textViewc=(TextView)findViewById(R.id.textViewc);
        imageView=(ImageView)findViewById(R.id.imageView);
        imageView2=(ImageView)findViewById(R.id.imageView2);
        Animation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(450); //You can manage the blinking time with this parameter
        anim.setStartOffset(20);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);
        textVieww.startAnimation(anim);
        player1 =sharedPreferences.getString("player1","player1");
        player2 =sharedPreferences.getString("player2","player2");
        movie2 =sharedPreferences.getString("movie2","movie2");
        movie1 =sharedPreferences.getString("movie1","movie1");
        score1 =sharedPreferences.getInt("score1",100);
        score2 =sharedPreferences.getInt("score2",100);
        textView01.setText(player1);
        textView11.setText(player2);
        textView03.setText(movie1);
        textView13.setText(movie2);
        textView02.setText(score1+"");
        textView12.setText(score2+"");
        if(score1>score2){
            textVieww.setText(player1);
            textVieww.setTextColor(Color.parseColor("#c7052c"));
            textViewc.setTextColor(Color.parseColor("#c7052c"));
            imageView.setImageResource(R.drawable.rs);
            imageView2.setImageResource(R.drawable.gc);
            imageView2.setPadding(0,0,0,0);
        }
        if(score1<score2){
            textVieww.setText(player2);
            textVieww.setTextColor(Color.parseColor("#0ca60b"));
            textViewc.setTextColor(Color.parseColor("#0ca60b"));
            imageView.setImageResource(R.drawable.rc);
            imageView2.setImageResource(R.drawable.gs);
            imageView.setPadding(0,0,0,0);
        }
        if(score1==score2){
            textVieww.setText(" TIE !!! ");
            textVieww.setTextColor(Color.parseColor("#3aa7ea"));
            textViewc.setTextColor(Color.parseColor("#3aa7ea"));
            imageView.setImageResource(R.drawable.rs);
            imageView2.setImageResource(R.drawable.gs);
            textViewc.setVisibility(View.INVISIBLE);
        }
    }
    public void rematch (View view){
        finish();
    }
    public void stop (View view){
        /*Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
        finish();*/
        finishAffinity();
    }
}
