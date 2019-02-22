package de.proneucon.myarrayadapterlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //LOG-TAG
    private static final String TAG = MainActivity.class.getSimpleName();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //DUMMY_DATEN
        List<MyItem> items = new ArrayList<>();
        items.add(new MyItem("Max" , "aus Berlin" , R.mipmap.ic_launcher, true));
        items.add(new MyItem("Peter" , "aus Frankfurt" , R.mipmap.ic_launcher, true));
        items.add(new MyItem("Frank" , "aus Hamburg" , R.mipmap.ic_launcher, true));
        items.add(new MyItem("Lisa" , "aus München" , R.mipmap.ic_launcher, true));

        // verwenden der LIST-VIEW von activity_main
        ListView listView = findViewById(R.id.lv_id_myList);

        // HEADER der LIST-VIEW
        View header = getLayoutInflater().inflate(R.layout.listview_header , null);

        //ADAPTER erstellen
        MyAdapter myAdapter = new MyAdapter(this , R.layout.listview_item , items);

        listView.addHeaderView(header);

        listView.setAdapter(myAdapter);


    }
}
