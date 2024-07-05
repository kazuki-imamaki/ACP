#include <bits/stdc++.h>
using namespace std;

int main(){
  int N, A, B;
  cin >> N >> A >> B;

  int sum = 0;
  for(int i = 1; i <= N; i++){
    int x = i;
    int temp = 0;
    while(x > 0){
      temp += x % 10;
      x /= 10;
    }
    if (A <= temp && temp <= B){
      sum += i;
    }
  }
  cout << sum << endl;
}
