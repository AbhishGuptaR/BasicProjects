package com.example.android.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     GridView gridView;
     String[] NAMES = {"Folder1","Folder2","Folder3","Folder4","Folder5","Folder6","Folder7","Folder8","Folder9"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = (GridView)findViewById(R.id.GridView);
        GridAdapter gridAdapter = new GridAdapter();
        gridView.setAdapter(gridAdapter);
    }

    class GridAdapter extends BaseAdapter{

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
            view = getLayoutInflater().inflate(R.layout.customlayout,null);

            ImageView imageView = (ImageView)view.findViewById(R.id.imageview);
            TextView textView = (TextView)view.findViewById(R.id.textView);

            imageView.setImageResource(R.drawable.folder);
            textView.setText(NAMES[position]);

            return view;
        }
    }
}


