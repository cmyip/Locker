package com.example.locker;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.*;

public class ScanNewCard extends AppCompatActivity {

    int tblRowCwtVal = 2;      // may take from config for define
    int tblColCwtVal = 24;     // may take from config for define

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_new_card);


        LinearLayout layout = (LinearLayout) findViewById(R.id.space_linear);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                100,
                100
        );
        params.setMargins(0, 0, 30, 0);

        TableLayout namTblLyoVar = new TableLayout(this);
        TableLayout.LayoutParams tblLyoRulVar = new TableLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        TableRow.LayoutParams btnLyoRulVar = new TableRow.LayoutParams(100,100);
        btnLyoRulVar.setMargins(0, 0, 30, 30);

        int numCol = tblColCwtVal/tblRowCwtVal;

        for(int tblRowIdxVar = 0; tblRowIdxVar < tblRowCwtVal; ++tblRowIdxVar)
        {
            TableRow tblRowVar = new TableRow(this);

            for(int tblColIdxVar = 0; tblColIdxVar < numCol; tblColIdxVar++)
            {

                Button myButton = new Button(this);
                myButton.setTextColor(Color.WHITE);
                myButton.setBackgroundResource(R.drawable.btnlocker);
                myButton.setText(String.valueOf((numCol*tblRowIdxVar+1)+tblColIdxVar));
                myButton.setTextSize(30);

                myButton.setLayoutParams(params);

                tblRowVar.addView(myButton,btnLyoRulVar);
            }
            namTblLyoVar.addView(tblRowVar, tblLyoRulVar);
        }

        namTblLyoVar.setLayoutParams(tblLyoRulVar);
        layout.addView(namTblLyoVar);


    }
}