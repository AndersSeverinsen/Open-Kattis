using System;
using System.Collections.Generic;

namespace ConvertingRomans
{
    class Program
    {
        static void Main(string[] args)
        {
            string? inp1 = Console.ReadLine();
            int n = Convert.ToInt32(inp1);
            for (int i = 0; i < n; i++)
            {
                string? roman = Console.ReadLine();
                if (roman != null) {
                    int[] ints = new int[roman.Length];
                    bool[] bools = new bool[roman.Length];
                    int max = 0;
                    for (int j = 0; j < roman.Length; j++) {
                        char s = roman[j];
                        ints[j] = RomanToDecimal(s);
                        bools[j] = true;
                    }
                    for (int j = ints.Length-1; j >= 0; j--) {
                        int curr = ints[j];
                        if (curr >= max) {
                            max = curr;
                        } else {
                            bools[j] = false;
                        }
                    }
                    Console.WriteLine(MakeSum(ints, bools));
                }
            }
        }

        private static int MakeSum(int[] ints, bool[] bools) {
            int sum = 0;
            for (int i = 0; i < ints.Length; i++) {
                if (bools[i]) {
                    sum += ints[i];
                } else {
                    sum -= ints[i];
                }
            }
            return sum;
        }

        private static int RomanToDecimal(char character)
        {
            switch(character)
            {
                case 'I':
                    return 1;
                case 'V':
                    return 5;
                case 'X':
                    return 10;
                case 'L':
                    return 50;
                case 'C':
                    return 100;
                case 'D':
                    return 500;
                case 'M':
                    return 1000;
                default:
                    Console.WriteLine("Character "+character+" is not a Roman numeral");
                    break;
            }
            return 0;
        }
    }
}