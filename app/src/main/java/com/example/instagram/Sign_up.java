package com.example.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.SaveCallback;
import com.shashank.sony.fancytoastlib.FancyToast;

public class Sign_up extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    private EditText name;
    private EditText speed;
    private EditText power;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        button = findViewById(R.id.button);
        name = findViewById(R.id.name);
        speed  = findViewById(R.id.speed);
        power = findViewById(R.id.power);
        button.setOnClickListener(Sign_up.this);
    }


    @Override
    public void onClick(View v) {
        final ParseObject kickboxer = new ParseObject("kickboxer");
        kickboxer.put("name", name.getText().toString());
        kickboxer.put("speed", speed.getText().toString());
        kickboxer.put("power", power.getText().toString());
        kickboxer.saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException e) {
                if (e == null) {
                    FancyToast.makeText(Sign_up.this,kickboxer.get("name") + "",FancyToast.LENGTH_LONG,FancyToast.SUCCESS,true).show();
                }
                else {
                    FancyToast.makeText(Sign_up.this, e.getMessage() +"",FancyToast.LENGTH_LONG,FancyToast.ERROR,true).show();
                }    }
        });

    }
}

