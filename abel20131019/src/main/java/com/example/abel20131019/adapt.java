package com.example.abel20131019;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2013.10.18..
 */
public class adapt extends BaseAdapter {

    private final List<Muff> muffs;

    public adapt(final Context context, final ArrayList<Muff> aMuffs) {
        Log.d("ABELL", "adapt constructor");
        muffs = aMuffs;
    }

    public void addItem(Muff aMuff) {
        Log.d("ABELL", "adapt addItem");
        muffs.add(aMuff);
    }

    public int getCount() {
        Log.d("ABELL", "adapt getCount");
        return muffs.size();
    }

    public Muff getItem(int position) {
        Log.d("ABELL", "adapt getItem");
        return muffs.get(position);
    }

    public long getItemId(int position) {
        Log.d("ABELL", "adapt getItemId");
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        Log.d("ABELL", "adapt getView");

        final Muff muff = muffs.get(position);
        LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.lmuff, null);

        Button btn = (Button) itemView.findViewById(R.id.button);
        btn.setText(muff.getNev());

        return itemView;


    }

}
