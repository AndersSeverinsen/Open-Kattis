using System;

namespace SimonSays
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {
                int n = Convert.ToInt32(Console.ReadLine());
                string[] outputlist = new string[n];
                for (int i = 0; i < n; i++) {
                    string inp1 = Console.ReadLine();
                    if (inp1.Length < 11) { continue; }
                    if (inp1.Substring(0, 11) != "Simon says ") { continue; }
                    string output = inp1.Substring(11);
                    outputlist[i] = output;
                }
                for (int i = 0; i < n; i++) {
                    if (outputlist[i] == null) { continue; }
                    Console.WriteLine(outputlist[i]);
                }
            }
            catch (Exception e)
            {
                switch(e)
                {
                    case System.IndexOutOfRangeException:
                        Console.WriteLine("Wrong input format!");
                        break;
                    default:
                        Console.WriteLine("Something went wrong!");
                        break;
                }
            }
        }
    }
}