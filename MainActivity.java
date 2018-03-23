package logicsquare.logicsquare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnSongs, btnKishore, btnManna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSongs = findViewById(R.id.btnSongs);
        btnKishore = findViewById(R.id.btnKishore);
        btnManna = findViewById(R.id.btnManna);


        btnSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnKishore.setVisibility(View.VISIBLE);
                btnManna.setVisibility(View.VISIBLE);
            }
        });

        btnKishore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, KishoreActivity.class);
                startActivity(intent);
            }
        });
        btnManna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MannaActivity.class);
                startActivity(intent);
            }
        });

    }
}
