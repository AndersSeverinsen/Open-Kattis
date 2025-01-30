#include <iostream>
#include <string>
using namespace std;

int main() {
    string inp;
    cin >> inp;
    for (int i = 0; i< inp.length(); i++) {
        if (inp[i] == 'a') {
            string s = inp.substr(i,inp.length());
            cout << s << endl;
            return 0;
        }
    }
    return 0;
}