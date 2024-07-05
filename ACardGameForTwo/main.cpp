#include <bits/stdc++.h>
using namespace std;

int main(){
  int N;
  cin >> N;
  
  vector <int> vec(N);
  for(int i = 0; i<N; i++){
    cin >> vec.at(i);
  }
  
  sort(vec.begin(), vec.end());
  reverse(vec.begin(), vec.end());
  int alice = 0;
  int bob = 0;
  bool isFirst = true;
  for(int i = 0; i < N; i++){
    if(isFirst){
      alice += vec.at(i);
    }else{
      bob += vec.at(i);
    }
    isFirst = !isFirst;
  }
  cout << alice - bob << endl;
}