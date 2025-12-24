class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
         int c=0;
     for (int i=0;i<apple.length;i++)
     {
        c=c+apple[i];
     }   
     Arrays.sort(capacity);
     int j=0;
     for(int i=capacity.length-1;i>=0;i--)
     {
        if(c>0)
        {
            c=c-capacity[i];
            j++;
        }
        else 
        {
            break;
        }
     }
     return j;

    }
}