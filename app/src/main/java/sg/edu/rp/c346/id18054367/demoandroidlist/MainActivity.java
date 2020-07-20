package sg.edu.rp.c346.id18054367.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvAndroid;
    ArrayList<AndroidVersion> androidList;
    //ArrayAdapter<AndroidVersion> aaAndroid;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAndroid = findViewById(R.id.listViewAndroid);

        androidList = new ArrayList<>();
        AndroidVersion Pie = new AndroidVersion("Pie", "9.0");
        AndroidVersion Oreo = new AndroidVersion("Oreo", "8.0 - 8.1");
        AndroidVersion Nougat = new AndroidVersion("Nougat", "7.0 - 7.1.2");
        AndroidVersion Marshmallow = new AndroidVersion("Marshmallow", "6.0 - 6.0.1");
        AndroidVersion Lollipop = new AndroidVersion("Lollipop", "5.0 - 5.1.1");
        AndroidVersion KitKat = new AndroidVersion("KitKat", "4.4 - 4.4.4");
        AndroidVersion Jelly_Bean = new AndroidVersion("Jelly Bean", "4.1 - 4.3.1");

        androidList.add(Pie);
        androidList.add(Oreo);
        androidList.add(Nougat);
        androidList.add(Marshmallow);
        androidList.add(Lollipop);
        androidList.add(KitKat);
        androidList.add(Jelly_Bean);

        //aaAndroid = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, androidList);
        adapter = new CustomAdapter(this, R.layout.row, androidList);

        //lvAndroid.setAdapter(aaAndroid);
        lvAndroid.setAdapter(adapter);

    }
}
