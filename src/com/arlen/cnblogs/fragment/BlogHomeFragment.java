package com.arlen.cnblogs.fragment;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arlen.cnblogs.R;

public class BlogHomeFragment extends ListFragment {

	public BlogHomeFragment() {

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_blog_home, container,
				false);
		return rootView;
	}
}
