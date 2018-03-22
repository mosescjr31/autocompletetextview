package myapp.training.moses.com.autocompletetextviewcontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView acTextView;
    String[] counties = {
            "Afghanistan",
            "Albania",
            "Algeria",
            "Alaska",
            "America",
            "Andorra",
            "Angola",
            "Antigua and Barbuda",
            "Argentina",
            "Armania",
            "Australia",
            "Austria",
            "Azerbaijan",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        acTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.select_dialog_item,counties);

        acTextView.setThreshold(1);
        acTextView.setAdapter(adapter);
    }
}
