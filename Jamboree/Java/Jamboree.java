import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Jamboree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numusefullitems = Integer.parseInt(sc.next());
        int numscouts = Integer.parseInt(sc.next());
        ArrayList<Integer> items = new ArrayList<Integer>();
        for (int i = 0; i<numusefullitems; i++) {
            items.add(Integer.parseInt(sc.next()));
        }
        Collections.sort(items);
        Collections.reverse(items);
        if (numusefullitems <= numscouts) {
            System.out.println(items.get(0));
            return;
        }
        ArrayList<Integer> largerHalf = new ArrayList<>();
        for (int i = 0; i<numscouts;i++) {
            largerHalf.add(items.get(i));
        }
        ArrayList<Integer> lowerHalf = new ArrayList<>();
        for (int i = numscouts; i<numusefullitems;i++) {
            lowerHalf.add(items.get(i));
        }
        //Collections.reverse(lowerHalf);
        Collections.reverse(largerHalf);
        //System.out.println(lowerHalf);
        //System.out.println(largerHalf);
        for (int i=0;i<lowerHalf.size();i++) {
            Integer temp = largerHalf.remove(0);
            temp+=lowerHalf.get(i);
            largerHalf.add(temp);
        }
        System.out.println(largerHalf.stream().mapToInt(i -> i).max().orElse(0));
    }
}
