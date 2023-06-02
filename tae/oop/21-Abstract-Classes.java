// Data abstraction provides the outside world with only essential information, in a process of representing essential features without including implementation details.
// A good real-world example is a book. When you hear the term book, you don't know the exact specifics, such as the page count, the color, or the size, but you understand the idea, or abstraction, of a book.
// The concept of abstraction is that we focus on essential qualities, rather than the specific characteristics of one particular example.
// In Java, abstraction is achieved using abstract classes and interfaces.
// An abstract class is defined using the abstract keyword.
// If a class is declared abstract it cannot be instantiated (you cannot create objects of that type).
// To use an abstract class, you have to inherit it from another class.
// Any class that contains an abstract method should be defined as abstract.
// An abstract method is a method that is declared without an implementation (without braces, and followed by a semicolon)
// This is used when there is no meaningful definition for the method in the superclass.

// A board game company creates new board games every year. While all the games have different rules, they also are all similar in that they each have a name and a play() method.
// We need to create 3 different games - Monopoly, Chess and Battleships. In the play() method Monopoly should print “Buy all property.”, Battleships - “Sink all ships.”, and Chess - “Kill the enemy king.”
// Complete the code by implementing the getName() and play() methods inherited from abstract Game class.

class Main {
    public static void main(String[] args) {
        Monopoly monopoly = new Monopoly();
        Chess chess = new Chess();
        Battleships battleships = new Battleships();
        monopoly.play();
        chess.play();
        battleships.play();
    }
}

abstract class Game {
    abstract String getName();
    abstract void play();
}

class Monopoly extends Game {
    String getName() {
        return "Monopoly";
    }
    void play() {
        System.out.println("Buy all property.");
    }
}

class Chess extends Game {
    String getName() {
        return "Chess";
    }
    void play() {
        System.out.println("Kill the enemy king.");
    }
}

class Battleships extends Game {
    String getName() {
        return "Battleships";
    }
    void play() {
        System.out.println("Sink all ships.");
    }
}