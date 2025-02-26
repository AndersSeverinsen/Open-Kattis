using System;

namespace GoodMessages
{
    class Program
    {
        static string alpha = "abcdefghijklmnopqrstuvwxyz";
        static string vowels = "aeiouy";
        
        static void Main(string[] args)
        {
            string? inp1 = Console.ReadLine();
            int offset = Convert.ToInt32(inp1);
            string? inputMessage = Console.ReadLine();
            if (inputMessage == null) { throw new ArgumentNullException(nameof(inputMessage), "Input message cannot be null"); }
            char[] message = inputMessage.ToCharArray();
            string? inp2 = Console.ReadLine();
            long appliedTimes = Convert.ToInt32(inp2);

            int good = 0;
            char[] alphabet = alpha.ToCharArray();
            for (int i = 0; i < appliedTimes; i++) {
                for (int x = 0; x < message.Length; x++) {
                    char c = message[x];
                    long index = alpha.IndexOf(c);
                    index = (index + offset) % 26;
                    message[x] = alphabet[(int) index];
                }
                int numOfVowels = NumOfVowels(message);
                if (numOfVowels < ((message.Length-numOfVowels) / 2.0)) {
                    good++;
                }
            }
            if (good > (appliedTimes - good)) {
                Console.WriteLine("Boris");
            } else {
                Console.WriteLine("Colleague");
            }
        }

        private static int NumOfVowels(char[] message) {
            int count = 0;
            foreach (char c in message) {
                if (vowels.IndexOf(c) != -1) {
                    count++;
                }
            }
            return count;
        }
    }
}