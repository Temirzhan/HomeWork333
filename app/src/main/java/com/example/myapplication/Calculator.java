package com.example.myapplication;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Serializable;

public class Calculator implements Serializable {
    private int value = 0;
    private int valueAfterPoint = 0;
    private float count = 0.0f;
    private boolean flagPoint = true;
    private String flagProcess;
    private TextView text;
    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button buttonPlus;
    private Button buttonMinus;
    private Button buttonPoint;
    private Button buttonDivision;
    private Button buttonMultiplication;
    private Button buttonEqual;
    private static String PLUS= "PLUS";
    private static String MINUS = "MINUS";
    private static String DIVISION= "DIVISION";
    private static String MULTIPLICATION= "MULTIPLICATION";


    public Calculator( Button button0, Button button1, Button button2, Button button3, Button button4, Button button5, Button button6, Button button7, Button button8, Button button9, Button buttonPlus, Button buttonMinus, Button buttonPoint,Button buttonDivision, Button buttonMultiplication,Button buttonEqual, TextView text) {
        this.button0 = button0;
        this.button1 = button1;
        this.button2 = button2;
        this.button3 = button3;
        this.button4 = button4;
        this.button5 = button5;
        this.button6 = button6;
        this.button7 = button7;
        this.button8 = button8;
        this.button9 = button9;
        this.buttonPlus = buttonPlus;
        this.buttonMinus = buttonMinus;
        this.buttonPoint = buttonPoint;
        this.buttonDivision = buttonDivision;
        this.buttonMultiplication = buttonMultiplication;
        this.buttonEqual = buttonEqual;
        this.text = text;
    }

    public void putButton1(){
       button1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (flagPoint)
                   value = (value*10) + 1;
               else
                   valueAfterPoint = (valueAfterPoint*10) + 1;
               udateValueView();
           }
       });
    }
    public void putButton0(){
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flagPoint)
                    value = (value*10) + 0;
                else
                    valueAfterPoint = (valueAfterPoint*10) + 0;
                udateValueView();
            }
        });
    }
    public void putButton2(){
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flagPoint)
                    value = (value*10) + 2;
                else
                    valueAfterPoint = (valueAfterPoint*10) + 2;
                udateValueView();
            }
        });
    }
    public void putButton3(){
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flagPoint)
                    value = (value*10) + 3;
                else
                    valueAfterPoint = (valueAfterPoint*10) + 3;
                udateValueView();
            }
        });
    }

    public void putButton4(){
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flagPoint)
                    value = (value*10) + 4;
                else
                    valueAfterPoint = (valueAfterPoint*10) + 4;
                udateValueView();
            }
        });
    }
    public void putButton5(){
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flagPoint)
                    value = (value*10) + 5;
                else
                    valueAfterPoint = (valueAfterPoint*10) + 5;
                udateValueView();
            }
        });
    }
    public void putButton6(){
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flagPoint)
                    value = (value*10) + 6;
                else
                    valueAfterPoint = (valueAfterPoint*10) + 6;
                udateValueView();
            }
        });
    }
    public void putButton7(){
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flagPoint)
                    value = (value*10) + 7;
                else
                    valueAfterPoint = (valueAfterPoint*10) + 7;
                udateValueView();
            }
        });
    }
    public void putButton8(){
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flagPoint)
                    value = (value*10) + 8;
                else
                    valueAfterPoint = (valueAfterPoint*10) + 8;
                udateValueView();
            }
        });
    }
    public void putButton9(){
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flagPoint)
                    value = (value*10) + 9;
                else
                    valueAfterPoint = (valueAfterPoint*10) + 9;
                udateValueView();
            }
        });
    }

    public void putButtonEqual(){
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               process();
               restart();
            }
        });
    }

    public void putButtonPoint(){
        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               flagPoint = false;
            }
        });
    }

    public void putButtonPlus(){
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flagProcess = PLUS;
                countIsNotNull();
            }
        });
    }

    public void putButtonMultiplication(){
        buttonMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flagProcess = MULTIPLICATION;
                countIsNotNull();
            }
        });
    }

    public void putButtonDivision(){
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flagProcess = DIVISION;
                countIsNotNull();
            }
        });
    }

    public void putButtonMinus(){
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flagProcess = MINUS;
              countIsNotNull();
            }
        });
    }

    private void restart(){
        flagPoint = true;
        value = 0;
        valueAfterPoint =0;
    }

    private float valueTransfer(){
        float temp = valueAfterPoint;
        while (temp >= 1){
            temp = temp/10;
        }
        temp += value;
        return temp;
    }

    private void countIsNotNull(){
        if(count==0.0f){
            count = valueTransfer();
            udateValueView();
            restart();
        }else {
            process();
            restart();
        }

    }

    private void process(){
        switch (flagProcess){
            case ("PLUS"):
              resultView(count + valueTransfer());
              break;
            case ("MINUS"):
                resultView(count - valueTransfer());
                break;
            case ("DIVISION"):
                resultView(count / valueTransfer());
                break;
            case ("MULTIPLICATION"):
                resultView(count * valueTransfer());
                break;
        }
    }

    public void udateValueView(){
        text.setText(value + "." + valueAfterPoint);
    }

    public void resultView(float result){
        text.setText(result + "");
        count = result;
    }
}
