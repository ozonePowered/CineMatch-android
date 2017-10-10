package com.cinematching.application.controllers.fragments.main;


import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.cinematching.application.R;
import com.cinematching.application.controllers.fragments.BaseFragment;

/**
 * Created by meryl on 06/09/2017.
 */

public class UserInfoFragment extends BaseFragment {
    private static String fragmentTitle = "User details";
    ImageView image;
    TextView nickname;
    TextView note;
    TextView firstname;
    TextView lastname;
    TextView age;
    TextView city;
    TextView zipcode;
    TextView contact;
    RecyclerView userMoviesList;

    public UserInfoFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user_infos, container, false);

        image = (ImageView) view.findViewById(R.id.userInfo_image);
        nickname = (TextView) view.findViewById(R.id.userInfo_nickname);
        note = (TextView) view.findViewById(R.id.userInfo_note);
        firstname = (TextView) view.findViewById(R.id.userInfo_firstname);
        lastname = (TextView) view.findViewById(R.id.userInfo_lastname);
        age = (TextView) view.findViewById(R.id.userInfo_age);
        city = (TextView) view.findViewById(R.id.userInfo_city);
        zipcode = (TextView) view.findViewById(R.id.userInfo_zipCode);
        contact = (TextView) view.findViewById(R.id.userInfo_contact);

        userMoviesList = (RecyclerView) view.findViewById(R.id.userInfo_moviesList);

        initView();
        return view;
    }

    private void initView() {
    }

    @Override
    public String getFragmentTitle() {
        return fragmentTitle;
    }

    @Override
    public void setFragmentTitle(String fragmentTitle) {
        UserInfoFragment.fragmentTitle = fragmentTitle;
    }
}