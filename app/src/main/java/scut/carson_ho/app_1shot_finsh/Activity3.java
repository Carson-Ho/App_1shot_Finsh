package scut.carson_ho.app_1shot_finsh;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Carson_Ho on 17/7/14.
 */

public class Activity3 extends AppCompatActivity {
    private Button button;
    private Carson_BaseApplicaiton app;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);


        button = (Button) findViewById(R.id.Button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                android.os.Process.killProcess(android.os.Process.myPid());

            }
        });


    }
}