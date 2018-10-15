package com.digitalhouse.digitalhouseapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.digitalhouse.digitalhouseapp.MainActivity;
import com.digitalhouse.digitalhouseapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PostDetailFragment extends Fragment {


    public PostDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_post_detail, container, false);

        TextView textViewTitle = view.findViewById(R.id.text_view_title_post_id);

        Bundle bundle = getArguments();

        String titulo = bundle.getString(MainActivity.POST_TITLE);
        String descricao = bundle.getString(MainActivity.POST_DESCRIPTION);

        textViewTitle.setText("O titulo do post é: " + titulo + "e a descricao é :"+descricao);

        return view;
    }

}
