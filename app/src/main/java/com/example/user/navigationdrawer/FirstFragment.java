package com.example.user.navigationdrawer;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class FirstFragment extends Fragment{

    int result = 0;
    Button calc;
    EditText miles, gas;
    TextView output;
    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);


        gas = (EditText) getView().findViewById(R.id.gas);
        miles = (EditText) getView().findViewById(R.id.miles);
        calc = (Button) getView().findViewById(R.id.calc);
        output = (TextView) getView().findViewById(R.id.output);



        calc.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {


                int gasValue = 0;
                try {
                    gasValue = Integer.parseInt(gas.getText().toString());
                } catch (NumberFormatException e) {
//you don't have to do much here since fuelValue already has a default value (-1)
                }

                int milesValue = 0;
                try {
                    milesValue = Integer.parseInt(miles.getText().toString());
                }
                catch (NumberFormatException e)
                {

                }
                result = gasValue * milesValue;


                output.setText("" + result);


            }

        });

        myView = inflater.inflate(R.layout.first_layout, container, false);
        return myView;
    }
}


/*
    int result = 0;
    Button calc;
    EditText miles, gas;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);

        gas = (EditText) findViewById(R.id.gas);
        miles = (EditText) findViewById(R.id.miles);
        calc = (Button) findViewById(R.id.calc);
        output = (TextView) findViewById(R.id.output);


        calc.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {


                int gasValue = 0;
                try {
                    gasValue = Integer.parseInt(gas.getText().toString());
                }
                catch (NumberFormatException e)
                {
//you don't have to do much here since fuelValue already has a default value (-1)
                }

                int milesValue = 0;
                try {
                    milesValue = Integer.parseInt(miles.getText().toString());
                }
                catch (NumberFormatException e)
                {

                }
                result = gasValue * milesValue;

                //result += Integer.parseInt(output.getText().toString());
                output.setText("" + result);

            }
        });


    }
}
   /*public void onClick(View arg0){

       int fuelValue = -1;
       try {
           fuelValue = Integer.parseInt(fuel.getText().toString());
       }
       catch (NumberFormatException e)
       {
//you don't have to do much here since fuelValue already has a default value (-1)
       }

       int lapsValue = -1;
       try {
           lapsValue = Integer.parseInt(numLaps.getText().toString());
       }
       catch (NumberFormatException e)
       {

       }

       //int result = 0;



       result = fuelValue * lapsValue;

       result += Integer.parseInt(output.getText().toString());
       output.setText("" + result);

   }

}*/
