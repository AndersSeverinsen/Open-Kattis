using System;

namespace DieHard
{
    class Program
    {
        static void Main(string[] args)
        {
            List<List<int>> dice = new List<List<int>>();
            for (int i = 0; i < 3; i++) {
                string? inp1 = Console.ReadLine();
                string[]? row = inp1?.Split(' ');
                List<int> die = new List<int>();
                for (int j = 0; j < 6; j++) {
                    int n = Convert.ToInt32(row?[j]);
                    die.Add(n);
                }
                dice.Add(die);
            }
            for (int d1 = 0; d1 < 3; d1++) {
                int wins = 0;
                for (int d2 = 0; d2 < 3; d2++) {
                    if (d1 == d2) {
                        continue;
                    }
                    int localwins = 0;
                    int total = 0;
                    for (int s1 = 0; s1 < 6; s1++) {
                        for (int s2 = 0; s2 < 6; s2++) {
                            if (dice[d1][s1] == dice[d2][s2]) {
                                continue;
                            } else if (dice[d1][s1] > dice[d2][s2]) {
                                localwins++;
                            }
                            total++;
                        }
                    }
                    if (total == 0) {
                        continue;
                    }
                    if (localwins >= total / 2.0) {
                        wins++;
                    }
                }
                if (wins >= 2) {
                    Console.WriteLine(d1 + 1);
                    return;
                }
            }
            Console.WriteLine("No dice");
        }
    }
}