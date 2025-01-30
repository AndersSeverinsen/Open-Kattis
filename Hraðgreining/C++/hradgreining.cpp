#include <iostream>
#include <string>

using namespace std;

int main() {
    string dna;
    cin >> dna;
    char cov[] = "COV";
    bool veikur = false;
    if (dna.find(cov) != std::string::npos) {
        veikur = true;
    }
    if (veikur)
        cout << "Veikur!" << endl;
    else
        cout << "Ekki veikur!" << endl;
    return 0;
}