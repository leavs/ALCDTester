package com.chipsee.alcdtester;

import android.app.Activity;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "AndroidLCDTester";
    LcdTestView mLcdTestView;
    private int colornum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /* Just use Layout Background Color.
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        final ConstraintLayout constraintLayout = (ConstraintLayout) layoutInflater.inflate(R.layout.activity_main, null) ;
        constraintLayout.setBackgroundColor(Color.RED);
        setContentView(constraintLayout);
        */

        /*Use custom LcdTestView*/
        setContentView(R.layout.activity_main);
        mLcdTestView = findViewById(R.id.lcdtestview);
        mLcdTestView.setBackgroundColor(Color.RED);

        hideSystemUI();

        //constraintLayout.setOnClickListener(new View.OnClickListener(){
         mLcdTestView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                colornum++;
                switch(colornum){
                    case 1:
                        mLcdTestView.setBackgroundColor(Color.GREEN);
                        //constraintLayout.setBackgroundColor(Color.GREEN);
                        break;
                    case 2:
                        mLcdTestView.setBackgroundColor(Color.BLUE);
                        //constraintLayout.setBackgroundColor(Color.BLUE);
                        break;
                    case 3:
                        mLcdTestView.setBackgroundColor(Color.WHITE);
                        //constraintLayout.setBackgroundColor(Color.WHITE);
                        break;
                    case 4:
                        mLcdTestView.setBackgroundColor(Color.GRAY);
                        //constraintLayout.setBackgroundColor(Color.GRAY);
                        break;
                    case 5:
                        mLcdTestView.setBackgroundColor(Color.BLACK);
                        //constraintLayout.setBackgroundColor(Color.BLACK);
                        break;
                    case 6:
                        mLcdTestView.grayScale(true);
                        mLcdTestView.paneBorder(false);
                        mLcdTestView.postInvalidate();
                        break;
                    case 7:
                        mLcdTestView.paneBorder(true);
                        mLcdTestView.grayScale(false);
                        mLcdTestView.postInvalidate();
                        break;
                    case 8:
                        finish();
                        break;
                    default:
                        break;
                }

            }
        });

    }

    private void hideSystemUI() {
        View mDecorView = getWindow().getDecorView();
        // Set the IMMERSIVE flag.
        // Set the content to appear under the system bars so that the content
        // doesn't resize when the system bars hide and show.
        mDecorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION   // hide nav bar
                        | View.SYSTEM_UI_FLAG_FULLSCREEN        // hide status bar
                        | View.SYSTEM_UI_FLAG_IMMERSIVE );      // IMMERSIVE Android4.4 (API 19)
        //| SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
    }

    private void showSystemUI() {
        View mDecorView = getWindow().getDecorView();
        mDecorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }

}
