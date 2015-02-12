package com.darwin.user.camara;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Camara extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camara);
        //CAMARA
        Button pic=(Button)findViewById(R.id.btcam);
        pic.setOnClickListener(new OnClickListener(){
           @Override
           public void onClick(View v) {
            Intent intencion=new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
               startActivity(intencion);
            }//fin public
        }//fin evento
        );
        //VIDEO
        Button video=(Button)findViewById(R.id.btvideo);
        video.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intencion=new Intent(MediaStore.INTENT_ACTION_VIDEO_CAMERA);
                startActivity(intencion);
            }//fin public
        }//fin evento
        );
    }//FIN PROGRAMA


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_camara, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
