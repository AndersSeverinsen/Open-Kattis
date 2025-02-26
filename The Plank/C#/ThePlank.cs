using System;

namespace ThePlank
{
    class Program
    {
        static void Main(string[] args)
        {
            string? inp1 = Console.ReadLine();
            int n = Convert.ToInt32(inp1);
            int num = makePlank(n, 0, 0);
            Console.WriteLine(num);
        }

        public static int makePlank(int plank_lenght, int len, int num)
        {
            if (len > plank_lenght) { return 0; }
            if (len == plank_lenght) { return 1; }
            num += makePlank(plank_lenght, len + 1, 0);
            num += makePlank(plank_lenght, len + 2, 0);
            num += makePlank(plank_lenght, len + 3, 0);
            return num;
        }
    }
}