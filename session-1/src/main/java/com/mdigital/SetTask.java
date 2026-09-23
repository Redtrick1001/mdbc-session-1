package com.mdigital;

import java.util.HashSet;

public class SetTask {
    static void main() {

        HashSet<String> movies = new HashSet<>();
        movies.add("wall-e");
        movies.add("cars");
        movies.add("cars 2");
        movies.add("Batman");
        movies.add("cars");

        IO.println(movies);
        IO.println(movies.contains("cars"));
        IO.println(movies.contains("movies"));
    }
}
