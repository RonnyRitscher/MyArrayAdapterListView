package de.proneucon.myarrayadapterlistview;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

// Muss die klasse ArrayAdapter<MyItem> erweitern

public class MyAdapter extends ArrayAdapter<MyItem> {
    //------------------------------------------------------------------
    //MEMBER
    private Context context;
    private int resourceView;
    private List<MyItem> myItems;


    //------------------------------------------------------------------
    //CONSTRUCTOR
    public MyAdapter(@NonNull Context context, int resource, @NonNull List<MyItem> myItems) {
        super(context, resource, myItems);
        //->zuweisen der member
        resourceView = resource;    //int_id
        this.context = context;
        this.myItems = myItems;
    }

    //------------------------------------------------------------------
    //@Nullable
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //LAYOUT-INFLATER
        // listview_item.xml ist dann im convertView enthalten/verwendbar
        convertView = ((Activity)context).getLayoutInflater().inflate(resourceView , parent , false);

        // NAME des Kunden
        TextView name = convertView.findViewById(R.id.tv_listview_item_name); //greife auf das tv zu
        name.setText(myItems.get(position).getName());   //gehe an die position x und hole dir den Namen (aus der MyItem.java)

        // BESCHREIBUNG des Kunden
        TextView beschreibung = convertView.findViewById(R.id.tv_listview_item_text_beschreibung);
        beschreibung.setText(myItems.get(position).getBeschreibung());

        // CHECK-BOX isKunde   (->standard ist false)
        CheckBox isKunde = convertView.findViewById(R.id.cb_listview_item_is_kunde);
        isKunde.setChecked(myItems.get(position).isKunde());

        // IMAGE des Kunden
        ImageView image = convertView.findViewById(R.id.iv_listview_item_img);
        image.setImageResource(myItems.get(position).getIcon());


        return convertView;
    }
    //------------------------------------------------------------------
}
