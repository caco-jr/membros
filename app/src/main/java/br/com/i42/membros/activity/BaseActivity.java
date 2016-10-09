package br.com.i42.membros.activity;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import br.com.i42.membros.R;

/**
 * Created by shapolink on 09/10/16.
 */

public class BaseActivity extends AppCompatActivity {
    // Configura a Toolbar
    protected void setUpToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
        }
    }
}
