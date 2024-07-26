#include <bits/stdc++.h>
using namespace std;

int main(){
  int A, B, C, D;
  cin >> A >> B >> C >> D;
  int res = 0;
  if(max(A,C)<=min(B,D)){
    int end = min(B,D);
    int start = max(A,C);
    res = end - start;
  }
  cout << res << endl;
}