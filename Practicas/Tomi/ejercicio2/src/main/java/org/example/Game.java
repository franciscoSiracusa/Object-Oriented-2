package org.example;

import java.util.Scanner;

public class Game {

    public static String play(Option option1, Option option2) {
        return option1.fight(option2).toString();
    }
}
