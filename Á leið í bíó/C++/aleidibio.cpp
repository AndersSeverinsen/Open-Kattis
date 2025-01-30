#include <iostream>
using namespace std;

int main() {
    string a_str;
    cin >> a_str;
    int a = stoi(a_str);
    string b_str;
    cin >> b_str;
    int b = stoi(b_str);
    string c_str;
    cin >> c_str;
    int c = stoi(c_str);
    int out = c - b - a;
    cout << out << endl;
    return 0;
}