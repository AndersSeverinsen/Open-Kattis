import java.util.ArrayList;
import java.util.Scanner;

public class HeroesOfVelmar {
    static Scanner sc = new Scanner(System.in);
    private static ArrayList<Integer> p1 = new ArrayList<>();
    private static ArrayList<Integer> p2 = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i<3;i++) {
            int n = Integer.parseInt(sc.next());
            ArrayList<String> cards = new ArrayList<>();
            for (int j = 0; j<n;j++) {
                cards.add(sc.next());
            }
            int tmp = 0;
            for (String str : cards) {
                tmp += getStrength(str, cards, i);
            }
            p1.add(tmp);
            n = Integer.parseInt(sc.next());
            cards = new ArrayList<>();
            for (int j = 0; j<n;j++) {
                cards.add(sc.next());
            }
            tmp = 0;
            for (String str : cards) {
                tmp += getStrength(str, cards, i);
            }
            p2.add(tmp);
        }
        int p1wins = 0;
        int p2wins = 0;
        for (int i=0;i<3;i++) {
            if (p1.get(i)<p2.get(i)) {
                p2wins++;
            } else if (p1.get(i)>p2.get(i)) {
                p1wins++;
            }
        }
        if (p1wins==p2wins) {
            int p1sum = 0;
            for (Integer i : p1) {
                p1sum +=i;
            }
            int p2sum = 0;
            for (Integer i : p2) {
                p2sum +=i;
            }
            if (p1sum==p2sum) {
                System.out.println("Tie");
            } else if (p1sum>p2sum) {
                System.out.println("Player 1");
            } else {
                System.out.println("Player 2");
            }
        } else if (p1wins>p2wins) {
            System.out.println("Player 1");
        } else {
            System.out.println("Player 2");
        }
    }

    private static int getStrength(String str, ArrayList<String> cards, int location) {
        str = str.toUpperCase();
        if (str.equals("SHADOW")) {
            return 6;
        } else if (str.equals("GALE")) {
            return 5;
        } else if (str.equals("RANGER")) {
            return 4;
        } else if (str.equals("ANVIL")) {
            return 7;
        } else if (str.equals("VEXIA")) {
            return 3;
        } else if (str.equals("GUARDIAN")) {
            return 8;
        } else if (str.equals("THUNDERHEART")) {
            if (cards.size()==4) { return 12; } else { return 6; }
        } else if (str.equals("FROSTWHISPER")) {
            return 2;
        } else if (str.equals("VOIDCLAW")) {
            return 3;
        } else if (str.equals("IRONWOOD")) {
            return 3;
        } else if (str.equals("ZENITH")) {
            if (location == 1) { return 9; } else { return 4; }
        } else if (str.equals("SERAPHINA")) {
            return cards.size();
        }
        throw new IllegalArgumentException();
    }

}
