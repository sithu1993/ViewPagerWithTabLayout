package com.app.viewpagerwithtab.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.app.viewpagerwithtab.R;

/**
 * Created by Geek on 8/31/17.
 */

public class ViewPagerFragment extends Fragment {


    private TextView txtText;
    private int position;


    public static ViewPagerFragment newInstance(int position) {

        Bundle args = new Bundle();
        args.putInt("position",position);
        ViewPagerFragment fragment = new ViewPagerFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set position here
        position=getArguments().getInt("position");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.viewpager_layout, container, false);

        //initialized text view
        txtText = (TextView)rootView.findViewById(R.id.txtViewPager);
        //set Text Here
        txtText.setText("View Pager "+position);

        return rootView;
    }
}
