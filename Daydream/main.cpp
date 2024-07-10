#include <bits/stdc++.h>
using namespace std;

int main(){
  string divide[4] = {"dream", "dreamer", "erase", "eraser"};

  string S;

  cin >> S;
  reverse(S.begin(), S.end());

  for(int i = 0; i < 4; i++)reverse(divide[i].begin(), divide[i].end());

  bool b = true;
  for(int i = 0; i < S.size();){
    bool can = false;
    for(int j = 0; j < 4; j++){
      string d = divide[j];
      if(S.substr(i, d.size()) == d){
        can = true;
        i += d.size();
      }
    }
    if(!can){
      b = false;
      break;
    }
  }
  if(b) cout << "YES" << endl;
  else cout << "NO" << endl;
}