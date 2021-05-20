package sg.edu.rp.c346.id20047223.p05problemstatement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ModuleDetails extends AppCompatActivity {

    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_details);

        display = findViewById(R.id.textview);


        Intent intent = getIntent();
        String actValue = intent.getStringExtra("Module");
        String output = "";

        if(actValue.equals("C346")){
            String modulecode = "Module Code: C346\n";
            String modulename = "Module Name: Android Programming\n";
            String year = "Academic Year: 2020\n";
            String semester = "Semester: 1\n";
            String modulecredit = "Module Credit: 4\n";
            String venue = "Venus: W66M";

            output += modulecode + modulename + year + semester + modulecredit + venue;

        } else {
            String modulecode = "Module Code: C349\n";
            String modulename = "Module Name: iPad Programming\n";
            String year = "Academic Year: 2020\n";
            String semester = "Semester: 1\n";
            String modulecredit = "Module Credit: 4\n";
            String venue = "Venus: W67M";

            output += modulecode + modulename + year + semester + modulecredit + venue;


        }
        display.setText(output);
    }
}