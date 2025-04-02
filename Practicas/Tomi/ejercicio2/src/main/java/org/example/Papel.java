package org.example;

public class Papel extends Option {

    public Result fight(Option option) {
        return option.fightPapel(this);
    }

    @Override
    public Result fightPiedra(Option option) {
        return Result.LOOSE;
    }

    @Override
    public Result fightTijera(Option option) {
        return Result.WIN;
    }

    @Override
    public Result fightPapel(Option option) {
        return Result.DRAW;
    }

}
