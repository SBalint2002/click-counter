package hu.petrik.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button plusz;
    private TextView szam;
    private Button minusz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private void init(){
        //layout = findViewById(R.id.layout);
        plusz = findViewById(R.id.plusz);
        szam = findViewById(R.id.szam);
        minusz = findViewById(R.id.minusz);
        //rnd = new Random();
    }
}