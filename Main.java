import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<String> myHashSet = nameCars();
        String element = "Mazerati";
        removeDuplicateElements(myHashSet, element);

        myHashSet.clear();

        System.out.println("HashSet after clearing: " + myHashSet);

    }

    public static HashSet<String> nameCars() {
        HashSet<String> luxuryCars = new HashSet<>();
        luxuryCars.add("Ferrari");
        luxuryCars.add("Porsche");
        luxuryCars.add("Lamborghini");
        luxuryCars.add("Mazerati");
        System.out.println("The original hashSet \n" + luxuryCars);
        return luxuryCars;
    }

    public static void removeDuplicateElements(HashSet<String> luxuryCars, String elementToRemove) {
        Iterator<String> iterator = luxuryCars.iterator();

        while (iterator.hasNext()) {
            String carIterated = iterator.next();

            if (carIterated.equals(elementToRemove)) {
                iterator.remove();
                System.out.println("Element removed: " + elementToRemove);
            }
        }
        System.out.println("The list after the removal " + luxuryCars);
    }
}
