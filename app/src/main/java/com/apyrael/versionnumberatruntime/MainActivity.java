package com.apyrael.versionnumberatruntime;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * The press me button.
     */
    private Button btnPressMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPressMe = (Button) findViewById(R.id.btnStartStop);
        setupOnClickListeners();
    }

    /**
     * Sets up the on click listeners for the respective views.
     */
    private void setupOnClickListeners() {

        setupPressMeButtonOnClickListener();
    }

    /**
     * Sets up the press me button on click.
     */
    private void setupPressMeButtonOnClickListener() {

        btnPressMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, BuildConfig.SUPPORT_LIBRARY_VERSION, Toast.LENGTH_SHORT).show();
            }
        });
    }
}