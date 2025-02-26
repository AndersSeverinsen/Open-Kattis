using System;

namespace KarlKoder
{
    class Program
    {
        static void Main(string[] args)
        {
            long jump = 3;
            long res = WriteAndReadBuff(jump);
            while (res != 0) {
                jump = 2 * jump;
                res = WriteAndReadBuff(jump);
                if (res == -1) { return; }
            }
            long min = jump / 2 + 1;
            long max = jump;
            while (true) {
                if (min == max) {
                    Console.WriteLine("strlen(buf) = "+max);
                    return;
                }
                long mid = (long) ((max - min) / 2.0) + min;
                res = WriteAndReadBuff(mid);
                if (res == -1) { return; }
                if (res == 0) {
                    max = mid;
                } else {
                    min = mid+1;
                }
            }
        }

        private static long WriteAndReadBuff(long i) {
            Console.Write("buf[");
            Console.Write(i);
            Console.WriteLine("]");
            string? nextres = Console.ReadLine();
            if (nextres == null) {
                return -1;
            }
            if (nextres.Equals("Segmentation fault (core dumped)") || nextres.Equals("Too many reads")) {
                return -1;
            }
            long res = long.Parse(nextres);
            return res;
        }
    }
}