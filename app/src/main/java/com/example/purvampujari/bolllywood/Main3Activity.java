package com.example.purvampujari.bolllywood;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import static com.example.purvampujari.bolllywood.R.id.kb1;

public class Main3Activity extends AppCompatActivity {
    TextView tt[][]=new TextView[10][10];
    View v;
    //Main3Activity main=new Main3Activity();
    TextView b[]=new TextView[9];
    TextView kb[]=new TextView[38];
    LinearLayout abc;
    char c;
    ImageView kbb;
    TextView tv2,play;
    int z,score1,score2;
    int bscore1=0,bscore2=0,len,leng,flag2;
    float mscore1,mscore2;
    char t[]=new  char[100];
    char l[]=new char[40];
    String i,movie,player1,player2;
    int j,m,n,count,countl=5,bl=0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        i = getIntent().getStringExtra("i");
        movie = getIntent().getStringExtra("movie");
        play=(TextView)findViewById(R.id.play);
        abc=(LinearLayout)findViewById(R.id.abc);
        kbb=(ImageView)findViewById(R.id.kb10);
        c='*';
        flag2=0;
        kb[0]=(TextView)findViewById(R.id.kb0);
        kb[1]=(TextView)findViewById(kb1);
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
        b[0]=(TextView)findViewById(R.id.b0);
        b[1]=(TextView)findViewById(R.id.b1);
        b[2]=(TextView)findViewById(R.id.b2);
        b[3]=(TextView)findViewById(R.id.b3);
        b[4]=(TextView)findViewById(R.id.b4);
        b[5]=(TextView)findViewById(R.id.b5);
        b[6]=(TextView)findViewById(R.id.b6);
        b[7]=(TextView)findViewById(R.id.b7);
        b[8]=(TextView)findViewById(R.id.b8);
        tt[0][0]=(TextView)findViewById(R.id.tt00);
        tt[0][1]=(TextView)findViewById(R.id.tt01);
        tt[0][2]=(TextView)findViewById(R.id.tt02);
        tt[0][3]=(TextView)findViewById(R.id.tt03);
        tt[0][4]=(TextView)findViewById(R.id.tt04);
        tt[0][5]=(TextView)findViewById(R.id.tt05);
        tt[0][6]=(TextView)findViewById(R.id.tt06);
        tt[0][7]=(TextView)findViewById(R.id.tt07);
        tt[0][8]=(TextView)findViewById(R.id.tt08);
        tt[0][9]=(TextView)findViewById(R.id.tt09);
        tt[1][0]=(TextView)findViewById(R.id.tt10);
        tt[1][1]=(TextView)findViewById(R.id.tt11);
        tt[1][2]=(TextView)findViewById(R.id.tt12);
        tt[1][3]=(TextView)findViewById(R.id.tt13);
        tt[1][4]=(TextView)findViewById(R.id.tt14);
        tt[1][5]=(TextView)findViewById(R.id.tt15);
        tt[1][6]=(TextView)findViewById(R.id.tt16);
        tt[1][7]=(TextView)findViewById(R.id.tt17);
        tt[1][8]=(TextView)findViewById(R.id.tt18);
        tt[1][9]=(TextView)findViewById(R.id.tt19);
        tt[2][0]=(TextView)findViewById(R.id.tt20);
        tt[2][1]=(TextView)findViewById(R.id.tt21);
        tt[2][2]=(TextView)findViewById(R.id.tt22);
        tt[2][3]=(TextView)findViewById(R.id.tt23);
        tt[2][4]=(TextView)findViewById(R.id.tt24);
        tt[2][5]=(TextView)findViewById(R.id.tt25);
        tt[2][6]=(TextView)findViewById(R.id.tt26);
        tt[2][7]=(TextView)findViewById(R.id.tt27);
        tt[2][8]=(TextView)findViewById(R.id.tt28);
        tt[2][9]=(TextView)findViewById(R.id.tt29);
        tt[3][0]=(TextView)findViewById(R.id.tt30);
        tt[3][1]=(TextView)findViewById(R.id.tt31);
        tt[3][2]=(TextView)findViewById(R.id.tt32);
        tt[3][3]=(TextView)findViewById(R.id.tt33);
        tt[3][4]=(TextView)findViewById(R.id.tt34);
        tt[3][5]=(TextView)findViewById(R.id.tt35);
        tt[3][6]=(TextView)findViewById(R.id.tt36);
        tt[3][7]=(TextView)findViewById(R.id.tt37);
        tt[3][8]=(TextView)findViewById(R.id.tt38);
        tt[3][9]=(TextView)findViewById(R.id.tt39);
        tt[4][0]=(TextView)findViewById(R.id.tt40);
        tt[4][1]=(TextView)findViewById(R.id.tt41);
        tt[4][2]=(TextView)findViewById(R.id.tt42);
        tt[4][3]=(TextView)findViewById(R.id.tt43);
        tt[4][4]=(TextView)findViewById(R.id.tt44);
        tt[4][5]=(TextView)findViewById(R.id.tt45);
        tt[4][6]=(TextView)findViewById(R.id.tt46);
        tt[4][7]=(TextView)findViewById(R.id.tt47);
        tt[4][8]=(TextView)findViewById(R.id.tt48);
        tt[4][9]=(TextView)findViewById(R.id.tt49);
        tt[5][0]=(TextView)findViewById(R.id.tt50);
        tt[5][1]=(TextView)findViewById(R.id.tt51);
        tt[5][2]=(TextView)findViewById(R.id.tt52);
        tt[5][3]=(TextView)findViewById(R.id.tt53);
        tt[5][4]=(TextView)findViewById(R.id.tt54);
        tt[5][5]=(TextView)findViewById(R.id.tt55);
        tt[5][6]=(TextView)findViewById(R.id.tt56);
        tt[5][7]=(TextView)findViewById(R.id.tt57);
        tt[5][8]=(TextView)findViewById(R.id.tt58);
        tt[5][9]=(TextView)findViewById(R.id.tt59);
        tt[6][0]=(TextView)findViewById(R.id.tt60);
        tt[6][1]=(TextView)findViewById(R.id.tt61);
        tt[6][2]=(TextView)findViewById(R.id.tt62);
        tt[6][3]=(TextView)findViewById(R.id.tt63);
        tt[6][4]=(TextView)findViewById(R.id.tt64);
        tt[6][5]=(TextView)findViewById(R.id.tt65);
        tt[6][6]=(TextView)findViewById(R.id.tt66);
        tt[6][7]=(TextView)findViewById(R.id.tt67);
        tt[6][8]=(TextView)findViewById(R.id.tt68);
        tt[6][9]=(TextView)findViewById(R.id.tt69);
        tt[7][0]=(TextView)findViewById(R.id.tt70);
        tt[7][1]=(TextView)findViewById(R.id.tt71);
        tt[7][2]=(TextView)findViewById(R.id.tt72);
        tt[7][3]=(TextView)findViewById(R.id.tt73);
        tt[7][4]=(TextView)findViewById(R.id.tt74);
        tt[7][5]=(TextView)findViewById(R.id.tt75);
        tt[7][6]=(TextView)findViewById(R.id.tt76);
        tt[7][7]=(TextView)findViewById(R.id.tt77);
        tt[7][8]=(TextView)findViewById(R.id.tt78);
        tt[7][9]=(TextView)findViewById(R.id.tt79);
        tt[8][0]=(TextView)findViewById(R.id.tt80);
        tt[8][1]=(TextView)findViewById(R.id.tt81);
        tt[8][2]=(TextView)findViewById(R.id.tt82);
        tt[8][3]=(TextView)findViewById(R.id.tt83);
        tt[8][4]=(TextView)findViewById(R.id.tt84);
        tt[8][5]=(TextView)findViewById(R.id.tt85);
        tt[8][6]=(TextView)findViewById(R.id.tt86);
        tt[8][7]=(TextView)findViewById(R.id.tt87);
        tt[8][8]=(TextView)findViewById(R.id.tt88);
        tt[8][9]=(TextView)findViewById(R.id.tt89);
        tt[9][0]=(TextView)findViewById(R.id.tt90);
        tt[9][1]=(TextView)findViewById(R.id.tt91);
        tt[9][2]=(TextView)findViewById(R.id.tt92);
        tt[9][3]=(TextView)findViewById(R.id.tt93);
        tt[9][4]=(TextView)findViewById(R.id.tt94);
        tt[9][5]=(TextView)findViewById(R.id.tt95);
        tt[9][6]=(TextView)findViewById(R.id.tt96);
        tt[9][7]=(TextView)findViewById(R.id.tt97);
        tt[9][8]=(TextView)findViewById(R.id.tt98);
        tt[9][9]=(TextView)findViewById(R.id.tt99);
        SharedPreferences sharedPreferences=getSharedPreferences("mydata", Context.MODE_PRIVATE);
        player1 =sharedPreferences.getString("player1","player1");
        player2 =sharedPreferences.getString("player2","player2");
        movie=movie.toUpperCase();
        t=movie.toCharArray();
        l[0]='A';
        l[1]='E';
        l[2]='I';
        l[3]='O';
        l[4]='U';
        for(int l=0;l<=9;l++)
            kb[l].setEnabled(true);
        for(int l=11;l<=36;l++)
            kb[l].setEnabled(true);
        kbb.setEnabled(true);
        if (i.equals("2")) {
            len=0;
            play.setText(player1);
            play.setTextColor(Color.parseColor("#c7052c"));
            abc.setBackgroundColor(Color.parseColor("#c7052c"));
            for (j = 0,count=1, m = 0, n = 0; j < movie.length(); n++, j++) {
                if (t[j] == ' ') {
                    m++;
                    count=1;
                    n = -1;
                    j++;
                    continue;
                }
                if(count>10){
                    m++;
                    n=0;
                    count=1;
                }
                len++;

                tt[m][n].setText("  ");
                tt[m][n].setBackgroundColor(Color.parseColor("#87f2d6"));
                if((t[j]== '0')||(t[j]== '1')||(t[j]== '2')||(t[j]== '3')||(t[j]== '4')||(t[j]== '5')||(t[j]== '6')||(t[j]== '7')||(t[j]== '8')||(t[j]== '9'))
                    tt[m][n].setBackgroundColor(Color.parseColor("#fcbcf5"));
                if ((t[j] == 'A')||(t[j] == 'E')||(t[j] == 'I')||(t[j] == 'O')||(t[j] == 'U')){
                    tt[m][n].setText(t[j] + "");
                    len--;
                    tt[m][n].setBackgroundColor(Color.parseColor("#c7052c"));
                }
                count++;
            }
            leng=len;
            if(len==0) {
                flag2=1;
                c='+';
                letters(v);
            }
        }
        if (i.equals("1")) {
            play.setText(player2);
            play.setTextColor(Color.parseColor("#0ca60b"));
            abc.setBackgroundColor(Color.parseColor("#0ca60b"));
            for (j = 0,count=1, m = 0, n = 0; j < movie.length(); n++, j++) {
                if (t[j] == ' ') {
                    m++;
                    j++;
                    count=1;
                    n = -1;
                    continue;
                }
                if(count>10){
                    m++;
                    n=0;
                    count=1;
                }
                len++;

                tt[m][n].setText("  ");
                tt[m][n].setBackgroundColor(Color.parseColor("#87f2d6"));
                if((t[j]== '0')||(t[j]== '1')||(t[j]== '2')||(t[j]== '3')||(t[j]== '4')||(t[j]== '5')||(t[j]== '6')||(t[j]== '7')||(t[j]== '8')||(t[j]== '9'))
                    tt[m][n].setBackgroundColor(Color.parseColor("#fcbcf5"));
                tt[m][n].setText("  ");
                if ((t[j] == 'A')||(t[j] == 'E')||(t[j] == 'I')||(t[j] == 'O')||(t[j] == 'U')){
                    tt[m][n].setText(t[j] + "");
                    len--;
                    tt[m][n].setBackgroundColor(Color.parseColor("#0ca60b"));
                }
                count++;
            }
            leng=len;
            if(len==0) {
                flag2=1;
                c='+';
                letters(v);
            }
        }
    }
    public void letters(View view){
        if((c!='*')||(c=='+')) {
            kb[z].setBackgroundColor(Color.parseColor("#000000"));
            kb[z].setTextColor(Color.parseColor("#ffffff"));
            int flag = 0, flag1 = 0, countn;
            for (j = 0, countn = 0; j < countl; j++) {
                if ((l[j] == c) && (countn == 0)) {
                    flag1 = 1;
                    countn = 1;
                }
            }
            for (j = 0, count = 1, m = 0, n = 0; j < movie.length(); n++, j++) {
                if (t[j] == ' ') {
                    m++;
                    n = -1;
                    j++;
                    count = 1;
                    continue;
                }
                if (count > 10) {
                    m++;
                    n = 0;
                    count = 1;
                }
                if (t[j] == c) {
                    tt[m][n].setText(t[j] + "");
                    if (i.equals("2"))
                        tt[m][n].setBackgroundColor(Color.parseColor("#c7052c"));
                    if (i.equals("1"))
                        tt[m][n].setBackgroundColor(Color.parseColor("#0ca60b"));
                    flag = 1;
                    l[countl] = c;
                    countl++;
                    if (flag1 != 1)
                        len--;
                }
                count++;

            }
            if (i.equals("1")) {
                if ((flag == 0) || (flag1 == 1)) {
                    b[bl].setBackgroundColor(Color.parseColor("#ffffff"));
                    bl++;
                    bscore2 = 9 - bl;
                    bscore2 *= 10;


                }
                if (bl == 0) {
                    bscore2 = 100;

                }
                mscore2 = (1 - (((float) len) / ((float) leng))) * 100;
                score2 = bscore2 + (int) mscore2;
                tv2 = (TextView) findViewById(R.id.tv2);
                if (flag2 == 1) {
                    score2 = 200;

                    b[0].setBackgroundColor(Color.parseColor("#000000"));
                }

                        tv2.setText("  Score : " + score2 + "  ");


                if ((bl == 9) || (len == 0)) {
                    final Intent intent1 = new Intent(this, Main2Activity.class);
                    for (int l = 0; l <= 9; l++)
                        kb[l].setEnabled(false);
                    for (int l = 11; l <= 36; l++)
                        kb[l].setEnabled(false);
                    kbb.setEnabled(false);
                    new CountDownTimer(3000, 1000) {
                        public void onTick(long millisUntilFinished) {

                        }

                        public void onFinish() {
                            SharedPreferences sharedPreferences = getSharedPreferences("mydata", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.putInt("score2", score2);
                            editor.commit();
                            intent1.putExtra("player1", player1);
                            intent1.putExtra("player2", player2);
                            intent1.putExtra("i", "2");
                            bl = 0;
                            startActivity(intent1);
                            finish();
                        }

                    }.start();

                }
            }

            if (i.equals("2")) {

                if ((flag == 0) || (flag1 == 1)) {
                    b[bl].setBackgroundColor(Color.parseColor("#ffffff"));
                    bl++;
                    bscore1 = 9 - bl;
                    bscore1 *= 10;
                }
                if (bl == 0)
                    bscore1 = 100;

                mscore1 = (1 - (((float) len) / ((float) leng))) * 100;
                score1 = bscore1 + (int) mscore1;
                tv2 = (TextView) findViewById(R.id.tv2);
                if (flag2 == 1) {
                    score1 = 200;
                    b[0].setBackgroundColor(Color.parseColor("#000000"));
                }
                tv2.setText("  Score : " + score1 + "  ");

                if ((bl == 9) || (len == 0)) {
                    final Intent intent2 = new Intent(this, Main4Activity.class);
                    for (int l = 0; l <= 9; l++)
                        kb[l].setEnabled(false);
                    for (int l = 11; l <= 36; l++)
                        kb[l].setEnabled(false);
                    kbb.setEnabled(false);
                    new CountDownTimer(3000, 1000) {

                        @Override
                        public void onTick(long l) {

                        }

                        @Override
                        public void onFinish() {
                            SharedPreferences sharedPreferences = getSharedPreferences("mydata", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.putInt("score1", score1);
                            editor.commit();
                            startActivity(intent2);
                            finish();
                        }

                    }.start();
                }
            }
        }
        c='*';
    }
    public void A(View view){c='A';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=11;kb[11].setTextColor(Color.parseColor("#000000"));kb[11].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void B(View view){c='B';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=12;kb[12].setTextColor(Color.parseColor("#000000"));kb[12].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void C(View view){c='C';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=13;kb[13].setTextColor(Color.parseColor("#000000"));kb[13].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void D(View view){c='D';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=14;kb[14].setTextColor(Color.parseColor("#000000"));kb[14].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void E(View view){c='E';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=15;kb[15].setTextColor(Color.parseColor("#000000"));kb[15].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void F(View view){c='F';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=16;kb[16].setTextColor(Color.parseColor("#000000"));kb[16].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void G(View view){c='G';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=17;kb[17].setTextColor(Color.parseColor("#000000"));kb[17].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void H(View view){c='H';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=18;kb[18].setTextColor(Color.parseColor("#000000"));kb[18].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void I(View view){c='I';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=19;kb[19].setTextColor(Color.parseColor("#000000"));kb[19].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void J(View view){c='J';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=20;kb[20].setTextColor(Color.parseColor("#000000"));kb[20].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void K(View view){c='K';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=21;kb[21].setTextColor(Color.parseColor("#000000"));kb[21].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void L(View view){c='L';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=22;kb[22].setTextColor(Color.parseColor("#000000"));kb[22].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void M(View view){c='M';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=23;kb[23].setTextColor(Color.parseColor("#000000"));kb[23].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void N(View view){c='N';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=24;kb[24].setTextColor(Color.parseColor("#000000"));kb[24].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void O(View view){c='O';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=25;kb[25].setTextColor(Color.parseColor("#000000"));kb[25].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void P(View view){c='P';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=26;kb[26].setTextColor(Color.parseColor("#000000"));kb[26].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void Q(View view){c='Q';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=27;kb[27].setTextColor(Color.parseColor("#000000"));kb[27].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void R(View view){c='R';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=28;kb[28].setTextColor(Color.parseColor("#000000"));kb[28].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void S(View view){c='S';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=29;kb[29].setTextColor(Color.parseColor("#000000"));kb[29].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void T(View view){c='T';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=30;kb[30].setTextColor(Color.parseColor("#000000"));kb[30].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void U(View view){c='U';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=31;kb[31].setTextColor(Color.parseColor("#000000"));kb[31].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void V(View view){c='V';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=32;kb[32].setTextColor(Color.parseColor("#000000"));kb[32].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void W(View view){c='W';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=33;kb[33].setTextColor(Color.parseColor("#000000"));kb[33].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void X(View view){c='X';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=34;kb[34].setTextColor(Color.parseColor("#000000"));kb[34].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void Y(View view){c='Y';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=35;kb[35].setTextColor(Color.parseColor("#000000"));kb[35].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void Z(View view){c='Z';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=36;kb[36].setTextColor(Color.parseColor("#000000"));kb[36].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void a0(View view){c='0';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=0;kb[0].setTextColor(Color.parseColor("#000000"));kb[0].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void a1(View view){c='1';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=1;kb[1].setTextColor(Color.parseColor("#000000"));kb[1].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void a2(View view){c='2';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=2;;kb[2].setTextColor(Color.parseColor("#000000"));kb[2].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void a3(View view){c='3';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=3;kb[3].setTextColor(Color.parseColor("#000000"));kb[3].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void a4(View view){c='4';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=4;kb[4].setTextColor(Color.parseColor("#000000"));kb[4].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void a5(View view){c='5';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=5;kb[5].setTextColor(Color.parseColor("#000000"));kb[5].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void a6(View view){c='6';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=6;kb[6].setTextColor(Color.parseColor("#000000"));kb[6].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void a7(View view){c='7';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=7;kb[7].setTextColor(Color.parseColor("#000000"));kb[7].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void a8(View view){c='8';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=8;kb[8].setTextColor(Color.parseColor("#000000"));kb[8].setBackgroundColor(Color.parseColor("#ffffff"));}
    public void a9(View view){c='9';kb[z].setBackgroundColor(Color.parseColor("#000000"));kb[z].setTextColor(Color.parseColor("#ffffff"));z=9;kb[9].setTextColor(Color.parseColor("#000000"));kb[9].setBackgroundColor(Color.parseColor("#ffffff"));}

    @Override
    public void onBackPressed() {
        return;
    }
}
















