class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans=0;
      for(int i=0;i<stones.length();i++)
      {
          char sto=stones.charAt(i);
          boolean found=false;
          for(int j=0;j<jewels.length();j++)
          {
              char dia=jewels.charAt(j);
          
          if(sto==dia)
          {
            found=true;  
          }
          }   
          if(found==true)
          {
              ans=ans+1;
          }
      }
        return ans;
        
        
    }
}