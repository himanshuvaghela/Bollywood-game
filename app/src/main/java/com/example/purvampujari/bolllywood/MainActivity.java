package com.example.purvampujari.bolllywood;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText,editText1;
    int c=1,i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        editText=(EditText)findViewById(R.id.editText);
        editText1=(EditText)findViewById(R.id.editText1);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        TextView bol = (TextView) findViewById(R.id.bol);
        Animation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(450); //You can manage the blinking time with this parameter
        anim.setStartOffset(20);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);
        bol.startAnimation(anim);

    }
    public void start(View view){
        c=1;
        String player1=editText.getText().toString();
        player1=player1.toUpperCase();
        i=0;
        while(i<player1.length()&&player1.charAt(i)==' ')
            i++;
        if(i>=player1.length()) {
            editText.setText("");
            c = 0;
            Toast.makeText(this,"Player1 cannot be empty !",Toast.LENGTH_SHORT).show();
        }
        String player2=editText1.getText().toString();
        player2=player2.toUpperCase();
        i=0;
        while(i<player2.length()&&player2.charAt(i)==' ')
            i++;
        if(i>=player2.length()) {
            editText1.setText("");
            c = 0;
            Toast.makeText(this, "Player2 cannot be empty !", Toast.LENGTH_SHORT).show();
        }
        if(c==1) {
            Intent intent = new Intent(this, Main2Activity.class);
            SharedPreferences sharedPreferences=getSharedPreferences("mydata", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor=sharedPreferences.edit();
            editor.putString("player1",player1);
            editor.putString("player2",player2);
            editor.putInt("player",1);
            editor.commit();
            intent.putExtra("player1", player1);
            intent.putExtra("player2", player2);
            intent.putExtra("i", "1");
            startActivity(intent);
        }
    }

}
