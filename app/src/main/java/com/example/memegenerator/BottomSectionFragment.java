package com.example.memegenerator;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomSectionFragment extends Fragment {

    TextView txt1_bottom;
    TextView txt2_bottom;
    // SHORTCUT: Alt + Ins for override funtions
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_fragment, container, false);

        txt1_bottom = (TextView)view.findViewById(R.id.textTop_bottomFragment);
        txt2_bottom = (TextView)view.findViewById(R.id.textBottom_bottomFragment);

        return view;
    }

    public void setMeme(String top, String bottom){
        txt1_bottom.setText(top);
        txt2_bottom.setText(bottom);
    }
}
