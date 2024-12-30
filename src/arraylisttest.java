import java.util.ArrayList;

public class arraylisttest {
    public static void main(String[] args) {
       ArrayList<String> food = new ArrayList<String>();
        ArrayList<String> freezer = new ArrayList<String>();
       food.add("hotdog");
       food.add("burger");
       food.add("pizza");


       for(String s:food){
           System.out.println(food);

       }

    }
}
