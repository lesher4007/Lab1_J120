package exercise1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Number number1 = new Number(1812,742323);
        Number number2 = new Number(812,1123237);
        Number number3 = new Number(812,9863257);
        Number number4 = new Number(586,6877844);


        Set<Number> phonebook = new LinkedHashSet<>();

        phonebook.add(new Number(1812,742323));
        phonebook.add(new Number(812,1123237));
        phonebook.add(new Number(812,9863257));
        phonebook.add(new Number(586,6877844));
        phonebook.add(new Number(586,6877844));

        System.out.println(phonebook);

        Map<Number,String> phonebook2 = new HashMap<>();

        phonebook2.put(number1,"Alex");
        phonebook2.put(number2,"Peter");
        phonebook2.put(number3,"Aurora");
        phonebook2.put(number1,"Denis");
        phonebook2.put(number4,"Peter");

        System.out.println(phonebook2);






    }
}
