package com.example.fragmenttest;

import android.app.Activity;
import android.app.Fragment;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.util.Log;
import android.util.StateSet;
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
        text.setClickable(true);
        this.addStateDrawable(text);
        this.addColorState(text);
		LinearLayout.LayoutParams layout = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
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

    /*
    *Add statedrawable for targetView to display different drawable when
    * view is in different state
     */
    public void addStateDrawable(View targetView)
    {
        StateListDrawable listDrawable = new StateListDrawable();
        //add drawable used when view is pressed
        listDrawable.addState(new int[]{android.R.attr.state_pressed}, new ColorDrawable(Color.rgb(106,170,234)));
        //show gray background for all other state
        listDrawable.addState(StateSet.WILD_CARD, new ColorDrawable(Color.GRAY));
        targetView.setBackgroundDrawable(listDrawable);

    }

    /**
     * set different text color for different state
     */
    public void addColorState(TextView targetView)
    {
        int[][] states = {
                new int[]{android.R.attr.state_pressed},
                StateSet.WILD_CARD};
        int[] colors = {Color.RED, Color.BLACK};
        ColorStateList coloList = new ColorStateList(states, colors);
        targetView.setTextColor(coloList);
    }
}
