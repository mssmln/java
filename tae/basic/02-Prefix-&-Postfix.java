class PrefixAndPostfix {
    public static void main(String[] args) {
        int x = 34;
        int y = ++x;
        // The value of x is first incremented to 35, and is then assigned to y, so the values of both x and y are now 35.
        System.out.println(y);

        int w = 34;
        int z = w++;
        // w is first assigned to z, and is then incremented by one. Therefore, w becomes 35, while z is assigned the value of 34.
        System.out.println(z);
    }
}