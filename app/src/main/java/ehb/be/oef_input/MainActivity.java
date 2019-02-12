package ehb.be.oef_input;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import ehb.be.oef_input.model.Reminder;

public class MainActivity extends AppCompatActivity {

    private RadioGroup rgImportance;
    private EditText etTitle, etDescription;
    private Button btnSave;
    private Button btnDate;

    private View.OnClickListener saveListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Reminder reminderToSend = new Reminder();

            switch(rgImportance.getCheckedRadioButtonId()){
                case R.id.rb_low: reminderToSend.setImportance("Low");
                    break;
                case R.id.rb_intermediate: reminderToSend.setImportance("Intermediate");
                    break;
                case R.id.rb_high: reminderToSend.setImportance("High");
                    break;
                default: reminderToSend.setImportance("Intermediate");
            }

            reminderToSend.setTitle(etTitle.getText().toString());
            reminderToSend.setDescription(etDescription.getText().toString());


          
        }
    };


    private View.OnClickListener dateListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            showCalendarDialog();
        }
    };

    private void showCalendarDialog () {

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //verwijzingen naar componenten in het scherm
        rgImportance = findViewById(R.id.rg_importance);
        etTitle = findViewById(R.id.et_title);
        etDescription = findViewById(R.id.et_description);
        btnSave = findViewById(R.id.btn_save);
        btnDate = findViewById(R.id.btn_date);


        //listeners aan views hangen
        btnSave.setOnClickListener(saveListener);
        btnDate.setOnClickListener(dateListener);

    }
}
