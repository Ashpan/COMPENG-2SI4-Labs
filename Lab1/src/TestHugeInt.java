public class TestHugeInt {
    public static void main(String[] args) {
//        System.out.println("Regular string input 1234");
//        System.out.println(new HugeInteger("1234").getString());
//        System.out.println("-----------------");
//        System.out.println("Negative string input -1234");
//        System.out.println(new HugeInteger("-1234").getString());
//        System.out.println("-----------------");
//        System.out.println("Very large string input 1543785734895347897589324732895324895234");
//        System.out.println(new HugeInteger("1543785734895347897589324732895324895234").getString());
//        System.out.println("-----------------");
//
//        System.out.println("Invalid string input 12&34");
//        try{
//            System.out.println(new HugeInteger("12&34").getString());
//        }catch (Exception IllegalArgumentException){
//            System.out.println("Error Thrown");
//        }
//        System.out.println("-----------------");
//        System.out.println("Empty string input \"\" ");
//        try {
//            System.out.println(new HugeInteger("").getString());
//        }catch (Exception e){
//            System.out.println("Error thrown");
//        }
//        System.out.println("-----------------");
//        System.out.println("Zeros string input 0000");
//        System.out.println(new HugeInteger("0000").getString());
//        System.out.println("-----------------");
//        System.out.println("Leading zeros string input 000543853");
//        System.out.println(new HugeInteger("000543853").getString());
//        System.out.println("-----------------");
//
//        System.out.println("Regular int input 10");
//        System.out.println(new HugeInteger(10).getString());
//        System.out.println("-----------------");
//        System.out.println("Less than 1 int input 0");
//        try {
//            System.out.println(new HugeInteger(0).getString());
//        }catch(Exception IllegalArgumentException){
//            System.out.println("Error Thrown");
//        }
//        System.out.println("-----------------");
//        System.out.println("Very large int input 60");
//        System.out.println(new HugeInteger(60).getString());
//        System.out.println("-----------------");
//
//        System.out.println("-----------------");
//        System.out.println("Add 5+9");
        HugeInteger first = new HugeInteger("5");
        HugeInteger second = new HugeInteger("9");
//        System.out.println(first.add(second).getString());
//        System.out.println("-----------------");
//
//        System.out.println("Add 578345734895+54795398534");
//        first = new HugeInteger("578345734895");
//        second = new HugeInteger("5947905398534");
//        System.out.println(first.add(second).getString());
//        System.out.println("-----------------");
//
//
//        System.out.println(first.compareTo(second));
        first = new HugeInteger("-24");
        second = new HugeInteger("-368");
        System.out.println(first.multiply(second).toString());
    }




}
