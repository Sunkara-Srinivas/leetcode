class Solution {
    public boolean isValid(String word) {
      int c=0;
      int v=0;
      int d=0;
      int k=word.length();
      for(int i=0;i<k;i++)
      {
      char ch = Character.toLowerCase(word.charAt(i));
      int ascii = (int) ch; 
      int n;
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
             v++;
                 }
            
            else if(ascii>=97&&ascii<=122)
            {
                c++;
            }      
             else if(ascii>=48&&ascii<=57)
            {
                d++;
            }
            else
            {
                return false;
            }   
       
          }
          if(c>0&&v>0&&k>=3)
          {
            return true;
          }
          return false;



    }
}