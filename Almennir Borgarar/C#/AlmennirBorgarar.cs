using System;
using System.Collections.Generic;

namespace AlmennirBorgarar
{
    class Program
    {
        static void Main(string[] args)
        {
            string? inp1 = Console.ReadLine();
            string[] nm = inp1!.Split(' ');
            string? inp2 = Console.ReadLine();
            string[] times = inp2!.Split(' ');

            int numOfGrills = Convert.ToInt32(nm[0]);
            int contestants = Convert.ToInt32(nm[1]);
            List<Grill> grills = new List<Grill>();
            for (int i = 0; i<numOfGrills; i++) {
                int grillTime = Convert.ToInt32(times[i]);
                grills.Add(new Grill(grillTime));
            }
            int t = 0;
            while (contestants >= 0) {
                foreach (Grill grill in grills) {
                    if (!grill.isOccupied(t)) {
                        contestants--;
                        if (contestants < 0) {
                            break;
                        }
                        grill.start(t);
                    }
                }
                if (contestants < 0) {
                    break;
                }
                t++;
            }
            Console.WriteLine(t);
        }
    }

    class Grill {
        int grillTime;
        int startTime;

        public Grill(int grillTime) {
            this.grillTime = grillTime;
        }

        public int getGrillTime() {
            return grillTime;
        }

        public void start(int startTime) {
            this.startTime = startTime;
        }

        public bool isOccupied(int currentTime) {
            return currentTime < startTime + grillTime;
        }
    }
}