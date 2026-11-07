package day2;

public class DataTypes {
    public static void main(String[] args){
        int intValue = 1;
        short shortVale = 1;
        double doubleValue = 1.1;
        float floatValue = 1.223f;
        long longValue = 1233333L;
        char charValue = 'A';
        byte byteValue = 123;
        boolean booleanValue = false;
        String stringValue = "Hello Egor вывел для себ просто посмотреть";
//1
        System.out.println(intValue);
        System.out.println(shortVale);
        System.out.println(doubleValue);
        System.out.println(floatValue);
        System.out.println(longValue);
        System.out.println(charValue);
        System.out.println(byteValue);
        System.out.println(booleanValue);
        System.out.println(stringValue);
//2
        byte minVb = Byte.MIN_VALUE;
        byte maxVb = Byte.MAX_VALUE;
        System.out.println(minVb + "\n" + maxVb);
        long minVl = Long.MIN_VALUE;
        long maxVl = Long.MAX_VALUE;
        System.out.println(minVl + "\n" + maxVl);
        short minVs = Short.MIN_VALUE;
        short maxVs = Short.MAX_VALUE;
        System.out.println(minVs + "\n" + maxVs);
        int minVi = Integer.MIN_VALUE;
        int maxVi = Integer.MAX_VALUE;
        System.out.println(minVi + "\n" + maxVi);
//3
        int one = 1;
        byte oneByte = (byte)one;
        System.out.println((byte)(maxVb + oneByte));
//4
        double m = 0.1 + 0.2 + 0.3;
        System.out.println("сумма всех чисел = " + m);
        if  (m == 0.6){
            System.out.println("m == 0.6");
        }
        else{
            System.out.println("m != 0.6");
        }
    }
}
