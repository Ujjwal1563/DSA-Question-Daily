class Solution {
public:
    string addBinary(string a, string b) {
      string res = "";
      int carry = 0;
      int i = a.size() - 1;
      int j = b.size() - 1;
      while(i >= 0 || j >= 0){
        int sum = carry;
        if( i >= 0){
            sum+= a[i]- '0';
            i--;
        }
        if( j >= 0){
            sum+= b[j]- '0';
            j--;
        }
        carry = sum > 1 ? 1 : 0;
        res.push_back(sum % 2 == 0? '0' : '1');
      }
      if(carry ){
        res.push_back('1');
      }
      reverse(begin(res),end(res));
      return res;
    }
};