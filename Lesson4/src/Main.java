import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        System.out.println(names);
        names.add("Azamat");
        names.add("Beka");
        names.add("Rustam");

        System.out.println(names);
        names.add(2, "Ruslan");
        System.out.println(names);
        names.set(1, "Tilek");
        System.out.println(names);
        names.add("Ruslan");
        System.out.println(names);
        names.remove("Tilek");
        names.remove(3);
        System.out.println(names);

        if (names.contains("Ruslan")){
            System.out.println("Yes. index for Ruslan " + names.indexOf("Ruslan"));
            Integer indexForRuslan = names.indexOf("Ruslan");
            System.out.println("Yes. " + names.get(indexForRuslan));
//            System.out.println(names.get(4));
        }else {
            System.out.println("No.");
        }

//        names.clear();
        if (names.isEmpty()){
            System.out.println("Yes list is empty. List size " + names.size());
        }else {
            System.out.println("No list is not empty. List size " + names.size());
        }

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Anya");
        names2.add("Magripa");

        System.out.println("1) List " + names);
        System.out.println("2) List " + names2);

        names.addAll(names2);
        System.out.println("--------------");
        System.out.println("1) List " + names);
        System.out.println("2) List " + names2);

        names.removeAll(names2);
//        names.retainAll(names2);
        System.out.println("--------------");
        System.out.println("1) List " + names);
        System.out.println("2) List " + names2);

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + i);
        }
        System.out.println("--------------");
        for (String name: names2) {
            System.out.println(name);
        }

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(235235);
        numbers.add(0);
        numbers.add(-235235);
        numbers.add(23);
        System.out.println(numbers);

        ArrayList<User> users = new ArrayList<>();

        User user1 = new User("John", 23);
        User user2 = new User("Alex", 45);
        User user3 = new User("Leo", 18);

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(new User("Cris", 100));
        System.out.println(users);

        names.add("Alex");
        System.out.println("Before sort");
        System.out.println(names);

        Collections.sort(names);
        System.out.println("After sort");
        System.out.println(names);

        System.out.println("Before sort");
        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println("От меньшего к большему");
        System.out.println(numbers);

        System.out.println("От большего к меньшему");
        Collections.reverse(numbers);
        System.out.println(numbers);

        names.add(3,"Нурбек");
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);
        Collections.reverse(names);
        System.out.println(names);

        System.out.println(users);
        users.sort(Comparator.comparing(User::getAge));
        System.out.println(users);
        System.out.println("-----------");

        //extension
        names.forEach(name -> {
            System.out.println(name);
        });

        System.out.println(numbers);
        Collections.shuffle(numbers);
        System.out.println(numbers);

        System.out.println(users);
        Collections.shuffle(users);
        System.out.println(users);
    }
}