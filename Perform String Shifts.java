//Perform String Shifts


class Solution {
    public String stringShift(String s, int[][] shift) {
        
        int subStrLen=0;
        
        for(int i=0;i<shift.length;i++)
        {
            if(shift[i][0]==0)
            {
                subStrLen +=shift[i][1];
            }
            else
            {
                subStrLen -=shift[i][1];
            }
        }
        
        String result=null;
        
        if(subStrLen>0)
        {
            subStrLen%=s.length();
            
            String first= s.substring(0,subStrLen);
            String second= s.substring(subStrLen);
            
            result=second+first;
        }
        else
        {
            subStrLen=Math.abs(subStrLen)%s.length();
            int len=s.length();
            String first=s.substring(0,len-subStrLen);
            String second=s.substring(len-subStrLen);
            result=second+first;
        }
        
        return result;
    }
}