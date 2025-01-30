#include <iostream>
using namespace std;

int main() {
    string name;
    cin >> name;
    int age;
    cin >> age;
    for (int i = 0; i<age; i++) {
        cout << "Hipp hipp hurra, " << name << "!" << endl;
    }
    return 0;
}