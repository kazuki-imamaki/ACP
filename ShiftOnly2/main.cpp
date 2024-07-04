#include <bits/stdc++.h>
using namespace std;

bool isEven(vector <int> vec, int n){
  for (int i = 0; i<n; i++){
    if(vec.at(i) % 2 != 0){
      return false;
    }
  }
  return true;
}
int main() {
  int N;
  cin >> N;

  vector <int> vec(N);

  for(int i = 0; i<N; i++){
    cin >> vec.at(i);
  }

  int count = 0;

  while(isEven(vec, N)){
    for(int i = 0; i< N; i++){
      vec.at(i) = vec.at(i) /2;
    }
    count++;
  }

  cout << count << endl;

}
