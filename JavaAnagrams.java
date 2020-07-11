import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char [] c1 = a.toLowerCase().toCharArray();
        char [] c2 = b.toLowerCase().toCharArray();
        int n1 = a.length();
        int n2 = b.length();
        if(n1 != n2)
        {
            return false;
        }
        else{
            int count [] = new int[26];
            for(int i=0;i<n1;i++)
            {
                
                count[c1[i]-97]++;
                count[c2[i]-97]--;
            }
            for(int i=0;i<26;i++)
            {
                if(count[i]!=0)
                {
                    return false;
                }
            }
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
