#include <iostream>

using namespace std;

int main() {
    string inp;
    cin >> inp;
    char out[2];
    out[0] = inp[1];
    out[1] = inp[0];
    cout << out << endl;
    return 0;
}