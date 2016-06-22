package com.udacity.gradle.builditbigger;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        root.findViewById(R.id.tell_joke).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tellJoke();
            }
        });
        return root;
    }

    public void tellJoke() {
        /*Jokes jokes = new Jokes();
        String joke = jokes.getRandomJoke();
        Intent intent = new Intent(this, JokeActivity.class);
        intent.putExtra(Intent.EXTRA_TEXT, joke);
        startActivity(intent);*/
        ProgressDialog progress = new ProgressDialog(getActivity());
        progress.setCancelable(false);
        progress.show();
        new EndpointsAsyncTask().execute(new Pair<Context, ProgressDialog>(getContext(), progress));
    }
}
