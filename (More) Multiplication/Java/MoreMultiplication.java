import java.util.ArrayList;
import java.util.Scanner;

public class MoreMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Integer num1 = Integer.valueOf(sc.next());
            Integer num2 = Integer.valueOf(sc.next());
            sc.nextLine();
            Integer result = num1*num2;
            if (num1 == 0 && num2 == 0) { return; }
            String num1str = num1.toString();
            char[] num1char = num1str.toCharArray();
            String num2str = num2.toString();
            char[] num2char = num2str.toCharArray();
            System.out.print("+--");
            for (int i = 0; i<num1str.length(); i++) {
                System.out.print("----");
            }
            System.out.print("-+\n|   ");
            int n = num2;
            ArrayList<ArrayList<String>> grid = new ArrayList<>();
            while (n > 0) {
                int m = num1;
                ArrayList<String> row = new ArrayList<>();
                while (m > 0) {
                    Integer res = (n % 10)*(m % 10);
                    if (res == 0) {
                        row.add(0, "0");
                    } else if (res < 10) {
                        row.add(0, "0"+res.toString());
                    } else {
                        row.add(0, res.toString());
                    }

                    m = m / 10;
                }
                grid.add(0,row);
                n = n / 10;
            }
            for (int i = 0; i<num1char.length; i++) {
                System.out.print(num1char[i]);
                System.out.print("   ");
            }
            System.out.print("|\n| +");
            for (int i = 0; i<num1str.length(); i++) {
                System.out.print("---+");
            }
            System.out.println(" |");

            for (int l=0; l<num2str.length(); l++) {
                ArrayList<String> row = grid.get(l);
                ArrayList<char[]> temp = new ArrayList<>();
                for (int i = 0; i<row.size(); i++) {
                    char[] arr = row.get(i).toCharArray();
                    temp.add(arr);
                }
                int digitlen = num1str.length()+num2str.length()-l;
                makeCard(temp, num2char[l], result/Math.pow(10,digitlen-1), result.toString().length()-digitlen>0);
                System.out.print("| +");
                for (int i = 0; i<num1str.length(); i++) {
                    System.out.print("---+");
                }
                System.out.println(" |");
            }
            System.out.print("|");
            for (int i = 0; i<num1str.length(); i++) {
                if (result.toString().length()<=num1str.length()) { System.out.print("  ");
                } else {
                    System.out.print("/ ");
                }
                double temp = result/Math.pow(10,num1str.length()-i-1) % 10;
                int temp_res = (int) temp;
                System.out.print(temp_res);
                System.out.print(" ");
            }
            System.out.println("   |");
            System.out.print("+--");
            for (int i = 0; i<num1str.length(); i++) {
                System.out.print("----");
            }
            System.out.print("-+\n");
        }
    }

    private static void makeCard(ArrayList<char[]> temp, char num, double resd, boolean bool) {
        int res = (int) resd % 10;
        for (int x = 0; x<3; x++) {
            if (x==0) {
                System.out.print("|");
                if (bool) { System.out.print("/"); } else { System.out.print(" "); }
                System.out.print("|");
                for (int y = 0; y<temp.size(); y++) {
                    System.out.print(temp.get(y)[x]);
                    System.out.print(" /|");
                }
                System.out.print(" ");
            } else if (x==1) {
                System.out.print("| |");
                for (int y = 0; y<temp.size(); y++) {
                    System.out.print(" / |");
                }
                System.out.print(num);
            } else {
                System.out.print("|");
                if (res==0) {
                    System.out.print(" ");
                } else {
                    System.out.print(res);
                }
                for (int y = 0; y<temp.size(); y++) {
                    System.out.print("|/ ");
                    System.out.print(temp.get(y)[1]);
                }
                System.out.print("| ");
            }
            System.out.print("|\n");
        }
    }
}
