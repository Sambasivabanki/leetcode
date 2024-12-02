class Solution {
    public int lengthOfLastWord(String s) 
    {
      s=s.trim();
      int s1=s.lastIndexOf(" ");
      return s.length()-s1-1;  
    }
}