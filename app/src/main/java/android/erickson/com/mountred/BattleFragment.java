package android.erickson.com.mountred;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

/**
 * Created by Jake on 9/13/2018.
 */

public class BattleFragment extends Fragment
{

    private String selectedTrainer;

    private static final String SELECTED_TRAINER = "SELECTED_TRAINER";
    private String TAG = "BattleFragment.java";

    private TextView title;
    private ArrayList<battlePokemon> userPokemon;
    private ArrayList<battlePokemon> opponentPokemon;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View v = inflater.inflate(R.layout.battle,container,false);

        selectedTrainer = getActivity().getIntent().getStringExtra(SELECTED_TRAINER);
        Log.i(TAG,selectedTrainer);

        title = v.findViewById(R.id.title_battle);

        userPokemon = new ArrayList<battlePokemon>();
        opponentPokemon = new ArrayList<battlePokemon>();

        getTeam(selectedTrainer);



    /*
        ValueEventListener postListener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot)
            {
                for(DataSnapshot d: dataSnapshot.getChildren())
                {
                    String identifier = d.getValue().toString();
                    Log.i(TAG,identifier);
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                // Getting Post failed, log a message
                Log.w(TAG, "loadPost:onCancelled", databaseError.toException());
                // ...
            }
        };
        test.addValueEventListener(postListener);
        databaseReference.addValueEventListener(postListener);
        */




        return v;

    }

    private void getTeam(String trainerName)
    {

        //firebase database stuff
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference databaseReference = database.getReference();

        Log.i(TAG,"Getting " + trainerName + "'s Pokemon");
        Query getTrainerPokemon = databaseReference.child("trainerPokemon").child(trainerName);
        getTrainerPokemon.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s)
            {
                int i = 0;
                int currentPokemonIndex = 0;

                for(DataSnapshot d: dataSnapshot.getChildren())
                {

                    //ability first then nature last
                    //index 9 is move slot 1
                    if(i == 9)
                    {
                        String data = d.getValue().toString();
                        Log.i(TAG, data);


                        ValueEventListener moveValueListener = new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                for(DataSnapshot moveOne: dataSnapshot.getChildren())
                                {
                                    //Log.i(TAG,moveOne.getValue().toString());
                                    Move move1 = moveOne.getValue(Move.class);
                                    Log.i(TAG,move1.getIdentifier());

                                }
                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError databaseError) {

                            }
                        };

                        //query for data on the first move
                        Query moveOneQuery = databaseReference.child("moves").orderByChild("identifier").equalTo(d.getValue().toString());
                        moveOneQuery.addValueEventListener(moveValueListener);





                    }
                    if(i == 14) {
                        i = 0;
                        currentPokemonIndex++;
                    }
                    ++i;
                }
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        /*
        Log.i(TAG,"NOW TESTING CHARIZARD");
        Query test = databaseReference.child("WeightHeight").orderByChild("id").equalTo(6); //equal to charizard in this case. id according to national dex
        test.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                for(DataSnapshot d: dataSnapshot.getChildren())
                {
                    //displays in order of children as shown in firebase db
                    String identifier = d.getValue().toString();
                    Log.i(TAG, identifier);
                }
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        */

    }
}
