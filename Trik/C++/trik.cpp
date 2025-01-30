#include <iostream>
using namespace std;

int main() {
    string seq;
    cin >> seq;
    int pos = 1;
    for (int i = 0; i<seq.length(); i++) {
        if (seq[i] == 'A') {
            if (pos == 1) {
                pos = 2;
            } else if (pos == 2) {
                pos = 1;
            }
        } else if (seq[i] == 'B') {
            if (pos == 2) {
                pos = 3;
            } else if (pos == 3) {
                pos = 2;
            }
        } else if (seq[i] == 'C') {
            if (pos == 1) {
                pos = 3;
            } else if (pos == 3) {
                pos = 1;
            }
        }
    }
    cout << pos << endl;
    return 0;
}