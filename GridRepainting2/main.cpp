#include <bits/stdc++.h>
using namespace std;

int main(){
  int h, w;
  cin >> h >> w;
  string board[50];

  int dx[4] = {0, 1, 0, -1};
  int dy[4] = {-1, 0, 1, 0};
  for(int i = 0; i < h; i++)cin >> board[i];

  bool can =true;
  for(int i = 0; i < h; i++){
    if(can == false) break;
    for(int j = 0; j < w; j++){
      if(board[i][j] != '#')continue;
      bool can2 = false;
      for(int d = 0; d < 4; d++){
        int ni = i + dy[d];
        int nj = j + dx[d];

        if(ni < 0 || h <= ni) continue;
        if(nj < 0 || w <= nj) continue;
        
        if(board[ni][nj] == '#'){
          can2 = true;
          continue;
        }
      }
      if(can2 == false){
        can = false;
        break;
      }
    }
  }
  if(can)cout << "Yes" << endl;
  else cout << "No" << endl;
}