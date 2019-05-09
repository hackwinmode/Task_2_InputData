package com.example.task_2_inputdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    String message = "";
    String Gender = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Exit(View view){
        finish();
    }

    public void Display(View view){
        message = "";
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        EditText name = findViewById(R.id.txtName);
        EditText email = findViewById(R.id.txtEmail);
        message += "Name: " + name.getText().toString() +"\nEmail: "+ email.getText().toString() + Gender;

        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void onRadioButtonClick(View view){
        Gender = "";
        boolean check = ((RadioButton) view).isChecked();
        switch(view.getId()){
            case R.id.radBtnMale:
                if (check)
                    Gender = "\nGender: Male";
                break;
            case R.id.radBtnFemale:
                if(check)
                    Gender = "\nGender: Female";
                break;
        }
    }
}
