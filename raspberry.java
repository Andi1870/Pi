public class raspberry {
    public static void main(String[] args) {
        String hexNumber = "c036";

        // Hexadezimalzahl in Binärzahl umwandeln
        String binaryNumber = numberToBinary(hexNumber);

        // Ergebnis ausgeben
        System.out.println(binaryNumber);
    }
 
    public static String numberToBinary(String hexNumber) {
        String invBin = "";

        // Hexadezimalzahl in Dezimalzahl umwandeln
        int decimalNumber = Integer.parseInt(hexNumber, 16);

        // Dezimalzahl in Binärzahl umwandeln
        String binaryNumber = Integer.toBinaryString(decimalNumber);

        //binärzahl invertieren
        String invert = invertBin(binaryNumber);

        //Binhrzahl in Dezialzahl und +1
        decimalNumber = Integer.parseInt(invert, 2) + 1;

        //invertierte Dezimalzahl wieder in Binärzahl
        invBin = Integer.toBinaryString(decimalNumber);
        return invBin;
    }

    public static String invertBin(String bin){
        StringBuilder invert = new StringBuilder();
        for(int i = 0; i < bin.length(); i++) {
            switch(bin.charAt(i)){
                case '0': invert.append('1'); 
                break;
                case '1': invert.append('0');
                break;
            }
        }
        return invert.toString();
    }   
}