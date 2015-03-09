package com.example.gravitybluetooth;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;


public class MainActivity extends Activity {
	private View main;
	private Window window;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*Òþ²ØViewÍâµÄÊôÐÔ ±êÌâÀ¸ ×´Ì¬À¸*/
        window = getWindow();
        //Òþ²Ø±êÌâÀ¸
        window.requestFeature(Window.FEATURE_NO_TITLE);
        //Òþ²Ø×´Ì¬À¸
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        /*ÉèÖÃViewÏÔÊ¾µÄ×´Ì¬*/
        main = getLayoutInflater().inflate(R.layout.activity_main, null);
        //Òþ²Øµ¼º½À¸
        main.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        //³£ÁÁ
        main.setKeepScreenOn(true);
        setContentView(main);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
