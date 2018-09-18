package android.erickson.com.mountred;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;

/**
 * Created by Jake on 9/12/2018.
 */

public class MainActivity extends AppCompatActivity
{


    private static final String SELECTED_TRAINER = "SELECTED_TRAINER";

    //trainer select intent
    public static Intent newIntentTrainerSelection(Context packageContext)
    {
        //dont need any extras because no new data is passed to trainer selection
        return new Intent(packageContext,TrainerSelectionActivity.class);
    }

    //battle intent
    public static Intent newIntentBattle(Context packageContext, String selectedTrainer)
    {
        Intent i = new Intent(packageContext,BattleActivity.class);
        i.putExtra(SELECTED_TRAINER,selectedTrainer);
        return i;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_container);

        //dont want the action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //getIntent.getInt / getIntent.getBooleanExtra goes here

        FragmentManager fm = getSupportFragmentManager();
        //fragment container to hold the fragments
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if(fragment == null)
        {
            //doing this establishes the fragment is filled with main fragment
            fragment = new MainMenuFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_container,fragment)
                    .commit();
        }

    }


}
