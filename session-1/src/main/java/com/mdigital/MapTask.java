package com.mdigital;

import java.util.Arrays;
import java.util.HashMap;

public class MapTask {
    static void main() {
        HashMap<String, String[]> movies = new HashMap<>();

        movies.put("wall-e", new String[]{"2010", "Steven Spielberg"});
        movies.put("cars", new String[]{"2008", "Martin Scorsese"});
        movies.put("cars 2", new String[]{"2015", "Ridley Scott"});
        movies.put("Batman", new String[]{"1991", "John Woo"});
        movies.put("cars", new String[]{"1999", "Christopher Nolan"});

        String[] output = movies.get("cars");
        System.out.println(Arrays.toString(output));
        System.out.println(movies.containsKey("Batman"));
    }
}
