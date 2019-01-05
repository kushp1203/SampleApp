package org.usfirst.frc.sampleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SampleActivity extends AppCompatActivity {

    private Button actionButton;
    private TextView actionLabel;
    private Button actionButtonTwo;
    private int n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
n = 0;
        actionButton = findViewById(R.id.actionButton);
        actionLabel = findViewById(R.id.actionText);
        actionButtonTwo = findViewById(R.id.actionButtontTwo);
        actionButtonTwo.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   Intent intent = new Intent(getApplication(),(Samplept2Activity.class));
                                                   startActivity(intent);

                                               }
                                           });

                actionButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        actionLabel.setVisibility(View.VISIBLE);
                        n++;
                        String clicks = "#'s of times clicked " + n;
                        actionLabel.setText(clicks);

                    }
                });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast toast = Toast.makeText(getApplicationContext(),
                "welcome back",Toast.LENGTH_SHORT);
        toast.show();
    }
}
