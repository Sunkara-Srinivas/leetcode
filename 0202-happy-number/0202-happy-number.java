class Solution {
    public boolean isHappy(int n) {
       boolean res=false;
       int l=is(n);
       System.out.println(l);
       if(l==1||l==7)
       {
        res=true;
       }
       return res;
    }
    public int is(int n)
    {
        int k;
        int c=0;
        int m;
        
        while(n>0)
        {
           m=n%10;
           c=c+(m*m);
           n=n/10;  
        }
       // System.out.println(c);
        if(c>9)
        {
           c= is(c);
        }
        if(c<10)
        {
            return c;
        }
       
        return c;
        
    }
}