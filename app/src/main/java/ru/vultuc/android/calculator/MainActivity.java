package ru.vultuc.android.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private static String TAG=MainActivity.class.getName();
    private TextView textLine;
    private double memory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        memory = .0;
        setContentView(R.layout.activity_main);
        textLine=this.findViewById(R.id.textLine);

        Button button0=this.findViewById(R.id.button0);
        button0.setOnClickListener(this);
        Button button1=this.findViewById(R.id.button1);
        button1.setOnClickListener(this);
        Button button2=this.findViewById(R.id.button2);
        button2.setOnClickListener(this);
        Button button3=this.findViewById(R.id.button3);
        button3.setOnClickListener(this);
        Button button4=this.findViewById(R.id.button4);
        button4.setOnClickListener(this);
        Button button5=this.findViewById(R.id.button5);
        button5.setOnClickListener(this);
        Button button6=this.findViewById(R.id.button6);
        button6.setOnClickListener(this);
        Button button7=this.findViewById(R.id.button7);
        button7.setOnClickListener(this);
        Button button8=this.findViewById(R.id.button8);
        button8.setOnClickListener(this);
        Button button9=this.findViewById(R.id.button9);
        button9.setOnClickListener(this);

        Button button_c=this.findViewById(R.id.button_c);
        button_c.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.button0:
                textLine.setText("1");
                break;
            default:
                Log.i(TAG, "Pressed button with id="+view.getId());
        }
        textLine=this.findViewById(R.id.textLine);

        Button button0=this.findViewById(R.id.button0);
        button0.setOnClickListener(this);
        Button button1=this.findViewById(R.id.button1);
        button1.setOnClickListener(this);
        Button button2=this.findViewById(R.id.button2);
        button2.setOnClickListener(this);
        Button button3=this.findViewById(R.id.button3);
        button3.setOnClickListener(this);
        Button button4=this.findViewById(R.id.button4);
        button4.setOnClickListener(this);
        Button button5=this.findViewById(R.id.button5);
        button5.setOnClickListener(this);
        Button button6=this.findViewById(R.id.button6);
        button6.setOnClickListener(this);
        Button button7=this.findViewById(R.id.button7);
        button7.setOnClickListener(this);
        Button button8=this.findViewById(R.id.button8);
        button8.setOnClickListener(this);
        Button button9=this.findViewById(R.id.button9);
        button9.setOnClickListener(this);

        Button button_c=this.findViewById(R.id.button_c);
        button_c.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.button0:
                textLine.append("0");
                break;
            case R.id.button1:
                textLine.append("1");
                break;
            case R.id.button2:
                textLine.append("2");
                break;
            case R.id.button3:
                textLine.append("3");
                break;
            case R.id.button4:
                textLine.append("4");
                break;
            case R.id.button5:
                textLine.append("5");
                break;
            case R.id.button6:
                textLine.append("6");
                break;
            case R.id.button7:
                textLine.append("7");
                break;
            case R.id.button8:
                textLine.append("8");
                break;
            case R.id.button9:
                textLine.append("9");
                break;
            case R.id.button_c:
                textLine.setText("");
                break;
            default:
                Log.i(TAG, "Pressed button with id="+view.getId());
        }
    }

    public void AddToMemory(View view) {
        memory = memory + Double.parseDouble(String.valueOf(textLine));
        textLine.setText("");
    }

    public void ClearMemory(View view) {
        memory = 0;
    }

    public void SubtractFromMemory(View view) {
        memory = memory - Integer.parseInt(String.valueOf(textLine));
        textLine.setText("");
    }

    public void ComputeMemory(View view) {
        textLine.setText(Double.toString(memory));
        memory = 0;
    }
}

;
