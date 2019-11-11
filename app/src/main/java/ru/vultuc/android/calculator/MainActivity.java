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
        Button button;
        super.onCreate(savedInstanceState);
        memory = 0.0d;
        setContentView(R.layout.activity_main);
        textLine=this.findViewById(R.id.textLine);

        button=this.findViewById(R.id.button0);
        button.setOnClickListener(this);
        button=this.findViewById(R.id.button1);
        button.setOnClickListener(this);
        button=this.findViewById(R.id.button2);
        button.setOnClickListener(this);
        button=this.findViewById(R.id.button3);
        button.setOnClickListener(this);
        button=this.findViewById(R.id.button4);
        button.setOnClickListener(this);
        button=this.findViewById(R.id.button5);
        button.setOnClickListener(this);
        button=this.findViewById(R.id.button6);
        button.setOnClickListener(this);
        button=this.findViewById(R.id.button7);
        button.setOnClickListener(this);
        button=this.findViewById(R.id.button8);
        button.setOnClickListener(this);
        button=this.findViewById(R.id.button9);
        button.setOnClickListener(this);
        button=this.findViewById(R.id.button_c);
        button.setOnClickListener(this);
        button=this.findViewById(R.id.button_memory_clear);
        button.setOnClickListener(this);
        button=this.findViewById(R.id.button_memory_plus);
        button.setOnClickListener(this);
        button=this.findViewById(R.id.button_memory_minus);
        button.setOnClickListener(this);
        button=this.findViewById(R.id.button_memory_result);
        button.setOnClickListener(this);
        button=this.findViewById(R.id.button00);
        button.setOnClickListener(this);
        button=this.findViewById(R.id.button_decimal_point);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.button0:
                textLine.append("0");
                break;
            case R.id.button00:
                textLine.append("00");
                break;
            case R.id.button_decimal_point:
                textLine.append(".");
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
            case R.id.button_memory_clear:
                clearMemory();
                break;
            case R.id.button_memory_minus:
                subtractFromMemory();
                break;
            case R.id.button_memory_plus:
                addToMemory();
                break;
            case R.id.button_memory_result:
                computeMemory();
                break;
            default:
                Log.i(TAG, "Pressed button with id="+view.getId());
        }
    }

    public void addToMemory() {
        memory = memory + parseTextLine();
        textLine.setText("");
    }

    public void clearMemory() {
        memory = 0;
    }

    public void subtractFromMemory() {
        memory = memory - parseTextLine();
        textLine.setText("");
    }

    public void computeMemory() {
        textLine.setText(""+memory);
        memory = 0;
    }

    private double parseTextLine() {
        String text=textLine.getText().toString().trim();
        double result=0.0;
        if(!text.isEmpty()) {
            try {
                result = Double.parseDouble(text);
            } catch (NumberFormatException ex) {
                Log.d(TAG, "Invalid string=" + text, ex);
            }
        }
        return result;
    }

}

