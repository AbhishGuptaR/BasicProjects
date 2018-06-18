package com.example.android.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.RecyclerView);
        String[] text={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new RecyclerAdapter(text));
    }


    class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>{

        private String[] data;
        private ViewGroup parent;
        private int viewType;

        public RecyclerAdapter(String[] data){
              this.data=data;
        }

        @NonNull
        @Override
        public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            this.parent = parent;
            this.viewType = viewType;
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            View view = inflater.inflate(R.layout.list_item_layout,parent,false);
            return new RecyclerViewHolder(view);

        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
            String text = data[position];
            holder.text.setText(text);
        }

        @Override
        public int getItemCount() {
            return data.length;
        }

        public class RecyclerViewHolder extends  RecyclerView.ViewHolder{
            ImageView image;
            TextView text;
            public  RecyclerViewHolder(View itemView){
                super(itemView);
                image = (ImageView)findViewById(R.id.image);
                text = (TextView)findViewById(R.id.text);
            }
        }

    }
}
