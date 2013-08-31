package com.example.fragmenttest;

import android.app.Activity;
import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainMenuFragment extends Fragment {
	
	public interface MenuFragmentListener
	{
		public void goToFragmentOne();
		public void goToFragmentTwo();
	}

	
	private MenuFragmentListener mListener;
	@Override
	public void onAttach(Activity activity) {
		
		Log.i("MainMenuFragment", "onAttach");
		try
		{
			this.mListener = (MenuFragmentListener)activity;			
		}catch(ClassCastException e)
		{
			
		}
		super.onAttach(activity);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.i("MainMenuFragment", "onCreateView");
		View mContainer = null;
		if(mContainer == null)
			mContainer = inflater.inflate(R.layout.main_menu, null);
		Button btn1 = new Button(this.getActivity());
		btn1.setText("To Fragment 1");
		LinearLayout.LayoutParams layout = new LinearLayout.LayoutParams(250,80);
		layout.setMargins(100, 100, 0, 50);
		btn1.setLayoutParams(layout);
		btn1.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) {
				MainMenuFragment.this.mListener.goToFragmentOne();
				
			}
			
		});
		((ViewGroup)mContainer).addView(btn1);
		
		Button btn2 = new Button(this.getActivity());
		btn2.setText("To Fragment 2");
		btn2.setLayoutParams(layout);
		btn2.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				MainMenuFragment.this.mListener.goToFragmentTwo();
			}
		});
		((ViewGroup)mContainer).addView(btn2);
		
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
