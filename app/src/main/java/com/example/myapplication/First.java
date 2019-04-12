package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import android.support.annotation.NonNull;




public class First extends AppCompatActivity {
    private DatabaseReference ref;
    Button button;
    EditText empid,pass;
    private DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        empid = (EditText) findViewById(R.id.eid);
        pass = (EditText) findViewById(R.id.pwd);
        FirebaseApp.initializeApp(this);
        ref = FirebaseDatabase.getInstance().getReference().child("Conductor");
        addListenerOnButton();
    }

        public void addListenerOnButton() {



            button = (Button) findViewById(R.id.button2);

            button.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                        //Toast.makeText(First.this, "okok", Toast.LENGTH_LONG).show();
                        String e = empid.getText().toString();
                        final String p = pass.getText().toString();
                        //Toast.makeText(First.this, ref.child(e).toString(), Toast.LENGTH_LONG).show();
                    if (ref.child(e) != null) {
                        ref.child(e).addValueEventListener(new ValueEventListener() {

                            @Override

                            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                Conductor conductor = new Conductor();
                                conductor = dataSnapshot.getValue(Conductor.class);
                                //Toast.makeText(First.this, conductor.getPass(), Toast.LENGTH_LONG).show();
                                //                    String p =pass.getText().toString();
                                if (p.equals(conductor.getPass())) {
                                    Toast.makeText(First.this, "Login Successful", Toast.LENGTH_LONG).show();
                                    Intent start = new Intent(First.this, MapActivity.class);
                                    startActivity(start);
                                } else {
                                    Toast.makeText(First.this, "Login UNSuccessful", Toast.LENGTH_LONG).show();

                                }

                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError databaseError) {

                            }
                        });
                    }
                        //Intent intent = new Intent(First.this, MapActivity.class);
                    //startActivity(intent);

                }

    });

}
}
