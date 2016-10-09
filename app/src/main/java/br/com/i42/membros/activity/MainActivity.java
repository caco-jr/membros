package br.com.i42.membros.activity;

import android.os.Bundle;

import br.com.i42.membros.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpToolbar();
    }
}
