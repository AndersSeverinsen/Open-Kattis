#include <iostream>
using namespace std;

int main() {
    long count_letters = 0;
    string inp;
    cin >> inp;
    for (int i = 0; i<inp.size(); i++) {
        if (inp[i] == 'u') {
            count_letters++;
        }
    }
    cout << count_letters << endl;
    return 0;
}