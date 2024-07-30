package com.example.a6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void sub(View view){
        Log.i("info","button pressed");
        EditText editTextName = (EditText) findViewById(R.id.editTextName);
        Toast.makeText(this, "User Information completed by " + editTextName.getText().toString(),
                Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}