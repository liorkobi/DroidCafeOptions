package com.example.imageview_hw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView mImageView;
    private int batteryLevel = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView = findViewById(R.id.battery_image);
        mImageView.setImageLevel(0);
    }

    public void changeBattery(View view) {
        if (batteryLevel != 7) {
            int viewID = view.getId();
            if (viewID == R.id.minus_button) {
                if (batteryLevel > 0) {
                    batteryLevel--;
                    Log.d("Level", String.valueOf(batteryLevel));
                    mImageView.setImageLevel(batteryLevel);
                }
            } else if (viewID == R.id.plus_button) {
                if (batteryLevel < 6) {
                    batteryLevel++;
                    Log.d("Level", String.valueOf(batteryLevel));
                    mImageView.setImageLevel(batteryLevel);
                } else if (batteryLevel == 6) {
                    mImageView.setImageLevel(batteryLevel);
                }
            }
        }
    }
}