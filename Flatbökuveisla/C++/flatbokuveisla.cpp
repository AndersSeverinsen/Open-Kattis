#include <iostream>
using namespace std;

int main() {
    string n_str;
    cin >> n_str;
    int n = stoi(n_str);
    string m_str;
    cin >> m_str;
    int m = stoi(m_str);
    int out = n % m;
    cout << out << endl;
    return 0;
}