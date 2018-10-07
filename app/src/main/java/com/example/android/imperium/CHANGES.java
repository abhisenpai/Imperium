package com.example.android.imperium;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class CHANGES extends AppCompatActivity {
    /**RecyclerView myRecyclerView;
    RecyclerView.LayoutManager myLayoutManager;
    MyAdapter myAdapter;
    FirebaseDatabase FDB;
    List<Shops> listData;
    DatabaseReference myRef;**/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changes);

        /**myRecyclerView = findViewById(R.id.my_recycler_view);
        myRecyclerView.setHasFixedSize(true);
        listData = new ArrayList<>();
        myAdapter = new MyAdapter(listData);
        myLayoutManager = new LinearLayoutManager(getApplicationContext());
        myRecyclerView.setLayoutManager(myLayoutManager);
        FDB = FirebaseDatabase.getInstance();
        GetDataFirebase();**/

    }
    /**public void GetDataFirebase(){
        myRef=FDB.getReference().getRoot();
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for(DataSnapshot postSnapshot:dataSnapshot.getChildren()){
                    Shops data = new Shops(postSnapshot.getKey());
                    listData.add(data);
                }
                myRecyclerView.setAdapter(myAdapter);
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }**/
    /**public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
        List<Shops> listArray;
        public MyAdapter(List<Shops> list) {
            this.listArray = list;
        }
        @Override
        public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_shop, parent, false);
            return new MyViewHolder(view);
        }
        @Override
        public void onBindViewHolder(MyAdapter.MyViewHolder holder, int position) {
            Shops data = listArray.get(position);
            holder.MyText.setText(data.getShop());
        }
        public class MyViewHolder extends RecyclerView.ViewHolder{
            TextView MyText;

            public MyViewHolder(View itemView) {
                super(itemView);
                MyText = itemView.findViewById(R.id.shop_name);
                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Context context=v.getContext();
                        Intent i = new Intent(context,DeviceActivity.class);
                        startActivity(i);
                    }
                });
            }

        }
        @Override
        public int getItemCount() {
            return listArray.size();
        }
    }**/
}
