package android.erickson.com.mountred;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by Jake on 9/12/2018.
 */

public class MainMenuFragment extends Fragment {

    private ImageButton mStartGame;
    private ImageButton mTrainerSelectionButton;

    private String TAG = "MAIN_MENU_FRAGMENT";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.activity_main,container,false);

        mStartGame = v.findViewById(R.id.pokeball_button);

        mStartGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG,"You clicked start!");
            }
        });

        mTrainerSelectionButton = v.findViewById(R.id.masterball_button);
        mTrainerSelectionButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.i(TAG,"You clicked master battle button!");

                Intent intent = MainActivity.newIntentTrainerSelection(getActivity());
                startActivity(intent);

            }
        });

        return v;
    }
}
