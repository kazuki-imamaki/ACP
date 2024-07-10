#include <bits/stdc++.h>
using namespace std;

int main(){
  int H, W;
  cin >> H >> W;
  vector<string> vecRes(H);
  vector<string> vec(H);
  for(int i = 0;i < H; i++){
      cin >> vec.at(i);
  }
  for(int i = 0;i < H; i++){
    for(int j = 0; j < W; j++){
      int count = 0;

      if(i !=0 && j != 0){
        if(vec.at(i-1).at(j-1) == '#')count++;
      }

      if(i != 0){
        if(vec.at(i-1).at(j) == '#')count++;
      }

      if(j != 0){
        if(vec.at(i).at(j-1) == '#')count++;
      }

      if(i != H -1){
        if(vec.at(i+1).at(j) == '#')count++;
      }

      if(j != W -1){
        if(vec.at(i).at(j+1) == '#')count++;
      }

      if(i != 0 && j != W -1){
        if(vec.at(i-1).at(j+1) == '#')count++;
      }

      if(i != H -1 && j != 0){
        if(vec.at(i+1).at(j-1) == '#')count++;
      }

      if(i != H -1 && j != W -1){
        if(vec.at(i+1).at(j+1) == '#')count++;
      }

      if(vec.at(i).at(j) != '#'){
        vecRes.at(i) += to_string(count);
      }else{
        vecRes.at(i) += "#";
      }
    }
  }

  for(int i = 0;i < H; i++){
      cout << vecRes.at(i) << endl;
  }


}