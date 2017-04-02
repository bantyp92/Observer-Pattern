package com.example.admin.indianrail;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    Button trainRouteListButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUiElements();
    }

    private void initUiElements() {
        trainRouteListButton = (Button) findViewById(R.id.btn_train_route);
    }


    public void trainRouteListClicked(View view) {
        startActivity(new Intent(this,TrainRouteListActivity.class));
    }
}
