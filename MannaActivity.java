package logicsquare.logicsquare;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MannaActivity extends AppCompatActivity {
    public static TextView fetchedData, fetchedData2;
    private Button btnMannaL;
    private Button btnMannaA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manna);


        fetchedData = findViewById(R.id.fData);
        fetchedData2 = findViewById(R.id.fData2);

        btnMannaL = findViewById(R.id.btnMannaL);
        btnMannaA = findViewById(R.id.btnMannaA);


        btnMannaL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fetchSongs3 process = new fetchSongs3();
                process.execute();


            }
        });
        btnMannaA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fetchSongs4 process2 = new fetchSongs4();
                process2.execute();

            }
        });
    }
}
