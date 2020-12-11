import java.util.ArrayList;

/**
 * ArrayDictionaryDriver.java
 * Jack Hughes
 * This is a driver for my new ArrayDictionary class. It will test all methods and
 * functionality along with all edge cases I can think of. Pretty straightforward.
 * Take notes on being straightforward, google. You know what I'm talking about,
 * señor variables in Chrome.Storage keys...
 * Date: 12-9-20
 * On My Honor: JH
 */
public class ArrayDictionaryDriver {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Bob");
        names.add("Janet");
        names.add("Davie 504");
        names.add("The illuminati");
        ArrayList<Integer> tallness = new ArrayList<Integer>(); //Some arbitrary unknown unit of measurement
        tallness.add(5);
        tallness.add(11);
        tallness.add(69); //Epico
        tallness.add(1); //Short boi
        ArrayDictionary<String, Integer> ages = new ArrayDictionary<String, Integer>();
        ArrayDictionary<String, Integer> heights = new ArrayDictionary<String, Integer>(names, tallness);
        for(int i = 0; i < 4; i++){
            ages.put(names.get(i),i * i); //Much age
        }
        System.out.print("Should say 0: ");
        System.out.println(ages.get("Bob"));
        System.out.print("Should say 5: ");
        System.out.println(heights.get("Bob"));
        System.out.print("Should say 4: ");
        System.out.println(ages.get("Davie 504"));
        System.out.print("Should say \"69 (epico)\": ");
        System.out.println(heights.get("Davie 504") + " (epico)");
        //Constructors tested. Put tested. Get tested.
        System.out.print("Should say 11: ");
        System.out.println(heights.remove("Janet"));
        System.out.print("Should say null: ");
        System.out.println(heights.remove("Janet"));
        //Remove tested.
        System.out.print("Should say false: ");
        System.out.println(ages.contains("Your mom")); //FLAMES OOOOHHH DAYYYYUUMMMMNNNN
        System.out.print("Should say true: ");
        System.out.println((ages.contains("The illuminati")));
        //Contains tested
        System.out.print("Should say false: ");
        System.out.println(ages.isEmpty());
        //IsEmpty tested
        System.out.println("Use your brain to debug the following. First set should have Janet and 1, second one should omit Janet and have only 3 values.");
        System.out.println(ages.getKeys().toString());
        System.out.println(ages.getValues().toString());
        System.out.println(heights.getKeys().toString());
        System.out.println(heights.getValues().toString());
        //Use logic to see if the above are all good to go
        System.out.println("\n\nIf all of the above were not contradictory, the class is good to go. \n\nP.S. Hughes got this right first try no errors bc he is unstoppable!!!!!!!");
    }
}
