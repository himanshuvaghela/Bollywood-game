package com.example.purvampujari.bolllywood;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity{
    TextView player;
    LinearLayout ll1;
    TextView editText;
    TextView kb[]=new TextView[38];
    LinearLayout abc;
    String movie1,movie2,i;
    char c;
    int j,s=1,z,sbc=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        player = (TextView) findViewById(R.id.player);
        ll1 = (LinearLayout) findViewById(R.id.ll1);
        abc=(LinearLayout)findViewById(R.id.abc);
        kb[0]=(TextView)findViewById(R.id.kb0);
        kb[1]=(TextView)findViewById(R.id.kb1);
        kb[2]=(TextView)findViewById(R.id.kb2);
        kb[3]=(TextView)findViewById(R.id.kb3);
        kb[4]=(TextView)findViewById(R.id.kb4);
        kb[5]=(TextView)findViewById(R.id.kb5);
        kb[6]=(TextView)findViewById(R.id.kb6);
        kb[7]=(TextView)findViewById(R.id.kb7);
        kb[8]=(TextView)findViewById(R.id.kb8);
        kb[9]=(TextView)findViewById(R.id.kb9);
        kb[11]=(TextView)findViewById(R.id.kbA);
        kb[12]=(TextView)findViewById(R.id.kbB);
        kb[13]=(TextView)findViewById(R.id.kbC);
        kb[14]=(TextView)findViewById(R.id.kbD);
        kb[15]=(TextView)findViewById(R.id.kbE);
        kb[16]=(TextView)findViewById(R.id.kbF);
        kb[17]=(TextView)findViewById(R.id.kbG);
        kb[18]=(TextView)findViewById(R.id.kbH);
        kb[19]=(TextView)findViewById(R.id.kbI);
        kb[20]=(TextView)findViewById(R.id.kbJ);
        kb[21]=(TextView)findViewById(R.id.kbK);
        kb[22]=(TextView)findViewById(R.id.kbL);
        kb[23]=(TextView)findViewById(R.id.kbM);
        kb[24]=(TextView)findViewById(R.id.kbN);
        kb[25]=(TextView)findViewById(R.id.kbO);
        kb[26]=(TextView)findViewById(R.id.kbP);
        kb[27]=(TextView)findViewById(R.id.kbQ);
        kb[28]=(TextView)findViewById(R.id.kbR);
        kb[29]=(TextView)findViewById(R.id.kbS);
        kb[30]=(TextView)findViewById(R.id.kbT);
        kb[31]=(TextView)findViewById(R.id.kbU);
        kb[32]=(TextView)findViewById(R.id.kbV);
        kb[33]=(TextView)findViewById(R.id.kbW);
        kb[34]=(TextView)findViewById(R.id.kbX);
        kb[35]=(TextView)findViewById(R.id.kbY);
        kb[36]=(TextView)findViewById(R.id.kbZ);
        editText = (TextView) findViewById(R.id.editText);
        String player1 = getIntent().getStringExtra("player1");
        String player2 = getIntent().getStringExtra("player2");
        i = getIntent().getStringExtra("i");
        if (i.equals("1")) {
            player.setText(player1);
            abc.setBackgroundColor(Color.parseColor("#c7052c"));
            player.setTextColor(Color.parseColor("#c7052c"));
            editText.setTextColor(Color.parseColor("#c7052c"));
            ll1.setBackgroundColor(Color.parseColor("#c7052c"));
        }
        if (i.equals("2")) {
            abc.setBackgroundColor(Color.parseColor("#0ca60b"));
            player.setText(player2);
            player.setTextColor(Color.parseColor("#0ca60b"));
            editText.setTextColor(Color.parseColor("#0ca60b"));
            ll1.setBackgroundColor(Color.parseColor("#0ca60b"));
        }
    }
    public void ok(View view) {

        c = 1;
        s = 1;

        if (i.equals("1")) {
            movie1 = editText.getText().toString();

            if ((movie1.length() == 0))
                Toast.makeText(this, "Enter the movie !", Toast.LENGTH_SHORT).show();
            else {

                SharedPreferences sharedPreferences = getSharedPreferences("mydata", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("movie2", movie1);
                editor.commit();
                Intent intent = new Intent(this, Main3Activity.class);
                intent.putExtra("movie", movie1);
                intent.putExtra("i", "1");
                startActivity(intent);
                finish();
            }

        }
        if (i.equals("2")) {
            movie2 = editText.getText().toString();
            if ((movie2.length() == 0))
                Toast.makeText(this, "Enter the movie !", Toast.LENGTH_SHORT).show();
            else {
                SharedPreferences sharedPreferences = getSharedPreferences("mydata", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("movie1", movie2);
                editor.commit();
                Intent intent = new Intent(this, Main3Activity.class);
                intent.putExtra("movie", movie2);
                intent.putExtra("i", "2");
                startActivity(intent);
                finish();

            }
        }
    }
    public void app(){
        editText.setText(editText.getText().toString()+c+"");
    }
    public void A(View view){c='A';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=11;kb[11].setTextColor(Color.parseColor("#000000"));kb[11].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void B(View view){c='B';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=12;kb[12].setTextColor(Color.parseColor("#000000"));kb[12].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void C(View view){c='C';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=13;kb[13].setTextColor(Color.parseColor("#000000"));kb[13].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void D(View view){c='D';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=14;kb[14].setTextColor(Color.parseColor("#000000"));kb[14].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void E(View view){c='E';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=15;kb[15].setTextColor(Color.parseColor("#000000"));kb[15].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void F(View view){c='F';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=16;kb[16].setTextColor(Color.parseColor("#000000"));kb[16].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void G(View view){c='G';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=17;kb[17].setTextColor(Color.parseColor("#000000"));kb[17].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void H(View view){c='H';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=18;kb[18].setTextColor(Color.parseColor("#000000"));kb[18].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void I(View view){c='I';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=19;kb[19].setTextColor(Color.parseColor("#000000"));kb[19].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void J(View view){c='J';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=20;kb[20].setTextColor(Color.parseColor("#000000"));kb[20].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void K(View view){c='K';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=21;kb[21].setTextColor(Color.parseColor("#000000"));kb[21].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void L(View view){c='L';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=22;kb[22].setTextColor(Color.parseColor("#000000"));kb[22].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void M(View view){c='M';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=23;kb[23].setTextColor(Color.parseColor("#000000"));kb[23].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void N(View view){c='N';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=24;kb[24].setTextColor(Color.parseColor("#000000"));kb[24].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void O(View view){c='O';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=25;kb[25].setTextColor(Color.parseColor("#000000"));kb[25].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void P(View view){c='P';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=26;kb[26].setTextColor(Color.parseColor("#000000"));kb[26].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void Q(View view){c='Q';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=27;kb[27].setTextColor(Color.parseColor("#000000"));kb[27].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void R(View view){c='R';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=28;kb[28].setTextColor(Color.parseColor("#000000"));kb[28].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void S(View view){c='S';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=29;kb[29].setTextColor(Color.parseColor("#000000"));kb[29].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void T(View view){c='T';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=30;kb[30].setTextColor(Color.parseColor("#000000"));kb[30].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void U(View view){c='U';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=31;kb[31].setTextColor(Color.parseColor("#000000"));kb[31].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void V(View view){c='V';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=32;kb[32].setTextColor(Color.parseColor("#000000"));kb[32].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void W(View view){c='W';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=33;kb[33].setTextColor(Color.parseColor("#000000"));kb[33].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void X(View view){c='X';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=34;kb[34].setTextColor(Color.parseColor("#000000"));kb[34].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void Y(View view){c='Y';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=35;kb[35].setTextColor(Color.parseColor("#000000"));kb[35].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void Z(View view){c='Z';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=36;kb[36].setTextColor(Color.parseColor("#000000"));kb[36].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void a0(View view){c='0';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=0;kb[0].setTextColor(Color.parseColor("#000000"));kb[0].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void a1(View view){c='1';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=1;kb[1].setTextColor(Color.parseColor("#000000"));kb[1].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void a2(View view){c='2';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=2;;kb[2].setTextColor(Color.parseColor("#000000"));kb[2].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void a3(View view){c='3';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=3;kb[3].setTextColor(Color.parseColor("#000000"));kb[3].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void a4(View view){c='4';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=4;kb[4].setTextColor(Color.parseColor("#000000"));kb[4].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void a5(View view){c='5';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=5;kb[5].setTextColor(Color.parseColor("#000000"));kb[5].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void a6(View view){c='6';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=6;kb[6].setTextColor(Color.parseColor("#000000"));kb[6].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void a7(View view){c='7';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=7;kb[7].setTextColor(Color.parseColor("#000000"));kb[7].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void a8(View view){c='8';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=8;kb[8].setTextColor(Color.parseColor("#000000"));kb[8].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void a9(View view){c='9';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=9;kb[9].setTextColor(Color.parseColor("#000000"));kb[9].setBackgroundColor(Color.parseColor("#ffffff"));app();sbc=0;}
    public void sb(View view){
        if(sbc==0){
            if(editText.getText().toString().equals("") || editText.getText().toString().length() == 0)
            {}
            else if(editText.getText().toString().charAt(editText.getText().toString().length()-1)==' '){

            }
            else{
        c=' ';app();app();kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));}}
        sbc=1;}
    public void bp(View view){
        kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));
        if(editText.getText().toString().equals("") || editText.getText().toString().length() == 0)
        {}
        else if(editText.getText().toString().charAt(editText.getText().toString().length()-1)==' ')
            editText.setText(editText.getText().toString().substring(0, editText.getText().toString().length()-2));
        else
            editText.setText(editText.getText().toString().substring(0, editText.getText().toString().length()-1));
        sbc=0;}
    }

