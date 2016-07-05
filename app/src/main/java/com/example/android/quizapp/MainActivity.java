package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Ques1(View view) {
        RadioButton one = (RadioButton) findViewById(R.id.one_one_text);
        RadioButton two = (RadioButton) findViewById(R.id.one_two_text);
        if (two.isChecked()) {
            Toast.makeText(this,"Your answer is correct", Toast.LENGTH_SHORT).show();
            score += 10;
        } else if (one.isChecked()) {
            Toast.makeText(this,"Your answer is wrong", Toast.LENGTH_SHORT).show();

        }
    }

    public void Ques2(View view) {
        RadioButton one = (RadioButton) findViewById(R.id.two_one_text);
        RadioButton two = (RadioButton) findViewById(R.id.two_two_text);
        if (two.isChecked()) {
            Toast.makeText(this,"Your answer is correct", Toast.LENGTH_SHORT).show();
            score += 10;
        } else if (one.isChecked()) {
            Toast.makeText(this,"Your answer is wrong", Toast.LENGTH_SHORT).show();
        }
    }

    public void Ques3(View view) {
        RadioButton one = (RadioButton) findViewById(R.id.three_one_text);
        RadioButton two = (RadioButton) findViewById(R.id.three_two_text);
        if (two.isChecked()) {
            Toast.makeText(this,"Your answer is correct", Toast.LENGTH_SHORT).show();

            score += 10;
        } else if (one.isChecked()) {
            Toast.makeText(this,"Your answer is wrong", Toast.LENGTH_SHORT).show();

        }
    }

    public void Check4(View view){
        TextView text = (TextView) findViewById(R.id.ques_four_text);
        String answer = text.getText().toString();
        if (answer.equals("Intent")) {
            Toast.makeText(this,"Your answer is correct", Toast.LENGTH_SHORT).show();
            score += 10;
        } else {
            Toast.makeText(this,"Your answer is wrong", Toast.LENGTH_SHORT).show();
        }

    }

    public void Check5(View view) {
        TextView text = (TextView) findViewById(R.id.ques_five_text);
        String answer = text.getText().toString();
        if (answer.equals("textCapWords")) {
            Toast.makeText(this,"Your answer is correct", Toast.LENGTH_SHORT).show();
            score += 10;
        } else {
            Toast.makeText(this,"Your answer is wrong", Toast.LENGTH_SHORT).show();
        }
    }

    public void Check6(View view) {
        TextView text = (TextView) findViewById(R.id.ques_six_text);
        CheckBox one = (CheckBox) findViewById(R.id.first6_option_checkbox);
        CheckBox two = (CheckBox) findViewById(R.id.second6_option_checkbox);
        CheckBox three = (CheckBox) findViewById(R.id.third6_option_checkbox);
        CheckBox four = (CheckBox) findViewById(R.id.fourth6_option_checkbox);
        if (two.isChecked() && three.isChecked()) {
            Toast.makeText(this,"Your answer is correct", Toast.LENGTH_SHORT).show();
            score += 10;
        } else if (one.isChecked() && four.isChecked()) {
            Toast.makeText(this,"Your answer is wrong", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this,"Your answer is wrong", Toast.LENGTH_SHORT).show();
        }
    }

    public void Check7(View view) {
        TextView text = (TextView) findViewById(R.id.ques_seven_text);
        CheckBox one = (CheckBox) findViewById(R.id.first7_option_checkbox);
        CheckBox two = (CheckBox) findViewById(R.id.second7_option_checkbox);
        CheckBox three = (CheckBox) findViewById(R.id.third7_option_checkbox);
        CheckBox four = (CheckBox) findViewById(R.id.fouth7_option_checkbox);
        if (one.isChecked() && two.isChecked() && three.isChecked()) {
            Toast.makeText(this,"Your answer is correct", Toast.LENGTH_SHORT).show();
            score += 10;
        } else if (four.isChecked()) {
            Toast.makeText(this,"Your answer is wrong", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this,"Your answer is wrong", Toast.LENGTH_SHORT).show();
        }

    }

    public void OnSumbit(View view) {

        TextView text = (TextView) findViewById(R.id.name_edit_text);
        String answer = text.getText().toString();
        Toast.makeText(this, answer + ", " + "Your score is " + score + " out of 70", Toast.LENGTH_SHORT).show();
    }


}
