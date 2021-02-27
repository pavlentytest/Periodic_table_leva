package ru.samsung.itschool.mdev.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

      /*  TableLayout container = new TableLayout(this);

        container.setLayoutParams(new TableLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));


        TableRow tableRow = new TableRow(this);
        tableRow.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));

        LinearLayout cl = new LinearLayout(this);
        cl.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        cl.setOrientation(LinearLayout.HORIZONTAL);
        cl.setBackgroundColor(Color.RED);
        tableRow.addView(cl);

            container.addView(tableRow);


        int rows = 7;
        int columns = 18;

      /*  for(int i=0; i < rows; i++) {
            TableRow tableRow = new TableRow(this);
            tableRow.setLayoutParams(new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
            ));
            for(int j=0; j < columns; j++) {
               ConstraintLayout cl = new ConstraintLayout(this);
                cl.setLayoutParams(new ViewGroup.LayoutParams(
                       100,
                       100
                ));
                TextView textView = new TextView(this);
                textView.setText("H");
                textView.setTextSize(50);
                textView.setTextColor(Color.BLACK);

                cl.setBackgroundColor(Color.RED);
                cl.addView(textView);

                tableRow.addView(cl);
            }
            container.addView(tableRow);
        }
        */

       // container.setStretchAllColumns(true);
        setContentView(container);
        //setContentView(R.layout.activity_main);
    }
}