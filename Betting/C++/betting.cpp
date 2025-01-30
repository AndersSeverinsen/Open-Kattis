#include <iostream>
using namespace std;

int main() {
    float a;
    cin >> a;
    float b = 100.0-a;
    float x = b/a+1.0;
    float y = a/b+1.0;
    cout << x << endl;
    cout << y << endl;
    return 0;
}