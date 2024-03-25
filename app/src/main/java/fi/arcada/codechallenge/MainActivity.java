package fi.arcada.codechallenge;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView outputText;
    EditText inputText;

    TextView valueText;

    double[] values = {1, 3, 5, 6, 7, 9, 8, 8, 7, 14};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outputText = findViewById(R.id.outText);
        inputText = findViewById(R.id.inputText);
        valueText = findViewById(R.id.outValue);


        outputText.setText("Min app funkar!");

        double average = calculateAverage(values);
    }

        public static double calculateAverage(double[] array){
        double sum = 0;
        for (double num : array){
            sum += num;
        }
        double average = sum / array.length;
        return average;
    }

    public void buttonHandler(View view) {
        outputText.setText(inputText.getText().toString());

    }
    public void buttonCalc (View view){
        double average = calculateAverage(values);
        valueText.setText("average. " +average);

        }
    }
