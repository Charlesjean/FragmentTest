package com.example.fragmenttest;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustomFragmentTwo extends Fragment {

	
	@Override
	public void onAttach(Activity activity) {
		Log.i(this.getClass().getName(), "OnAttach");
		super.onAttach(activity);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		Log.i(this.getClass().getName(), "onCreateView");
		
		View mContainer = null;
		if(mContainer == null)
			mContainer = inflater.inflate(R.layout.main_menu, null);
		TextView text = new TextView(this.getActivity());
		text.setText("Fragment 2");
		LinearLayout.LayoutParams layout = new LinearLayout.LayoutParams(250,80);
		layout.setMargins(100, 100, 0, 50);
		text.setLayoutParams(layout);

		((ViewGroup)mContainer).addView(text);
		
		return mContainer;
	}

	@Override
	public void onPause() {
		Log.i(this.getClass().getName(), "onPause");
		super.onPause();
	}

	@Override
	public void onResume() {
		Log.i(this.getClass().getName(), "onResume");
		super.onResume();
	}

}
