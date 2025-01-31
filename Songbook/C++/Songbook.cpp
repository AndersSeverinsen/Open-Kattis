#include <iostream>
#include <vector>
#include <string>
#include <tuple>

using namespace std;

int smallest_first(vector<int> songs, int max, int song_count, int acc, int sub) {
    if (acc+songs[song_count] <= max && song_count < songs.size()) {
        int nacc = acc+songs[song_count];
        while (nacc > 1000) {
            nacc -= 1000;
            max -= 1000;
            sub +=1;
        }
        return smallest_first(songs, max, song_count+1, nacc, sub);
    } else {
        for (int i=0; i<sub;i++) {
            acc += 1000;
        }
        return acc;
    }
}
/*
99999 5
60 120 9999 299 99999
*/

int main() {
    string inp;
    cin >> inp;
    int max = stoi(inp)*60;
    cin >> inp;
    int num_songs = stoi(inp);
    vector<int> songs;
    for (int i = 0; i<num_songs; i++) {
        cin >> inp;
        songs.push_back(stoi(inp));
    }
    //Song min = best_time(songs, 0, max, 0);
    sort(songs.begin(), songs.end());
    int min = smallest_first(songs, max, 0, 0, 0);
    cout << min << endl;
    return 0;
}