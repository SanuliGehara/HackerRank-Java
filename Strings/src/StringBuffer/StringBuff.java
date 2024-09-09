package StringBuffer;

public class StringBuff {
    public static void stringBuff() {
        // Create a empty String Buffer  -> initial capacity of 16
        StringBuffer sb1 = new StringBuffer();

        // Creates empty string buffer with capacity 10
        StringBuffer sb2 = new StringBuffer(10);
        sb2.append("Second string Buffer 2");
        System.out.println("\n" + sb2);
        sb2.deleteCharAt(sb2.length() - 1); // Remove last character (2)
        System.out.println(sb2);

        // String buffer with given string literal
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" world!");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());
    }

}
