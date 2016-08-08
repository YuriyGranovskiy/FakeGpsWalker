package com.ygran.fakegpswalker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        boolean handled;

        int id = item.getItemId();
        switch (id) {
            case R.id.action_map:
                onClickMenuMap(item);
                handled = true;
                break;
            case R.id.action_exit:
                onClickMenuExit(item);
                handled = true;
                break;
            default:
                handled = super.onOptionsItemSelected(item);
        }

        return handled;
    }

    public void onClickMenuMap(MenuItem menuItem) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public void onClickMenuExit(MenuItem menuItem) {
        finish();
    }
}
