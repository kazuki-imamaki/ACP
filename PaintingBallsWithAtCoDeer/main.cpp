#include <bits/stdc++.h>
using namespace std;

int main(){
  int n, k;
  long ans;
  cin >> n >> k;
  ans = k;
  for(int i = 0; i < n -1; i++){
    ans *= k - 1;
  }
  cout << ans << endl;
}