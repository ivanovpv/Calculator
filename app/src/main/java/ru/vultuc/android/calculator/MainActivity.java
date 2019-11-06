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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textLine=this.findViewById(R.id.textLine);
        Button button0=this.findViewById(R.id.button0);
        button0.setOnClickListener(this);
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
    }
}
