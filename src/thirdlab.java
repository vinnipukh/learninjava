public class thirdlab {
    public static void main(String[] args) {
        int isthisaninteger =(262196*28813)/101; // işlem sırasında 2^31-1 değerini aşıyor
        System.out.println(isthisaninteger);

         System.out.println(262196*28813/101); // işlem sırasında 2^31-1 değerini aşıyor
         System.out.println(262196/101*28813); // işlem sırasında 2^31-1 değerini aşmıyor
         System.out.println(28813/101*262196); // işlem sırasında 2^31-1 değerini aşmıyor


        System.out.println('ğ' + 0);    // 2 bytes
        System.out.println('Ğ' + 0);
        System.out.println('ü' + 0);
        System.out.println('Ü' + 0);
        System.out.println('ş' + 0); // largest code point 351
        System.out.println('Ş' + 0);
        System.out.println('ı' + 0);
        System.out.println('İ' + 0);
        System.out.println('ö' + 0);
        System.out.println('Ö' + 0);
        System.out.println('ç' + 0);
        System.out.println('Ç' + 0);
        //   (a) How many bytes would they be encoded in using UTF-8? all of them are 2 bytes
        //   (b) Which one has the largest code point? 'ş'
        //   (c) Consider pairs of lower-uppercase characters. Which ones answer: the ones that are neighbors are the ones that are are not in the extended ASCII table
        //       are neighbors? Which ones are not?  ğ, Ğ, ş, Ş, ı, İ,
        //   (d) Which ones have codes less than 256? Why do you think? the ones in extended ASCII table


    }
}
