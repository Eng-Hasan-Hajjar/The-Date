package com.example.hasansafwanhajjar.thedateforhasan;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction manager =getSupportFragmentManager().beginTransaction();
        popActivity pop =new popActivity();
        pop.show(manager, null);
    }


    public void setDate(String data){
        TextView tv=(TextView )findViewById(R.id.text_view);
    }
}
