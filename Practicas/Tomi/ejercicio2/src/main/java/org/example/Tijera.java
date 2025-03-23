package org.example;

public class Tijera extends Option {

    public OptionType getType() {
        return OptionType.TIJERA;
    }

    public Result fight(Option option) {
        switch (option.getType()) {
            case PIEDRA -> {
                return Result.LOOSE;
            }
            case PAPEL -> {
                return Result.WIN;
            }
            case TIJERA -> {
                return Result.DRAW;
            }
            default -> throw new IllegalStateException("Opción desconocida: " + option.getType());
        }
    }
}
