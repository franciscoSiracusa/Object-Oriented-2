package org.example;

public abstract class Option {

    public abstract OptionType getType();

    public abstract Result fight(Option option);
}
