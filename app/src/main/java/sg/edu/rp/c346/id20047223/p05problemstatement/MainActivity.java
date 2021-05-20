package sg.edu.rp.c346.id20047223.p05problemstatement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv346;
    TextView tv349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv346 = findViewById(R.id.tvAndroid);
        tv349 = findViewById(R.id.tvIpad);

        tv346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(MainActivity.this, ModuleDetails.class);
                intent.putExtra("Module", "C346");
                startActivity(intent);
            }
        });

        tv349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(MainActivity.this, ModuleDetails.class);

                intent.putExtra("Module", "C349");
                startActivity(intent);
            }
        });
    }
}