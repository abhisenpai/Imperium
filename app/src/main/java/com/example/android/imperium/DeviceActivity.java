package com.example.android.imperium;

import android.app.Activity;
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

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class DeviceActivity extends AppCompatActivity {

    /**RecyclerView deviceRecyclerView;
    RecyclerView.LayoutManager myLayoutManager;
    DevicesAdapter devicesAdapter;
    FirebaseDatabase FDB;
    List<Devices> listData1;
    DatabaseReference myRef;**/
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device);
        txt = findViewById(R.id.hall);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(DeviceActivity.this,CurrentActivity.class);
                startActivity(i);
            }
        });
        /**deviceRecyclerView = findViewById(R.id.device_recycler_view);
        deviceRecyclerView.setHasFixedSize(true);
        listData1 = new ArrayList<>();
        devicesAdapter = new DevicesAdapter(listData1);
        myLayoutManager = new LinearLayoutManager(getApplicationContext());
        deviceRecyclerView.setLayoutManager(myLayoutManager);
        FDB = FirebaseDatabase.getInstance();
        GetDeviceFirebase();**/
    }
   /** public void GetDeviceFirebase(){
        myRef=FDB.getReference().getRoot();
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for(DataSnapshot postSnapshot:dataSnapshot.getChildren()){
                    Devices data = new Devices(postSnapshot.getKey());
                    listData1.add(data);
                }
                deviceRecyclerView.setAdapter(devicesAdapter);
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
    public class DevicesAdapter extends RecyclerView.Adapter<DevicesAdapter.MyViewHolder>{
        List<Devices> listArray1;
        public DevicesAdapter(List<Devices> list) {
            this.listArray1 = list;
        }
        @Override
        public DevicesAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_shop, parent, false);
            return new MyViewHolder(view);
        }
        @Override
        public void onBindViewHolder(DevicesAdapter.MyViewHolder holder, int position) {
            Devices data = listArray1.get(position);
            holder.MyText.setText(data.getDevices());
        }
        public class MyViewHolder extends RecyclerView.ViewHolder{
            TextView MyText;

            public MyViewHolder(View itemView) {
                super(itemView);
                MyText = itemView.findViewById(R.id.device_name);

            }
        }
        @Override
        public int getItemCount() {
            return listArray1.size();
        }
    }**/
}
