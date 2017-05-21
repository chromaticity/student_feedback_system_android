package sfs.studentfeedbacksystem;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        set up the rest of the buttons for our application
        Button thumbs_down = (Button) findViewById(R.id.thumbs_down);
        thumbs_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Thumbs down has been sent", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                new SendThumbsDown().execute();
            }
        });

//        button for thumbs up
        Button thumbs_up = (Button) findViewById(R.id.thumbs_up);
        thumbs_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Thumbs up has been sent", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                new SendThumbsUp().execute();
            }
        });

//        button for speak slower
        Button ss_button = (Button) findViewById(R.id.speak_slower);
        ss_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Speak Slower has been sent", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                new SendSpeakSlower().execute();
            }
        });

        //        button for speak faster
        Button sf_button = (Button) findViewById(R.id.speak_faster);
        sf_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Speak Faster has been sent", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                new SendSpeakFaster().execute();
            }
        });

        //        button for speak faster
        Button sl_button = (Button) findViewById(R.id.speak_louder);
        sl_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Speak Louder has been sent", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                new SendSpeakLouder().execute();
            }
        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
