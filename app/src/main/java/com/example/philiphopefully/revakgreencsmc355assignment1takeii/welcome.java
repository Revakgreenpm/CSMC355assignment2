package com.example.philiphopefully.revakgreencsmc355assignment1takeii;

import android.content.Intent;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class welcome extends AppCompatActivity {

    Button switchScreen;
    TextView message;
    String text;
    Intent i;



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        switchScreen = (Button) findViewById(R.id.unlock);
        switchScreen.setOnClickListener(new View.OnClickListener() {
                                            @Override
            public void onClick(View v) {
                Intent move = new Intent(welcome.this, AccessControl.class);
                startActivity(move);
            }
                                        }


        );
        message=(TextView) findViewById(R.id.mainText);
        Bundle b=getIntent().getExtras();
        if(b!=null){
          text= b.getString("unlockText");

            message.setText(text);
        }


    }




}
