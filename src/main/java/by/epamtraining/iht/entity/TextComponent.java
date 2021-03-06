package by.epamtraining.iht.entity;

import by.epamtraining.iht.exception.UnhandledOperationException;

import java.util.List;

public interface TextComponent {
    void add(TextComponent textComponent) throws UnhandledOperationException;
    String toString();
    List<TextComponent> getChildComponents() throws UnhandledOperationException;
}
