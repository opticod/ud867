package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

/**
 * Created by anupam on 22/6/16.
 */
public class JokeFetchingTest extends AndroidTestCase {

    public void testJokeFetchNull() {
        String joke = new EndpointsAsyncTask().doInBackground();
        assertFalse(joke.isEmpty());
    }
}
