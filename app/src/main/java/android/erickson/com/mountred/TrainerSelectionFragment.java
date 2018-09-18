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
 * Created by Jake on 9/13/2018.
 */

public class TrainerSelectionFragment extends Fragment
{

    private ImageButton mAshButton;
    private ImageButton mGaryButton;
    private String TAG = "TRAINER_SELECTION_FRAGMENT";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
       View v = inflater.inflate(R.layout.trainer_selection,container,false);

       mAshButton = v.findViewById(R.id.ash_button);
       mAshButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Log.i(TAG,"Clicked ash!");
               Intent intent = MainActivity.newIntentBattle(getActivity(),"Red");
               startActivity(intent);
           }
       });

       mGaryButton = v.findViewById(R.id.gary_button);
       mGaryButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Log.i(TAG,"Clicked blue!");
               Intent intent = MainActivity.newIntentBattle(getActivity(),"Blue");
               startActivity(intent);
           }
       });

       return v;
    }
}
