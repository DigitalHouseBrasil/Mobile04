package com.digitalhouse.digitalhouseapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.digitalhouse.digitalhouseapp.HomeActivity;
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
        // Define o layout XML do fragment
        View view = inflater.inflate(R.layout.fragment_post_detail, container, false);

        // Busca uma view por ID
        TextView textViewTitle = view.findViewById(R.id.text_view_title_post_id);

        // Através do bundle buscar o titulo e a descrição do Post
        Bundle bundle = getArguments();

        String titulo = bundle.getString(HomeActivity.POST_TITLE);
        String descricao = bundle.getString(HomeActivity.POST_DESCRIPTION);

        textViewTitle.setText("O titulo do post é: " + titulo + "e a descricao é :"+descricao);

        return view;
    }

}
