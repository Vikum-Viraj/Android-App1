package com.example.myapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText birthyr; // for get the birth year to java programme
    TextView disansw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        birthyr = findViewById(R.id.LblInputNum);
        disansw = findViewById(R.id.LblAnswer); // from thar going to refer labale answer

    }

    public void calcAge(View view)
    {
         Integer yrofbirth = Integer.valueOf(birthyr.getText().toString());

         Integer currentyr = Calendar.getInstance().get(Calendar.YEAR);

         String  ans = String.valueOf(currentyr - yrofbirth);

         disansw.setText("Your are  : "+ans+" Years old");

    }


}