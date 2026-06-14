#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    
    string s1, s2;
    cin >> s1 >> s2;

    int tam1 = s1.size();
    int tam2 = s2.size();
    vector<vector<int>> dp(tam1 + 1, vector<int>(tam2 + 1, 0));

    for (int i = 1; i < tam1 + 1; i++) {
        for (int j = 1; j < tam2 + 1; j++) {
            if (s1[i-1] == s2[j-1]) {
                dp[i][j] = dp[i-1][j-1] + 1;
            } else {
                dp[i][j] = max(dp[i][j-1], dp[i-1][j]);
            }
        }
    }

    cout << dp[tam1][tam2] << "\n";
}
