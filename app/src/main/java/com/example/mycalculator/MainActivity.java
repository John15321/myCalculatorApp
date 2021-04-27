package com.example.mycalculator;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView previousCalculation;
    private EditText display;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        previousCalculation = findViewById(R.id.previousCalculationView);
        display = findViewById(R.id.displayEditText);

        display.setShowSoftInputOnFocus(false);
    }

    private void updateText(String strToAdd) {
        String oldStr = display.getText().toString();

        int cursorPosition = display.getSelectionStart();

        String leftStr = oldStr.substring(0, cursorPosition);
        String rightStr = oldStr.substring(cursorPosition);

        display.setText(String.format("%s%s%s", leftStr, strToAdd, rightStr));
        display.setSelection(cursorPosition + strToAdd.length());
    }

    public void zeroButtonPush(View view) {
        updateText(getResources().getString(R.string.zeroText));
    }

    public void oneButtonPush(View view) {
        updateText(getResources().getString(R.string.oneText));
    }

    public void twoButtonPush(View view) {
        updateText(getResources().getString(R.string.twoText));
    }

    public void threeButtonPush(View view) {
        updateText(getResources().getString(R.string.threeText));
    }

    public void fourButtonPush(View view) {
        updateText(getResources().getString(R.string.fourText));
    }

    public void fiveButtonPush(View view) {
        updateText(getResources().getString(R.string.fiveText));
    }

    public void sixButtonPush(View view) {
        updateText(getResources().getString(R.string.sixText));
    }

    public void sevenButtonPush(View view) {
        updateText(getResources().getString(R.string.sevenText));
    }

    public void eightButtonPush(View view) {
        updateText(getResources().getString(R.string.eightText));
    }

    public void nineButtonPush(View view) {
        updateText(getResources().getString(R.string.nineText));
    }

    public void parenthesesOpenButtonPush(View view) {
        updateText(getResources().getString(R.string.parenthesesOpenText));
    }

    public void parenthesesCloseButtonPush(View view) {
        updateText(getResources().getString(R.string.parenthesesCloseText));
    }

    public void divideButtonPush(View view) {
        updateText(getResources().getString(R.string.divideText));
    }

    public void multiplyButtonPush(View view) {
        updateText(getResources().getString(R.string.multiplyText));
    }

    public void addButtonPush(View view) {
        updateText(getResources().getString(R.string.addText));
    }

    public void subtractButtonPush(View view) {
        updateText(getResources().getString(R.string.subtractText));
    }

    public void decimalButtonPush(View view) {
        updateText(getResources().getString(R.string.decimalText));
    }

    public void clearButtonPush(View view) {
        display.setText("");
    }

    public void equalsTextButtonPush(View view) {
        // do nothing for the Text view
    }

    public void backspaceButtonPush(View view) {
        int cursorPosition = display.getSelectionStart();a
        int textLen = display.getText().length();

        if (cursorPosition != 0 && textLen != 0) {
            SpannableStringBuilder selection = (SpannableStringBuilder) display.getText();
            selection.replace(cursorPosition-1, cursorPosition, "");

        }
    }
}