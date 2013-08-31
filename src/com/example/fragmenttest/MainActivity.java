package com.example.fragmenttest;

import com.example.fragmenttest.MainMenuFragment.MenuFragmentListener;

import android.os.Bundle;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentManager.OnBackStackChangedListener;
import android.app.FragmentTransaction;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity implements MenuFragmentListener, OnBackStackChangedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        this.getFragmentManager().addOnBackStackChangedListener(this);
        setUpMainFragment();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
 
    private void setUpMainFragment()
    {
    	MainMenuFragment menuFragment = new MainMenuFragment();
    	FragmentManager fm = this.getFragmentManager();
    	FragmentTransaction trans = fm.beginTransaction();
    	trans.replace(R.id.fragmentcontainer, menuFragment);
    	trans.commit();
    	
    }

	@Override
	public void goToFragmentOne() {
		
		Log.i("test", "Go to Fragment one");
    	CustomFragmentOne fragment = new CustomFragmentOne();
    	FragmentManager fm = this.getFragmentManager();
    	FragmentTransaction trans = fm.beginTransaction();
    	trans.replace(R.id.fragmentcontainer, fragment);
    	trans.addToBackStack(null);
    	trans.commit();
		
	}

	@Override
	public void goToFragmentTwo() {
		Log.i("test", "Go to Fragment two");
    	CustomFragmentTwo fragment = new CustomFragmentTwo();
    	FragmentManager fm = this.getFragmentManager();
    	FragmentTransaction trans = fm.beginTransaction();
    	trans.replace(R.id.fragmentcontainer, fragment);
    	trans.addToBackStack(null);
    	trans.commit();	
		
	}

	@Override
	public void onBackStackChanged() {

		Log.i(this.getClass().getName(), "onBackStackChanged");
	}
}
