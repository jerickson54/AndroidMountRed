package android.erickson.com.mountred;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by Jake on 9/13/2018.
 */

public class BattleActivity extends AppCompatActivity
{



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_container_battle);



        ActionBar ab = getSupportActionBar();
        ab.hide();

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container_battle);

        if(fragment == null)
        {
            fragment = new BattleFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_container_battle,fragment)
                    .commit();
        }




    }
}
