#include <iostream>

using namespace std;

int main() {
    int a;
    cin >> a;
    cout << "  ";
    for (int i = 0; i<a; i++) {
        cout << "H ";
    }
    cout << endl;
    cout << "  ";
    for (int i = 0; i<a; i++) {
        cout << "| ";
    }
    cout << endl;
    cout << "H";
    for (int i = 0; i<a; i++) {
        cout << "-C";
    }
    cout << "-OH";
    cout << endl;
    cout << "  ";
    for (int i = 0; i<a; i++) {
        cout << "| ";
    }
    cout << endl;
    cout << "  ";
    for (int i = 0; i<a; i++) {
        cout << "H ";
    }
    return 0;
}