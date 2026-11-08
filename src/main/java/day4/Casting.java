package day4;

public class Casting{
    public static void main(String[] args){
        //1
        int average1 = (7+8+8)/3;
        System.out.println(average1 + " - Неправильный вывод");
        double average2 = (7+8+8)/3.;
        System.out.println(average2 + " - Правильный вывод");
        //2
        double price = 19.99;
        int priceInt = (int) price;
        long round2 = Math.round(price);
        System.out.println(priceInt + " Первое округление");//первое округлит до 19 потому что отбрасывается все что было после .
        System.out.println(round2 + " Второе округление");//втрое скруглит до 20 потому что переменная не преобразована и будет скруглять к блиайшем целому числу
        //3
        String argument1 = args[0];
        int argumentInt1 = Integer.parseInt(argument1);
//        String argument2 = args[1];
//        int argumentInt2 = Integer.parseInt(argument2);
        System.out.println(argumentInt1 *2+ " с аргументом1 строки выражение 21");
//        System.out.println(argumentInt2 *2+ " с аргументом2 строки выражение abc");
        //Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
        //	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        //	at java.base/java.lang.Integer.parseInt(Integer.java:662)
        //	at java.base/java.lang.Integer.parseInt(Integer.java:778)
        //	at day4.Casting.main(Casting.java:19)


        //4
        byte level = 120;
        int byteInt = (int)level;
        level+=10;
        System.out.println(level);
        //объясняю: 120+10=130 что уже переполнение, максимально количество которое хранит byte = 256 соответственно 130 - 256 = -126 наш результат

    }
}
