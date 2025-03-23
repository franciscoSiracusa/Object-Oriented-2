package org.example;

public class Papel extends Option {

    public OptionType getType() {
        return OptionType.PAPEL;
    }

    public Result fight(Option option) {
        switch (option.getType()) {
            case PIEDRA -> {
                return Result.WIN;
            }
            case PAPEL -> {
                return Result.DRAW;
            }
            case TIJERA -> {
                return Result.LOOSE;
            }
            default -> throw new IllegalStateException("Opción desconocida: " + option.getType());
        }
    }
}
