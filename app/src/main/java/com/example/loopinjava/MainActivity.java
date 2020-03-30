package com.example.loopinjava;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    String helloWorldNumber = "";
    EditText getNumber;
    Button getMultiTable;
    TextView multiplicationResult;
    String multiplicationTableResult = "";
    EditText stringName;
    String reversedWord;
    Button generateReversedWd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.txt_hello_world_id);
        button = findViewById(R.id.btn_counter_id);
        getNumber = findViewById(R.id.edt_get_number_id);
        multiplicationResult = findViewById(R.id.txt_multi_table_id);
        getMultiTable = findViewById(R.id.btn_multi_table_id);
        stringName = findViewById(R.id.edt_string_id);
        generateReversedWd = findViewById(R.id.btn_reverse_string_id);

    }

    public void counterHelloWorld(View v) {
        /*int counter =1;
        while(counter<=10){
            Log.i("Mytag","Hello World: "+counter);
            helloWorldNumber = helloWorldNumber+"Hello World: "+counter+"\n";
            counter++;
        }
        textView.setText(helloWorldNumber);
*/

    }

    public void onClickMultiTable(View v) {
        /*multiplicationTableResult = "";

        int number = Integer.parseInt(getNumber.getText().toString());

        for(int counterVariable = 1; counterVariable<=10; counterVariable++){

                multiplicationTableResult = multiplicationTableResult + number+" * "
                        + counterVariable+" = "+number*counterVariable+"\n";
                multiplicationResult.setText(multiplicationTableResult);
        */
    }

    public void onClickReverse(View v) {
        reversedWord = "";
        String wordToBeReversed = stringName.getText().toString();
        char[] array = wordToBeReversed.toCharArray();

        for (int counter = array.length - 1; counter >= 0; counter--) {

            reversedWord = reversedWord + String.valueOf(array[counter]);

        }

        generateReversedWd.setText(reversedWord);
    }

}


