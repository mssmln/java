// Value types are the basic types, and include byte, short, int, long, float, double, boolean, and char.
// These data types store the values assigned to them in the corresponding memory locations.
// So, when you pass them to a method, you basically operate on the variable's value, rather than on the variable itself.

class ValueTypes {
    public static void main(String[ ] args) {
        int x = 5;
        addOneTo(x);
        System.out.println(x);       
    }
    static void addOneTo(int num) {
        num = num + 1;
    }
}