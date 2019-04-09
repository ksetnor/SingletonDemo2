package com.kylesetnor.singletondemo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //our two UI variables
    TextView idText;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bind the buttons and textviews to their variables
        button = findViewById(R.id.instantiateSingletonButton);
        idText = findViewById(R.id.singletonObjectID);

    }



    //create a Singleton instance and then output it's hash ID, if it is working
    //they should be the same everytime
    public void buttonClicked(View view) {


        Singleton.createSingleton();
        Singleton s = Singleton.getSingletonInstance();
        String string1 = "\n";
        String string2 = ((Integer.toString(System.identityHashCode(s))));

        idText.append(string1);
        idText.append(string2);

        System.out.println(System.identityHashCode(s));



    }

}
