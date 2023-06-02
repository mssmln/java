import java.util.Arrays; // needed to use Arrays.toString()

class CaesarsCipher {
    private String rot13(String str) {
        final String alp = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLM"; // final is like const in js
        String r = "";
        final String[] arr = str.split("");
        // System.out.println(Arrays.toString(arr));   

        for (final String lett : arr) { // js' forEach equivalent
            if (alp.indexOf(lett) != -1) {
                final int ind = alp.indexOf(lett) + 13; 
                r += alp.charAt(ind);
            }
            else {
                r += lett;
            }
        } 
        return r;
    }

    public static void main(String[] args) {
        CaesarsCipher obj = new CaesarsCipher(); // need it because rot13 is a non-static method
        System.out.print(obj.rot13("GUR DHVPX OEBJA SBK WHZCF BIRE GUR YNML QBT."));
    }
}