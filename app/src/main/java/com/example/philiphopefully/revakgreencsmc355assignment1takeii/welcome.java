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
    boolean locked=true;
    Global g= Global.getInstance();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if(g.getLocked()==(null)){
            g.setLocked(true);
        }
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

    }

    protected void onUpdate(){
        changeMess();

    }

    public void changeMess(){
        message= (TextView)(findViewById(R.id.mainText));
        locked=g.getLocked();
        if(locked){
            message.setText("Welcome to the App! The App is LOCKED!");
        }
        else if(!locked){
            message.setText("The App is Unlocked.");
        }

    }
}
