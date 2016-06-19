package www.anupam.jokedisplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by anupam on 19/6/16.
 */
public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        String mJoke = getIntent().getStringExtra(Intent.EXTRA_TEXT);

        ((TextView) findViewById(R.id.joke_text)).setText(mJoke);
    }

}