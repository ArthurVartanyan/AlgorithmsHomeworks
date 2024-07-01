package realisation.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
    public static void main(String[] args) {

        Map<String, Integer> nameAge = new HashMap<>();
        nameAge.put("Andrey", 20);
        nameAge.put("Maria", 30);
        nameAge.put("Matvey", 10);

        // [] [] [] [] [{} -> "Andrey", "Matvey"] [] [] [] [] ["Maria"]

        // System.out.println("Maria Age: " + nameAge.get("Maria")); // O(1)
        // System.out.println("Matvey Age: " + nameAge.get("Matvey")); // O(N)


        Person firstPerson = new Person();
        Person secondPerson = new Person();
        Person thirdPerson = new Person();

        firstPerson.setName("Matvey");
        secondPerson.setName("Andrey");
        thirdPerson.setName("Maria");


        Map<Person, Integer> personAge = new HashMap<>();
        personAge.put(firstPerson, 10);
        personAge.put(secondPerson, 20);
        personAge.put(thirdPerson, 30);

        System.out.println("ANDREY AGE " + personAge.get(firstPerson));
        System.out.println("MATVEY AGE " + personAge.get(secondPerson));
        System.out.println("MARIA AGE " + personAge.get(thirdPerson));

        personAge.remove(firstPerson);
        System.out.println(personAge.get(firstPerson));


    }
}
