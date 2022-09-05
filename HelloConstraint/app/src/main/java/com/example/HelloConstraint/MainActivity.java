package com.example.HelloConstraint;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount=0;
    private TextView mShowCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);

    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();

    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
        if (mCount >0){findViewById(R.id.Zero_b).setBackgroundColor(-16711936);}
        if(mCount%2==0){view.setBackgroundColor(-16777216);}
        else{ view.setBackgroundColor(-16776961);}


    }

    public void countZreo(View view) {
        mCount=0;
        view.setBackgroundColor(-12303292);
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}