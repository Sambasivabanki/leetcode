class Solution {
    public int countSegments(String s) 
    {
        String[] words=s.split(" ");
        int count=0;
        for(int i=0;i<words.length;i++)
        {
            if(!words[i].isEmpty())
            count++;
    }
        return count;
    }
}