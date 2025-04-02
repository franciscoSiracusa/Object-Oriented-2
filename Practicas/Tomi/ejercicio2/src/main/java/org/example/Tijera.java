package org.example;

public class Tijera extends Option {

    public Result fight(Option option) {
        return option.fightTijera(this);
    }

    @Override
    public Result fightPiedra(Option option) {
        return Result.WIN;
    }

    @Override
    public Result fightTijera(Option option) {
        return Result.DRAW;
    }

    @Override
    public Result fightPapel(Option option) {
        return Result.LOOSE;
    }
}
