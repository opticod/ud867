/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.udacity.gradle.builditbigger.backend;

import com.example.Jokes;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "jokesAPI",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditibigger.gradle.udacity.com",
                ownerName = "backend.builditibigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class JokesEndpoint {

    /**
     * A simple endpoint method that returns a random joke
     */
    @ApiMethod(name = "getRandomJoke")
    public Joke getRandomJoke() {
        Jokes jokes = new Jokes();
        Joke response = new Joke();
        response.setData(jokes.getRandomJoke());

        return response;
    }

}