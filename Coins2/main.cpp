#include <bits/stdc++.h>
using namespace std;

int main(){
  int A, B, C, X;
  cin >> A >> B >> C >> X;
  int count =0;
  int sum = 0;
  for(int i = 0; i <= A; i++){
    for(int j =0; j <= B;j++){
      for(int k = 0; k <= C; k++){
        sum = i * 500 + j * 100 + k * 50;
        if(X == sum){
          count++;
        }
      }
    }
  }
  cout << count << endl;
}