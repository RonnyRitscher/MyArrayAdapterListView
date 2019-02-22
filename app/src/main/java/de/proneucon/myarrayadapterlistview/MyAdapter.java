package de.proneucon.myarrayadapterlistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

public class MyAdapter extends ArrayAdapter<MyItem> {
    //------------------------------------------------------------------
    //MEMBER
    private int position;

    //------------------------------------------------------------------
    //CONSTRUCTOR
    public MyAdapter(@NonNull Context context, int resource, @NonNull List<MyItem> objects) {
        super(context, resource, objects);
    }

    //------------------------------------------------------------------
    //@Nullable
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
    //------------------------------------------------------------------
}
