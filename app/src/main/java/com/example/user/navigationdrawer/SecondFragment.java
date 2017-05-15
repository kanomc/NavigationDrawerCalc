package com.example.user.navigationdrawer;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SecondFragment extends Fragment {

    int result = 0;
    Button calc;
    EditText miles, gas;
    TextView output;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Defines the xml file for the fragment

        View rootView = inflater.inflate(R.layout.second_layout, container, false);

        calc = (Button) rootView.findViewById(R.id.calc);

        gas = (EditText) rootView.findViewById(R.id.gas);
        miles = (EditText) rootView.findViewById(R.id.miles);
        output = (TextView) rootView.findViewById(R.id.output);

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

        return rootView;
    }



        //return inflater.inflate(R.layout.second_layout, container, false);


    // This event is triggered soon after onCreateView().
    // Any view setup should occur here.  E.g., view lookups and attaching view listeners.
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        // EditText etFoo = (EditText) view.findViewById(R.id.etFoo);


    }
}
