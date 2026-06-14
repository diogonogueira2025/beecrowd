#include <bits/stdc++.h>
using namespace std;


int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    
    int n;

    cin >> n;

    for (int t = 0; t < n; t++) {
        int h, d, g;

        cin >> h >> d >> g;

        if (h >= 200 && h <= 300 && d >= 50 && g >= 150) {
            cout << "Sim" << "\n";
        } else {
            cout << "Nao" << "\n";
        }
    }
}
