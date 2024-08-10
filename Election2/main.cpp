#include <bits/stdc++.h>
using namespace std;

int main(){
  int N, T, A;
  int rest , gap;

  cin >> N >> T >> A;

  rest = N - T - A;
  gap = abs(T - A);
  if(rest < gap){
    cout << "Yes" << endl;
  }else{
    cout << "No" << endl;
  }
}