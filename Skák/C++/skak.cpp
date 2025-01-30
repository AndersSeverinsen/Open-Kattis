#include <iostream>
#include <string>

using namespace std;

int main() {
    long P_x, P_y, G_x, G_y;
    cin >> P_x >> P_y >> G_x >> G_y;
    int out = 0;
    if (P_x != G_x)
        out++;
    if (P_y != G_y)
        out++;
    cout << out;
    return 0;
}