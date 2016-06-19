package com.example;

import java.util.ArrayList;

public class Jokes {
    private ArrayList<String> jokes;

    public Jokes() {
        jokes = new ArrayList<>();
        jokes.add("When I lost my rifle, the Army charged me $85. That’s why in the Navy, the captain goes down with the ship.");
        jokes.add("My colleague has been living in this country only a few months, and although normally chipper, he recently looked sad. When I asked what was wrong, he responded glumly, “Today, everything wrong is going in my favor.”");
        jokes.add("A conference call is the best way for a dozen people to say “bye” 300 times.");
        jokes.add("If growing up in the ’80s taught me one thing, it’s that my friends and I should have found a treasure map by now.");
        jokes.add("Watch The Walking Dead with someone who’s super into it so every time a zombie appears, you can pull the old, “Wait, who’s this, now?”");
    }

    public String getJokes(int i) {
        return jokes.get(i);
    }

    public String getRandomJoke() {
        int rand = (int) (Math.random() * jokes.size());
        return getJokes(rand);
    }
}
