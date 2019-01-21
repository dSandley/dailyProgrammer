package Easy.Challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Perfectly_Balanced {
    public static void main(String[] args) {
        Map<String, Integer> book = new HashMap<String, Integer>();
        ArrayList<Integer> checker = new ArrayList<Integer>();
        String input = "abccbaabccba";
        String[] balancer = input.split("");
        boolean finalizer = true;

        for (int i = 0; i < balancer.length; i++) {
            if (book.containsKey(balancer[i]) != true) {
                book.put(balancer[i], 0);
            }

            if (book.containsKey(balancer[i]) == true) {
                int temp = book.get(balancer[i]);
                temp++;
                book.replace(balancer[i], temp);
            }
        }

        for (String name : book.keySet()) {
            System.out.println(name + ":" + book.get(name));
            checker.add(book.get(name));
        }

        for (int i = 0; i < checker.size() - 1; i++) {
            if (checker.get(i) != checker.get(i + 1)) {
                finalizer = false;
            }
        }

        if (finalizer) {
            System.out.println("Perfectly Balanaced");
        } else {
            System.out.println("Not Balanaced");
        }

    }
}
