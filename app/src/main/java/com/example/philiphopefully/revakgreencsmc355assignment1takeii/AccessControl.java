package com.example.philiphopefully.revakgreencsmc355assignment1takeii;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AccessControl extends AppCompatActivity {

    Global g=Global.getInstance();
    TextView current;
    String code="";
    Button switchScreen;
    Button one;
    Button two;
    Button three;
    Button four;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access_control);
        current=(TextView) findViewById(R.id.password);
        switchScreen =(Button) findViewById(R.id.submit);
        switchScreen.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                submit();
            }

        });
        one =(Button) findViewById(R.id.one);
        two =(Button) findViewById(R.id.two);
        three=(Button) findViewById(R.id.three);
        four=(Button) findViewById(R.id.four);
        one.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                addOne();
            }
        });
        two.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                addTwo();
            }
        });
        three.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                addThree();
            }
        });
        four.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                addFour();
            }
        });
    }

    void addOne(){
        code=code+"1";
    }
    void addTwo(){
        code=code+"2";
    }
    void addThree(){code=code+"3"; }
    void addFour(){code=code+"4";  }

    void submit(){
        Intent move = new Intent(AccessControl.this, welcome.class);
        if(code.equals("1234")){
            g.setLocked(false);
            move.putExtra("unlockText","The App is unlocked.");

        }
        else{
            g.setLocked(true);
            move.putExtra("unlockText","\"Welcome to the App! The App is LOCKED!");
        }
        code="";

        startActivity(move);
    }
}

