try
{
    string inp1 = Console.ReadLine();
    string[] P = inp1.Split(' ');
    string inp2 = Console.ReadLine();
    string[] G = inp2.Split(' ');

    int P_x = Convert.ToInt32(P[0]);
    int P_y = Convert.ToInt32(P[1]);
    int G_x = Convert.ToInt32(G[0]);
    int G_y = Convert.ToInt32(G[1]);
    int output = 0;
    if (P_x != G_x) {
        output++;
    }
    if (P_y != G_y) {
        output++;
    }
    Console.WriteLine(output);
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