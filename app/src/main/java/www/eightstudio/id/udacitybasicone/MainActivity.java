package www.eightstudio.id.udacitybasicone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";


    Button button;
    RadioGroup radioGroup;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         button =  findViewById(R.id.btnTampilData);
         radioGroup = findViewById(R.id.radioButtonGroupSatu);

         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 int selectedID = radioGroup.getCheckedRadioButtonId();
                 radioButton = findViewById(selectedID);
                 Integer data = 10;
                 Number dataKU = data;

                 Toast.makeText(MainActivity.this, "" + radioButton.getText() + " " + dataKU, Toast.LENGTH_SHORT).show();

             }
         });

    }
}
