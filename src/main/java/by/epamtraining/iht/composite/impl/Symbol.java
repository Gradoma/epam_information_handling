package by.epamtraining.iht.composite.impl;

import by.epamtraining.iht.composite.Component;
import by.epamtraining.iht.exception.UnhandledOperationException;

public class Symbol implements Component{
    private char symbol;

    public Symbol(char symbol){
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public void add(Component component) throws UnhandledOperationException{
        throw new UnhandledOperationException("can't execute for this object");
    }

    @Override
    public String toString() {
        return Character.toString(symbol);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null){
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        Symbol symbol1 = (Symbol) o;

        return symbol == symbol1.symbol;
    }

    @Override
    public int hashCode() {
        return (int) symbol;
    }
}
