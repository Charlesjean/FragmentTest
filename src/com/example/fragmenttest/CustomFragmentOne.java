package com.example.fragmenttest;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustomFragmentOne extends Fragment {


	
	@Override
	public void onAttach(Activity activity) {
		Log.i(this.getClass().getName(), "OnAttach");
		super.onAttach(activity);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		Log.i(this.getClass().getName(), "onActivityCreated");
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.i(this.getClass().getName(), "onCreate");
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onDestroy() {
		Log.i(this.getClass().getName(), "onDestroy");
		super.onDestroy();
	}

	@Override
	public void onDestroyView() {
		Log.i(this.getClass().getName(), "onDestroyView");
		super.onDestroyView();
	}

	@Override
	public void onDetach() {
		Log.i(this.getClass().getName(), "onDetach");
		super.onDetach();
	}

	@Override
	public void onStart() {
		Log.i(this.getClass().getName(), "onStart");
		super.onStart();
	}

	@Override
	public void onStop() {
		Log.i(this.getClass().getName(), "onStop");
		super.onStop();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		Log.i(this.getClass().getName(), "onCreateView");
		
		View mContainer = null;
		if(mContainer == null)
			mContainer = inflater.inflate(R.layout.main_menu, null);
		TextView text = new TextView(this.getActivity());
		text.setText("Fragment 1");
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
