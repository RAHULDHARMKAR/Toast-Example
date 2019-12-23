package com.example.toastactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Main Activity", Toast.LENGTH_SHORT).show();
    }

    public void button1(View view) {
        Toast.makeText(this, "Button 1 clicked", Toast.LENGTH_LONG).show();
    }

    public void button2(View view) {
        Toast.makeText(this, "Button 2 clicked", Toast.LENGTH_SHORT).show();
    }

    public void button3(View view) {
        Toast.makeText(this, "Button 3 clicked", Toast.LENGTH_SHORT).show();
    }

    public void button4(View view) {
        Toast.makeText(this, "Button 4 clicked", Toast.LENGTH_SHORT).show();
    }
}
