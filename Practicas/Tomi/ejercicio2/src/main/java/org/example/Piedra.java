package org.example;

public class Piedra extends Option {

    public OptionType getType() {
        return OptionType.PIEDRA;
    }

    public Result fight(Option option) {
        switch (option.getType()) {
            case PIEDRA -> {
                return Result.DRAW;
            }
            case PAPEL -> {
                return Result.LOOSE;
            }
            case TIJERA -> {
                return Result.WIN;
            }
            default -> throw new IllegalStateException("Opción desconocida: " + option.getType());
        }
    }
}
