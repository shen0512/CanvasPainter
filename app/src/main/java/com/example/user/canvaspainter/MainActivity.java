package com.example.user.canvaspainter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    Panel mPanel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //畫布
        mPanel = new Panel(this);
        setContentView(mPanel);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_about:
                mPanel.resetCanvas();
                break;
            case R.id.menu_save:
                mPanel.savePicture();
                break;
            case R.id.menu_quit:
                this.finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}