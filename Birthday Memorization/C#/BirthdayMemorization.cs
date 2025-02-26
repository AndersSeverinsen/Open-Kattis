using System;
using System.Collections.Generic;

namespace BirthdayMemorization
{
    class Program
    {
        static void Main(string[] args)
        {
            string? inp1 = Console.ReadLine();
            if (inp1 == null)
            {
                Console.WriteLine("Invalid input");
                return;
            }
            int n = int.Parse(inp1);
            List<Friend> friends = new List<Friend>();
            for (int i = 0; i < n; i++)
            {
                string? inp2 = Console.ReadLine();
                if (inp2 == null)
                {
                    Console.WriteLine("Invalid input");
                    return;
                }
                string[] input = inp2.Split(' ');
                string name = input[0];
                string score = input[1];
                int scoreInt = int.Parse(score);
                string[] date = input[2].Split('/');
                string birthday = date[0];
                string birthmonth = date[1];
                Friend friend = new Friend(name, scoreInt, birthday, birthmonth);
                bool found = false;
                foreach (Friend f in friends)
                {
                    if (f.Birthday == friend.Birthday && f.Birthmonth == friend.Birthmonth)
                    {
                        if (f.Score < friend.Score) {
                            friends.Remove(f);
                            friends.Add(friend);
                        }
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    friends.Add(friend);
                }
            }
            Console.WriteLine(friends.Count);
            friends.Sort((x, y) => x.Name.CompareTo(y.Name));
            foreach (Friend f in friends)
            {
                Console.WriteLine(f.Name);
            }
        }
    }

    class Friend
    {
        public string Name { get; set; }
        public int Score { get; set; }
        public string Birthday { get; set; }
        public string Birthmonth { get; set; }

        public Friend(string name, int score, string birthday, string birthmonth)
        {
            Name = name;
            Score = score;
            Birthday = birthday;
            Birthmonth = birthmonth;
        }
    }
}