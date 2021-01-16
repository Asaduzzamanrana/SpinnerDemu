package com.example.spinnerdemu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CursorAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private String[] countrynames;
    private String[] population;
    private int[] flag={R.drawable.bangladesh,R.drawable.india,R.drawable.pakistan,
            R.drawable.srilanka,R.drawable.nepal,R.drawable.brazil, R.drawable.argentina,
            R.drawable.germany,R.drawable.america,R.drawable.canada};
    private boolean selection=true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinnerid);

        countrynames = getResources().getStringArray(R.array.country_name);
        population = getResources().getStringArray(R.array.population);
        CustomAdapter adapter = new CustomAdapter(this,flag,countrynames,population);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (selection==true){
                    selection=false;
                }
                else {
                    Toast.makeText(getApplicationContext(),countrynames[position]+"is selected",Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
