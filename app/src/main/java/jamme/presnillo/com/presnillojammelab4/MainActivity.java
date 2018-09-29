package jamme.presnillo.com.presnillojammelab4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toastButton = (Button) findViewById(R.id.toastButton);
        Button snackbarButton = (Button) findViewById(R.id.snackbarButton);


        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "TOASTTTTTTTTTTT";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(getApplicationContext(), message, duration).show();
            }
        });


        snackbarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = findViewById(R.id.main_layout_id);
                String message = "This is Snackbar";
                int duration = Snackbar.LENGTH_SHORT;

                Snackbar.make(view, message, duration).show();

            }
        });

    }

    @Override
    protected void onStart () {
        super.onStart();
        Log.d("LabActivity4", "onResume() has executed");
    }

}
