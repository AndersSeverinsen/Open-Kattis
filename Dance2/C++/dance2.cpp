#include <iostream>
#include <stdlib.h>     /* abs */
#include <algorithm>    // std::max
#include <vector>

using namespace std;

int main() {
    int a;
    cin >> a;
    vector<int> leaders;
    vector<int> followers;
    for (int i = 0; i<a; i++) {
        int l,f;
        cin >> l >> f;
        leaders.push_back(l);
        followers.push_back(f);
        sort(leaders.begin(), leaders.end());
        sort(followers.begin(), followers.end());
        vector<int> diff;
        for (int j = 0; j<a; j++) {
            diff.push_back(abs(leaders[j] - followers[j]));
        }
        int max = *std::max_element(diff.begin(), diff.end());
        cout << max << endl;
    }
    return 0;
}