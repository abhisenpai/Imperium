package com.example.android.imperium;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class PowerActivity extends AppCompatActivity {
    TextView pow;
    FirebaseDatabase FDB;
    DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_power);
        pow = findViewById(R.id.powernumber);
        SwitchCompat switchCompat = findViewById(R.id.togglebut);
        switchCompat.setSwitchPadding(40);

        GetPower();
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    updateData();
                }
                else{
                    updateData0();
                }
            }
        });

        //GetPower();
    }

    private void updateData() {
        FDB = FirebaseDatabase.getInstance();
        myRef = FDB.getReference().getRoot();
        myRef.child("-LO1dKD6pkFSDJKjVp_m").child("devices").child("device1").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                dataSnapshot.getRef().child("status").setValue("1");

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.d("User", databaseError.getMessage());
            }
        });
    }

    private void updateData0() {
        FDB = FirebaseDatabase.getInstance();
        myRef = FDB.getReference();
        myRef.child("-LO1dKD6pkFSDJKjVp_m").child("devices").child("device1").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                dataSnapshot.getRef().child("status").setValue("0");

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.d("User", databaseError.getMessage());
            }
        });
    }

    /**
     * private void GetPower(){
     * <p>
     * DatabaseReference myRef = FirebaseDatabase.getInstance().getReference().getRoot();
     * myRef.child("-LNzTxuEa7SnGyEbkmxK").child("devices").child("device1").addValueEventListener(new ValueEventListener() {
     *
     * @Override public void onDataChange(DataSnapshot dataSnapshot) {
     * Power data=dataSnapshot.getValue(Power.class);
     * Log.e("DADDY", "onDataChange: "+data.getPower());
     * pow.setText(data.getPower());
     * }
     * @Override public void onCancelled(DatabaseError databaseError) {
     * <p>
     * }
     * });
     * }
     **/
    private void GetPower() {

        DatabaseReference myRef = FirebaseDatabase.getInstance().getReference().getRoot();
        myRef.child("-LO1dKD6pkFSDJKjVp_m").child("devices").child("device1").child("sessions").addValueEventListener(new ValueEventListener() {
            ArrayList<String> sum = new ArrayList<>();
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot postsnapshot : dataSnapshot.getChildren()) {
                    Log.e("DADDY", "onDataChange: " + postsnapshot.toString());
                    SessionP data = postsnapshot.getValue(SessionP.class);
                    sum.add(data.getEnergy());
                }
                pow.setText(""+sum.get(sum.size()-1));
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

}
