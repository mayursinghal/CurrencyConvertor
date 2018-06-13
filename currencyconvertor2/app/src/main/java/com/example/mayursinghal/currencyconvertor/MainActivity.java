package com.example.mayursinghal.currencyconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public void rupeeClick(View view) {
        EditText rupeeEditText = (EditText) findViewById(R.id.rupeeEditText);
        Double rupeeDouble =Double.parseDouble(rupeeEditText.getText().toString());
        Double rupeeToDollar =60*rupeeDouble;
        TextView TextViewToChange =(TextView) findViewById(R.id.dollarEditText);
        TextViewToChange.setText(Double.toString(rupeeToDollar));
    }

    public void dollarClick(View view) {
        EditText dollarEditText = (EditText) findViewById(R.id.dollarEditText);
        Double dollarDouble =Double.parseDouble(dollarEditText.getText().toString());
        Double dollarToRupee =dollarDouble/60;
        TextView TextViewToChange =(TextView) findViewById(R.id.rupeeEditText);
        TextViewToChange.setText(Double.toString(dollarToRupee));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
