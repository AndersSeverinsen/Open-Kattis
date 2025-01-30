using System;

namespace MyApplication
{
    class Program
    {
        static void Main(string[] args)
        {
            int ageInt = Convert.ToInt32(Console.ReadLine());
            if (ageInt % 10 == 0) {
                Console.WriteLine("Jebb");
            } else {
                Console.WriteLine("Neibb");
            }
        }
    }
}