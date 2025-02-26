import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;

public class HandkasAndMispelchen {

    private static ArrayList<Integer> foos = new ArrayList<>();
    private static ArrayList<ArrayList<Integer>> origiPubs = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> pubs = new ArrayList<ArrayList<Integer>>();

        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i=0; i<k; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            ArrayList<Integer> c = new ArrayList<>();
            c.add(a); c.add(b);
            pubs.add(c);
        }
        origiPubs = (ArrayList<ArrayList<Integer>>) pubs.clone();
        for (int p=0; p<pubs.size();p++) {
            foo(pubs, n, n, 0, p);
        }
        System.out.println(Collections.min(foos));
    }

    private static void foo(ArrayList<ArrayList<Integer>> pubs, int h, int m, int switches, int choice) {
        ArrayList<Integer> pub = pubs.get(choice);
        ArrayList<ArrayList<Integer>> origiPubs2 = (ArrayList<ArrayList<Integer>>) origiPubs.clone();
        origiPubs2.remove(pub);
        h -= pub.get(0);
        if (h<=0) {
            m -= pub.get(1);
            if (m<=0) {
                foos.add(switches);
                return;
            }
            for (int p=0; p<origiPubs2.size();p++) {
                bar(origiPubs2, m, switches+1, choice);
            }
            return;
        }
        ArrayList<ArrayList<Integer>> pubs2 = (ArrayList<ArrayList<Integer>>) pubs.clone();
        pubs2.remove(choice);
        if (m<=0) {
            foos.add(switches);
            return;
        }
        if (pubs2.isEmpty()) {
            foos.add(switches+1);
            return;
        }
        for (int p=0; p<pubs2.size();p++) {
            foo(pubs2, h,m,switches+1, p);
        }
    }

    private static void bar(ArrayList<ArrayList<Integer>> pubs, int m, int switches, int choice) {
        ArrayList<Integer> pub = pubs.get(choice);
        m -= pub.get(1);
        ArrayList<ArrayList<Integer>> pubs2 = (ArrayList<ArrayList<Integer>>) pubs.clone();
        pubs2.remove(choice);
        if (m<=0) {
            foos.add(switches);
            return;
        }
        if (pubs2.isEmpty()) {
            foos.add(switches+1);
            return;
        }
        for (int p=0; p<pubs2.size();p++) {
            bar(pubs2, m,switches+1, p);
        }
    }
}