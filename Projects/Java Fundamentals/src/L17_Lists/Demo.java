package L17_Lists;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("This is a demo part for String List");
        System.out.println("--------------------------------------");
        List<String> names = new ArrayList<>();

        names.add("elena");
        names.add("Maria");
        names.add("Peter");
        names.add("Peter");

        System.out.println(names);

        names.remove("Peter");
        System.out.println(names);

        for (String name : names)
            System.out.println(name);

//------------------------------------------------------------------------
        System.out.println("--------------------------------------");
        System.out.println("This is the part for Integer type List without user input:");

        List<Integer> nums = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90));

        nums.remove(2);
        nums.remove(Integer.valueOf(40));
        nums.add(100);
        nums.add(0, -100);

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i) + " ");
        }

        //----------------------------------
        System.out.println("--------------------------------------");
        System.out.println("The user must input N number for the size of the following Integer list" +
                " and after that input on every new line the number");
        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            list.add(number);
        }
        System.out.println(list);

        //--------------------------------------------------
        System.out.println("--------------------------------------");
        System.out.println("This part is for filling a Integer List with user input on a single line with stream and split by SPACE");
        List<Integer> items = Arrays.stream(scanner.nextLine()
                        .split(" "))
                        .map(Integer::parseInt)
                        .toList();
        System.out.println("Priting the List:");
        System.out.println(items);

        System.out.println("--------------------------------------");
        System.out.println("Collections.sort: (\"Peter\", \"Michael\", \"George\", \"Victor\", \"John\")");
        List<String> names2 = new ArrayList<>(Arrays.asList("Peter", "Michael", "George", "Victor", "John"));

        Collections.sort(names2);
        System.out.println(names2);
        System.out.println("--------------------------------");
        System.out.println("Collections.reverse:");
        Collections.reverse(names2);
        System.out.println(names2);
    }

}
