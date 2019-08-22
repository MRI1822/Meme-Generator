package com.example.memegenerator;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TopSectionFragment extends Fragment {

    private static EditText txt1 ;
    private static EditText txt2;

    TopSectionListener mCallback;

    /*public void setTopSectionListener(Activity activity){
        mCallback = activity;
    }*/

    public interface TopSectionListener{
        public void createMeme(String top, String bottom);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        System.out.print("Entering OnAttach");
        mCallback = (TopSectionListener) context;
        System.out.print("Exiting OnAttach()");
    }

    // SHORTCUT: Alt + Ins for override functions
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.top_fragment, container, false);

        txt1 = (EditText) view.findViewById(R.id.textTop);
        txt2 = (EditText) view.findViewById(R.id.textBottom);
        final Button button = (Button) view.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClicked(v);
            }
        });


        return view;
    }

    public void buttonClicked(View view){
        mCallback.createMeme(txt1.getText().toString(), txt2.getText().toString());
    }

}
