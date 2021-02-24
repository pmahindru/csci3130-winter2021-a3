package ca.dal.cs.csci3130.a3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mathCal();
    }

    private int getNumber() {
        EditText numberBox = findViewById(R.id.numberBox);
        return Integer.parseInt(numberBox.getText().toString());
    }

    private void mathCal() {
        Button factorialButton = findViewById(R.id.factorialButton);
        factorialButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                resultFactorial();
            }
        });

        Button squareButton = findViewById(R.id.squareButton);
        squareButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                resultSquare();
            }
        });
    }

    private void resultSquare() {
        int number = getNumber();
        int square = calculateSquare(number);
        TextView statusLabel = findViewById(R.id.result);
        statusLabel.setText(String.valueOf(square));
    }

    private void resultFactorial() {
        int number = getNumber();
        int factorial = calculateFactorial(number);
        TextView statusLabel = findViewById(R.id.result);
        statusLabel.setText(String.valueOf(factorial));
    }

    protected int calculateFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    protected int calculateSquare(int number) {
        return number * number;
    }

}