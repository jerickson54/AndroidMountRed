package android.erickson.com.mountred;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Jake on 9/13/2018.
 */

public class TrainerSelectionActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_container_trainer_selection);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container_trainer_selection);

        if(fragment == null)
        {
            fragment = new TrainerSelectionFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_container_trainer_selection,fragment)
                    .commit();
        }



    }
}
