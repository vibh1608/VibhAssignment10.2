package com.example.user.vibhassignment102;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Ashutosh on 18-06-2017.
 */

public class CountryDetailsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        /** Inflating the layout country_details_fragment_layout to the view object v */
        View v = inflater.inflate(R.layout.fragment_country_details, null);

        /** Getting the textview object of the layout to set the details */
        TextView tv = (TextView) v.findViewById(R.id.country_details);

        /** Getting the bundle object passed from MainActivity ( in Landscape mode )  or from
         *  CountryDetailsActivity ( in Portrait Mode )
         * */
        Bundle b = getArguments();

        /** Getting the clicked item's position and setting corresponding details in the textview of the detailed fragment */
        tv.setText(Details.titleName[b.getInt("position")]);

        return v;   //returning view.
    }


}


