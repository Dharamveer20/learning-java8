package com.learnjava8.optional;

import java.util.Optional;

public class IsPresentIfPresent {
    public static void main(String[] args) {
        Optional<String> naam = Optional.ofNullable("Babban");

        if(naam.isPresent()) System.out.println(naam.get()); // isPresent returns boolean value

        naam.ifPresent((String) -> System.out.println(naam.get())); // agar optional present h to ye le consumer interface.

    }
}
