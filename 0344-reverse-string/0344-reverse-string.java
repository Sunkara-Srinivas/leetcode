class Solution {
    public void reverseString(char[] s) {
        
      char []arr=new char[s.length];
      int j=0;
      int left=0,right=s.length-1;
      while(left<=right)
      {
        char ch=s[left];
        s[left]=s[right];
        s[right]=ch;
        left++;
        right--;
      }
    }
}