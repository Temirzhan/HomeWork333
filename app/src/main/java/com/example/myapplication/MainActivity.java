    package com.example.myapplication;

    import android.os.Bundle;
    import android.widget.Button;
    import android.widget.TextView;

    import androidx.appcompat.app.AppCompatActivity;

    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Button button0 = findViewById(R.id.button_0);
            Button button1 = findViewById(R.id.button_1);
            Button button2 = findViewById(R.id.button_2);
            Button button3 = findViewById(R.id.button_3);
            Button button4 = findViewById(R.id.button_4);
            Button button5 = findViewById(R.id.button_5);
            Button button6 = findViewById(R.id.button_6);
            Button button7 = findViewById(R.id.button_7);
            Button button8 = findViewById(R.id.button_8);
            Button button9 = findViewById(R.id.button_9);
            Button buttonPlus = findViewById(R.id.button_plus);
            Button buttonMinus = findViewById(R.id.button_minus);
            Button buttonPoint = findViewById(R.id.button_point);
            Button buttonDivision = findViewById(R.id.button_division);
            Button buttonMultiplication = findViewById(R.id.button_multiplication);
            Button buttonEqual = findViewById(R.id.button_equal);
            TextView text = findViewById(R.id.text_value);

            Calculator calculator = new Calculator(button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonPlus, buttonMinus, buttonPoint, buttonDivision, buttonMultiplication, buttonEqual, text);
            calculator.putButton0();
            calculator.putButton1();
            calculator.putButton2();
            calculator.putButton3();
            calculator.putButton4();
            calculator.putButton5();
            calculator.putButton6();
            calculator.putButton7();
            calculator.putButton8();
            calculator.putButton9();
            calculator.putButtonPlus();
            calculator.putButtonMinus();
            calculator.putButtonDivision();
            calculator.putButtonMultiplication();
            calculator.putButtonEqual();
            calculator.putButtonPoint();

        }
    }