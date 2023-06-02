// An Enum is a special type used to define collections of constants.
// Basically, Enums define variables that represent members of a fixed set.
// You should always use Enums when a variable (especially a method parameter) can only take one out of a small set of possible values.
// If you use Enums instead of integers (or String codes), you increase compile-time checking and avoid errors from passing in invalid constants, and you document which values are legal to use.

class Main {
    public static void main(String[] args) {
        Player player1 = new Player(Difficulty.EASY);
        Player player2 = new Player(Difficulty.MEDIUM);
        Player player3 = new Player(Difficulty.HARD);
    }
}

enum Difficulty {
    EASY,
    MEDIUM,
    HARD
}

class Player {
    Player(Difficulty diff) {
        switch (diff) {
            case EASY:
                System.out.println("You have 3000 bullets");
                break;
            case MEDIUM:
                System.out.println("You have 2000 bullets");
                break;
            default:
                System.out.println("You have 1000 bullets");
        }
    }
}