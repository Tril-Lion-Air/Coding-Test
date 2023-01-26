#include <bits/stdc++.h>
using namespace std;

list<char> P_s;
list<char>::iterator cur = P_s.begin();
string temp;
int n; //테스트케이스 갯수

int main(){
  ios::sync_with_stdio(0);
  cin.tie(0);

  cin >> n;
  while(n--){
    list<char> P_s;
    list<char>::iterator cur = P_s.begin();
    cin >> temp;

    for(auto op : temp){
      if (op == '-'){ //백스페이스
        if(cur!=P_s.begin()){
          cur--;
          cur = P_s.erase(cur);
        }
      }
      else if (op == '<'){
        if(cur!=P_s.begin()) cur--;
      }
      else if (op == '>'){
        if(cur!=P_s.end()) cur++;
      }
      else P_s.insert(cur,op);
    }

    //if (cur!=P_s.end()) P_s.insert(cur,' ');

    for(auto p : P_s) cout << p;
    cout << '\n';
  }
}