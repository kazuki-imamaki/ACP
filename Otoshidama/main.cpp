#include <bits/stdc++.h>
using namespace std;

int main(){
  int N, Y;
  cin >> N >> Y;
  int man = -1;
  int gosen = -1;
  int sen = -1;

  for(int i = 0; i<=N; i++){
    for(int j = 0; i + j <= N; j++){
      int k = N - i - j;
      if(10000 * i + 5000 * j + 1000 * k == Y){
        man = i; gosen = j; sen = k;
      }
    }
  }
    cout << man << " " << gosen << " " << sen << endl;
}