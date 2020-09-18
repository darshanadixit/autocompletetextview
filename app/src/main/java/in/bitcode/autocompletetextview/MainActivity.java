package in.bitcode.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    private AutoCompleteTextView mAutoCompleteTextView;
    private String [] mArrCities = {
            "jalgaon","nashik","pune","aurangabad","nagar",
            "mumbai","nagpur","solapur","akola","yavatmal"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAutoCompleteTextView = findViewById(R.id.autoCompleteTextView);

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,mArrCities);
        //mAutoCompleteTextView.setThreshold(1);
        mAutoCompleteTextView.setAdapter(adapter);
    }
}
