package eu.sheffield.citycollege.houseofcardz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int closed = 0;

    final Random rn = new Random();
    final int[] answer = new int[1];
    final int[] suma = new int[1];
    final int[] sumb = new int[1];
    final int[] sumc = new int[1];
    final int[] sumd = new int[1];
    final int[] score = new int[1];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btAlpha = findViewById(R.id.btAlpha);
        final Button btBravo = findViewById(R.id.btBravo);
        final Button btCharlie = findViewById(R.id.btCharlie);
        final Button btDelta = findViewById(R.id.btDelta);
        TextView tvnum = findViewById(R.id.tvnum);
        TextView tvsc = findViewById(R.id.tvsc);
        final Button btStart = findViewById(R.id.btStart);
        final TextView tva = findViewById(R.id.tva);
        final TextView tvb = findViewById(R.id.tvb);
        final TextView tvc = findViewById(R.id.tvc);
        final TextView tvd = findViewById(R.id.tvd);
        final TextView num = findViewById(R.id.num);
        final TextView sc = findViewById(R.id.sc);



        btStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer[0] = rn.nextInt(10) + 1;
                num.setText(String.valueOf(answer[0]));
                btStart.setAlpha(.5f);
                btStart.setClickable(false);
                if (!tva.getText().equals("X")) {
                    btAlpha.setAlpha(1);
                    btAlpha.setClickable(true);
                }
                if (!tvb.getText().equals("X")) {
                    btBravo.setAlpha(1);
                    btBravo.setClickable(true);
                }
                if (!tvc.getText().equals("X")) {
                    btCharlie.setAlpha(1);
                    btCharlie.setClickable(true);
                }
                if (!tvd.getText().equals("X")) {
                    btDelta.setAlpha(1);
                    btDelta.setClickable(true);
                }
            }
        });

        btAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                suma[0] = suma[0] + answer[0];
                tva.setText(String.valueOf(suma[0]));

                {
                    if (suma[0] == 21) {
                        suma[0] = 0;
                        score[0] = score[0] +10;
                        tva.setText(String.valueOf(suma[0]));
                        sc.setText(String.valueOf(score[0]));
                    }
                    else if (suma[0] == 30) {
                        score[0] = score[0] +50;
                        sc.setText(String.valueOf(score[0]));
                        tva.setText("X");
                        //btAlpha.setAlpha(.5f);
                        //btAlpha.setClickable(false);
                        closed++;
                        checkGameOver();
                    }

                    else if (suma[0] > 30) {
                        score[0] = score[0] -20;
                        sc.setText(String.valueOf(score[0]));
                        tva.setText("X");
                        //btAlpha.setAlpha(.5f);
                        //btAlpha.setClickable(false);
                        closed++;
                        checkGameOver();
                    }
                }
                btAlpha.setAlpha(.5f);
                btAlpha.setClickable(false);
                btBravo.setAlpha(.5f);
                btBravo.setClickable(false);
                btCharlie.setAlpha(.5f);
                btCharlie.setClickable(false);
                btDelta.setAlpha(.5f);
                btDelta.setClickable(false);
                btStart.setAlpha(1);
                btStart.setClickable(true);

            }
        });

        btBravo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumb[0] = sumb[0] + answer[0];
                tvb.setText(String.valueOf(sumb[0]));

                {
                    if (sumb[0] == 21) {
                        sumb[0] = 0;
                        score[0] = score[0] +10;
                        tvb.setText(String.valueOf(sumb[0]));
                        sc.setText(String.valueOf(score[0]));
                    }
                    else if (sumb[0] == 30) {
                        score[0] = score[0] +50;
                        sc.setText(String.valueOf(score[0]));
                        tvb.setText("X");
                        //btBravo.setAlpha(.5f);
                        //btBravo.setClickable(false);
                        closed++;
                        checkGameOver();
                    }

                    else if (sumb[0] > 30) {
                        score[0] = score[0] -20;
                        sc.setText(String.valueOf(score[0]));
                        tvb.setText("X");
                        //btBravo.setAlpha(.5f);
                        //btBravo.setClickable(false);
                        closed++;
                        checkGameOver();
                    }
                }

                btAlpha.setAlpha(.5f);
                btAlpha.setClickable(false);
                btBravo.setAlpha(.5f);
                btBravo.setClickable(false);
                btCharlie.setAlpha(.5f);
                btCharlie.setClickable(false);
                btDelta.setAlpha(.5f);
                btDelta.setClickable(false);
                btStart.setAlpha(1);
                btStart.setClickable(true);
            }
        });

        btCharlie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumc[0] = sumc[0] + answer[0];
                tvc.setText(String.valueOf(sumc[0]));

                {
                    if (sumc[0] == 21) {
                        sumc[0] = 0;
                        score[0] = score[0] +10;
                        tvc.setText(String.valueOf(sumc[0]));
                        sc.setText(String.valueOf(score[0]));
                    }
                    else if (sumc[0] == 30) {
                        score[0] = score[0] +50;
                        sc.setText(String.valueOf(score[0]));
                        tvc.setText("X");
                        //btCharlie.setAlpha(.5f);
                        //btCharlie.setClickable(false);
                        closed++;
                        checkGameOver();
                    }

                    else if (sumc[0] > 30) {
                        score[0] = score[0] -20;
                        sc.setText(String.valueOf(score[0]));
                        tvc.setText("X");
                        //btCharlie.setAlpha(.5f);
                        //btCharlie.setClickable(false);
                        closed++;
                        checkGameOver();
                    }
                }

                btAlpha.setAlpha(.5f);
                btAlpha.setClickable(false);
                btBravo.setAlpha(.5f);
                btBravo.setClickable(false);
                btCharlie.setAlpha(.5f);
                btCharlie.setClickable(false);
                btDelta.setAlpha(.5f);
                btDelta.setClickable(false);
                btStart.setAlpha(1);
                btStart.setClickable(true);
            }
        });

        btDelta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumd[0] = sumd[0] + answer[0];
                tvd.setText(String.valueOf(sumd[0]));

                {
                    if (sumd[0] == 21) {
                        sumd[0] = 0;
                        score[0] = score[0] +10;
                        tvd.setText(String.valueOf(sumd[0]));
                        sc.setText(String.valueOf(score[0]));
                    }
                    else if (sumd[0] == 30) {
                        score[0] = score[0] +50;
                        sc.setText(String.valueOf(score[0]));
                        tvd.setText("X");
                        //btDelta.setAlpha(.5f);
                        //btDelta.setClickable(false);
                        closed++;
                        checkGameOver();
                    }

                    else if (sumd[0] > 30) {
                        score[0] = score[0] -20;
                        sc.setText(String.valueOf(score[0]));
                        tvd.setText("X");
                        //btDelta.setAlpha(.5f);
                        //btDelta.setClickable(false);
                        closed++;
                        checkGameOver();
                    }
                }

                btAlpha.setAlpha(.5f);
                btAlpha.setClickable(false);
                btBravo.setAlpha(.5f);
                btBravo.setClickable(false);
                btCharlie.setAlpha(.5f);
                btCharlie.setClickable(false);
                btDelta.setAlpha(.5f);
                btDelta.setClickable(false);
                btStart.setAlpha(1);
                btStart.setClickable(true);
            }
        });



    }




    private void checkGameOver() {
        if (closed == 4) {
            Toast.makeText(MainActivity.this, "Game Over, Score: "+String.valueOf(score[0]), Toast.LENGTH_LONG).show();
            recreate();

        }

    }

}
