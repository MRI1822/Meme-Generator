package com.example.memegenerator;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;

public class MainActivity extends AppCompatActivity implements TopSectionFragment.TopSectionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Called in the Top fragment when the user clicks button
    @Override
    public void createMeme(String top, String bottom) {
        hideSoftKeyboard();
        System.out.print("Inside Main Activity after top fragment click");
        BottomSectionFragment bottomSectionFragment = (BottomSectionFragment)getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bottomSectionFragment.setMeme(top, bottom);

    }

    private void hideSoftKeyboard() {
        InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
    }

}
