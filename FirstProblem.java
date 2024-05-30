class Solution {
    public static String reversePrefix(String word, char ch) {
        String nstr="";
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            {
                for(int j=0;j<=i;j++){
                    char temp;
                    temp=word.charAt(i);
                    nstr=temp+nstr;
                    i--;
                }
                break;
                
            }
        }
    }
    public static void main (String args[])
    {
        String word = "abcdefd";
        char ch='d';
        reversePrefix(word,ch);
        for(int i=0;i<word.length();i++)
        {
            System.out.print(i);
        }
    }
}
