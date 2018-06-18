package com.example.android.basics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] NAMES={"Product1","Product2","Product3","Product4","Product5"};

    String[] PRODUCTS={"Computer","Mouse","Keyboard","Pendrive","Headphone"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listview = (ListView)findViewById(R.id.listview);

        CustomAdapter customAdapter = new CustomAdapter();

        listview.setAdapter(customAdapter);
    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return NAMES.length;
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
        public View getView(int position, View view, ViewGroup viewGroup) {

            view = getLayoutInflater().inflate(R.layout.listview,null);
            TextView name = (TextView)view.findViewById(R.id.names);
            TextView product = (TextView)view.findViewById(R.id.products);
            Log.i("MainActivity.java","This is a log message");
            name.setText(NAMES[position]);
            product.setText(PRODUCTS[position]);

            return view;
        }
    }
}

