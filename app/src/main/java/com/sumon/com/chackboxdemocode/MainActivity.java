package com.sumon.com.chackboxdemocode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox milk,water,drink;
    private Button order;
    private TextView show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        milk=findViewById(R.id.milk);
        water=findViewById(R.id.water);
        drink=findViewById(R.id.drink);

        order=findViewById(R.id.order);
        show=findViewById(R.id.show);


        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();

                if (milk.isChecked()){
                    String value = milk.getText().toString();
                    stringBuilder.append(value+" is order\n");

                 }
                if (water.isChecked()){
                    String value = water.getText().toString();
                    stringBuilder.append(value+" is order\n ");

                }
                if (drink.isChecked()){
                    String value = drink.getText().toString();
                    stringBuilder.append(value+" is order\n ");

                }

                show.setText(stringBuilder);
            }
        });


    }
}
