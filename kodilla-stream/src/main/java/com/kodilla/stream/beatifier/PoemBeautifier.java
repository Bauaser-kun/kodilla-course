package com.kodilla.stream.beatifier;

public class PoemBeautifier {
public static void beautify(String text, PoemDecorator poemDecorator){
String result = poemDecorator.decorate(text);
    System.out.println(result);
}
}
