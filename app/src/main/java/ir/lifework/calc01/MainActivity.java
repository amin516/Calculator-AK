package ir.lifework.calc01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView _displayView;
    Button _0Button;
    Button _1Button;
    Button _2Button;
    Button _3Button;
    Button _4Button;
    Button _5Button;
    Button _6Button;
    Button _7Button;
    Button _8Button;
    Button _9Button;
    Button _clearButton;
    Button _multiplyButton;
    Button _divideButton;
    Button _plusButton;
    Button _minusButton;
    Button _equalButton;
    String _operand;
    String _firstNumber;
    String _secondNumber;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _displayView = findViewById(R.id._display_view);
        _0Button = findViewById(R.id._0_button);
        _1Button = findViewById(R.id._1_button);
        _2Button = findViewById(R.id._2_button);
        _3Button = findViewById(R.id._3_button);
        _4Button = findViewById(R.id._4_button);
        _5Button = findViewById(R.id._5_button);
        _6Button = findViewById(R.id._6_button);
        _7Button = findViewById(R.id._7_button);
        _8Button = findViewById(R.id._8_button);
        _9Button = findViewById(R.id._9_button);
        _clearButton = findViewById(R.id._clear_button);
        _multiplyButton = findViewById(R.id._multiply_button);
        _divideButton = findViewById(R.id._divide_button);
        _plusButton = findViewById(R.id._plus_button);
        _minusButton = findViewById(R.id._minus_button);
        _equalButton = findViewById(R.id._equal_button);

        _0Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _displayView.append("0");
            }
        });
        _1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _displayView.append("1");
            }
        });
        _2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _displayView.append("2");
            }
        });
        _3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _displayView.append("3");
            }
        });
        _4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _displayView.append("4");
            }
        });
        _5Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _displayView.append("5");
            }
        });
        _6Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _displayView.append("6");
            }
        });
        _7Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _displayView.append("7");
            }
        });
        _8Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _displayView.append("8");
            }
        });
        _9Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _displayView.append("9");
            }
        });
        _clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _displayView.setText("");
            }
        });
        _multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _firstNumber = _displayView.getText().toString();
                _operand = "×";
                _displayView.setText("");
            }
        });
        _divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _firstNumber = _displayView.getText().toString();
                _operand = "÷";
                _displayView.setText("");
            }
        });
        _plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _firstNumber = _displayView.getText().toString();
                _operand = "+";
                _displayView.setText("");
            }
        });
        _minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _firstNumber = _displayView.getText().toString();
                _operand = "-";
                _displayView.setText("");
            }
        });
        _equalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _secondNumber = _displayView.getText().toString();
                if (_operand == "×") {
                    _displayView.setText(Integer.toString(Integer.parseInt(_firstNumber) * Integer.parseInt(_secondNumber)));
                }
                else if (_operand == "÷") {
                    _displayView.setText(Float.toString(Float.parseFloat(_firstNumber) / Float.parseFloat(_secondNumber)));
                }
                else if (_operand == "+") {
                    _displayView.setText(Integer.toString(Integer.parseInt(_firstNumber) + Integer.parseInt(_secondNumber)));
                }
                else if (_operand == "-") {
                    _displayView.setText(Integer.toString(Integer.parseInt(_firstNumber) - Integer.parseInt(_secondNumber)));
                }
            }
        });
    }
}
