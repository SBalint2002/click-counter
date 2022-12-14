package hu.petrik.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button plusz;
    private TextView szamlalo;
    private Button minusz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        plusz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int szam = Integer.parseInt(szamlalo.getText().toString()) + 1;
                szamlalo.setText(String.valueOf(szam));
                if (szam < 0) {
                    szamlalo.setTextColor(Color.argb(255, 0, 255, 0));
                }
                if (szam == 0) {
                    szamlalo.setTextColor(Color.BLUE);
                }

                if (szam > 0) {
                    int primszamlalo = 0;
                    for (int i = 1; i <= szam; i++) {
                        if (szam % i == 0) {
                            primszamlalo++;
                        }
                    }
                    if (szam == 0) {
                        szamlalo.setTextColor(Color.BLUE);
                    } else if (primszamlalo == 2) {
                        szamlalo.setTextColor(Color.argb(255, 255, 255, 255));
                    } else if (szam > 0) {
                        szamlalo.setTextColor(Color.argb(255, 0, 255, 0));
                    }
                }
            }
        });

        minusz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int szam = Integer.parseInt(szamlalo.getText().toString()) - 1;
                szamlalo.setText(String.valueOf(szam));
                if (szam < 0) {
                    szamlalo.setTextColor(Color.argb(255, 255, 0, 0));
                }
                if (szam == 0) {
                    szamlalo.setTextColor(Color.BLUE);
                }
                if (szam > 0) {
                    int primszamlalo = 0;
                    for (int i = 1; i <= szam; i++) {
                        if (szam % i == 0) {
                            primszamlalo++;
                        }
                    }
                    if (szam == 0) {
                        szamlalo.setTextColor(Color.BLUE);
                    } else if (primszamlalo == 2) {
                        szamlalo.setTextColor(Color.argb(255, 255, 255, 255));
                    } else if (szam > 0) {
                        szamlalo.setTextColor(Color.argb(255, 0, 255, 0));
                    }
                }
            }
        });

        /*szamlalo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szamlalo.setText("0");
                szamlalo.setTextColor(Color.argb(255,0,0,255));
            }
        });*/

        szamlalo.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                szamlalo.setText("0");
                szamlalo.setTextColor(getResources().getColor(R.color.kekecske));
                return true;
            }
        });
    }


    private void init() {
        plusz = findViewById(R.id.plusz);
        szamlalo = findViewById(R.id.szamlalo);
        minusz = findViewById(R.id.minusz);
    }
}