package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText1, editText2, editText3,editText4;
    private Button button;
    RadioGroup radioGroup;
    RadioButton genderradioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        addListenoronButtonclick();
    }
    public void addListenoronButtonclick(){
        editText1 = (EditText)findViewById(R.id.name);
        editText2 = (EditText)findViewById(R.id.email);
        editText3 = (EditText)findViewById(R.id.mbno);
        radioGroup = (RadioGroup)findViewById(R.id.radiogroup);
        editText4 = (EditText)findViewById(R.id.password);
        button = (Button)findViewById(R.id.register);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1=editText1.getText().toString();
                String value2=editText4.getText().toString();
                Toast.makeText(getApplicationContext(),"Registration Successful",Toast.LENGTH_LONG).show();
            }
        });

    }
}