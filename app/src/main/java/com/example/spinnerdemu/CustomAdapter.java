package com.example.spinnerdemu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    int[] flag;
    private String[] countryname;
   private String[] population;
   private LayoutInflater inflater;


    public CustomAdapter(Context context, int[] flag, String[] countryname, String[] population) {
        this.context = context;
        this.flag = flag;
        this.countryname = countryname;
        this.population = population;
    }

    @Override
    public int getCount() {
        return countryname.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null){

            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.viewlayout,null,false);

        }

        ImageView imageView =convertView.findViewById(R.id.imageviewid);
        TextView country = convertView.findViewById(R.id.nametextviewid);
        TextView populationNumber= convertView.findViewById(R.id.populationtextviewid);

        imageView.setImageResource(flag[position]);
        country.setText(countryname[position]);
        populationNumber.setText(population[position]);

        return convertView;

    }
}
