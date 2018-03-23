package logicsquare.logicsquare;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class KishoreActivity extends AppCompatActivity {
    public static TextView fetchedData, fetchedData2;
    private Button btnKishoreL;
    private Button btnKishoreA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kishore);

        fetchedData = findViewById(R.id.fData);
        fetchedData2 = findViewById(R.id.fData2);

        btnKishoreL = findViewById(R.id.btnKishoreL);
        btnKishoreA = findViewById(R.id.btnKishoreA);


        btnKishoreL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fetchSongs process = new fetchSongs();
                process.execute();


            }
        });
        btnKishoreA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fetchSongs2 process2 = new fetchSongs2();
                process2.execute();

            }
        });
    }
}
