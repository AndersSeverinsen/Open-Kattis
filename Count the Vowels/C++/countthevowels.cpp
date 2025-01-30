#include <iostream>
using namespace std;

int main() {
    string inp;
    getline (cin, inp);
    int vowel = 0;
    for (int i = 0; i<inp.length(); i++) {
        if (inp[i]=='a' || inp[i]=='A' || inp[i]=='e' || inp[i]=='E' || inp[i]=='i' || inp[i]=='I' || inp[i]=='j' || inp[i]=='J' || inp[i]=='o' || inp[i]=='O' || inp[i]=='u' || inp[i]=='U') {
            vowel++;
        }
    }
    cout << vowel << endl;
    return 0;
}