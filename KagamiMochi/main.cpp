#include <bits/stdc++.h>
using namespace std;

bool isStackable(int topDiameter, vector<int> vec){
  for(int i = 0; i<vec.size();i++){
    if(topDiameter > vec.at(i)){
      return true;
    }
  }
  return false;
}
int getStackableMochi(int topDiameter, vector<int> vec){
  for(int i = 0; i<vec.size(); i++){
    if(topDiameter > vec.at(i)){
      return vec.at(i);
    }
  }
  return 0;
}
int main() {
  int N;
  cin >> N;
  vector <int> vec(N);
  for(int i = 0;i<N;i++){
    cin >> vec.at(i);
  }
  sort(vec.begin(), vec.end());
  reverse(vec.begin(), vec.end());
  int count = 1;
  int topDiameter = vec.at(0);
  while(isStackable(topDiameter, vec)){
    topDiameter = getStackableMochi(topDiameter, vec);
    count++;
  }
  cout << count << endl;

}