package sg.edu.rp.c346.id19032110.demoboxlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvColor;
    ArrayList<Box> alColor;
    CustomAdapter caColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvColor = findViewById(R.id.listViewColor);
        alColor = new ArrayList<>();

        Box color1 = new Box("Blue");
        Box color2 = new Box("Orange");
        Box color3 = new Box("Brown");

        alColor.add(color1);
        alColor.add(color2);
        alColor.add(color3);

        caColor = new CustomAdapter(this, R.layout.row, alColor);
        lvColor.setAdapter(caColor);
    }
}
