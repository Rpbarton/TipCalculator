package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText BillTotal;
    private EditText DinersTotal;
    private TextView PricePerPerson;
    private TextView TipTotal;
    private RadioButton tip1;
    private RadioButton tip2;
    private RadioButton tip3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BillTotal = findViewById(R.id.BillTotal);
        DinersTotal = findViewById(R.id.DinersTotal);
        PricePerPerson = findViewById(R.id.PricePerPerson);
        TipTotal = findViewById(R.id.TipTotal);
        tip1 = findViewById(R.id.tip1);
        tip2 = findViewById(R.id.tip2);
        tip3 = findViewById(R.id.tip3);
    }

    public void convert(View v){
        double Tip;
        int diners;
        double priceper;
        if(tip1.isChecked()){
            String input = BillTotal.getText().toString();
            String input2 = DinersTotal.getText().toString();
            if(input.length()>0 && input2.length()>0){
                double BillValue = Double.parseDouble(input);
                diners = Integer.parseInt(input2);
                priceper = BillValue/diners;
                PricePerPerson.setText("$ " + String.format("%.1f", priceper));
                Tip = BillValue *.10;
                TipTotal.setText("$ " + String.format("%.1f",Tip));
            } else {
                Toast.makeText(this, "No Bill or Diners entered", Toast.LENGTH_SHORT).show();
            }
        }
        else if(tip2.isChecked()){
            String input = BillTotal.getText().toString();
            String input2 = DinersTotal.getText().toString();
            if(input.length()>0 && input2.length()>0){
                double BillValue = Double.parseDouble(input);
                diners = Integer.parseInt(input2);
                priceper = BillValue/diners;
                PricePerPerson.setText("$ " + String.format("%.1f", priceper));
                Tip = BillValue *.15;
                TipTotal.setText("$ " + String.format("%.1f",Tip));
            } else {
                Toast.makeText(this, "No Bill or Diners entered", Toast.LENGTH_SHORT).show();
            }
        }
         else if(tip3.isChecked()){
            String input = BillTotal.getText().toString();
            String input2 = DinersTotal.getText().toString();
            if(input.length()>0 && input2.length()>0){
                double BillValue = Double.parseDouble(input);
                diners = Integer.parseInt(input2);
                priceper = BillValue/diners;
                PricePerPerson.setText("$ " + String.format("%.1f", priceper));
                Tip = BillValue * .20;
                TipTotal.setText("$ "+ String.format("%.1f",Tip));
            } else {
                Toast.makeText(this, "No Bill or Diners entered", Toast.LENGTH_SHORT).show();
            }
        }
    }


}
