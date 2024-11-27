public class secondlab {
    public static void main (String[] args) {
        byte num1 = (byte) 0b11111000;
        byte num2 = (byte) 0b00000011;
        byte signedresult = (byte) (num1 + num2);
        int unsignedresult = (num1 & 0xFF) + (num2 & 0xFF);

        System.out.println("signed = "+signedresult);
        System.out.println("unsigned = "+unsignedresult);



    }
}
