package org.example;

public class Piedra extends Option {

    public Result fight(Option option) {
        return option.fightPiedra(this);
    }

    @Override
    public Result fightPiedra(Option option) {
        return Result.DRAW;
    }

    @Override
    public Result fightTijera(Option option) {
        return Result.LOOSE;
    }

    @Override
    public Result fightPapel(Option option) {
        return Result.WIN;
    }
}
