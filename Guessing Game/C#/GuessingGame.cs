using System;
using System.Collections.Generic;

namespace GuessingGame
{
    class Program
    {
        static void Main(string[] args)
        {
            int high = 10;
            int low = 1;
            bool dishonest = false;
            while (true) {
                string? guess = Console.ReadLine();
                int guessInt = Convert.ToInt32(guess);
                if (guessInt == 0) { break; }
                string? answer = Console.ReadLine();
                if (answer == "right on") {
                    if (dishonest || guessInt <= low || guessInt >= high) {
                        Console.WriteLine("Stan is dishonest");
                    } else {
                        Console.WriteLine("Stan may be honest");
                    }
                    high = 11;
                    low = 0;
                    dishonest = false;
                } else if (answer == "too high") {
                    if (guessInt <= low) {
                        dishonest = true;
                    } else {
                        high = Math.Min(high, guessInt);
                    }
                } else if (answer == "too low") {
                    if (guessInt >= high) {
                        dishonest = true;
                    } else {
                        low = Math.Max(low, guessInt);
                    }
                }
            }
        }
    }
}