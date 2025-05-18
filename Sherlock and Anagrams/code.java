import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
    int len=s.length();
    String tem;
    int n=(len*(len+1))/2;
    int i,j=1,k=0,temp=0;
    ArrayList<String> arr=new ArrayList<String>(n);
    for(i=0;i<len;i++)
    {
        for(j=i+1;j<=len;j++)
        {
        tem=s.substring(i, j);
        char[] charArray=tem.toCharArray();
        Arrays.sort(charArray);
        arr.add(String.valueOf(charArray));
        }
      
    }
    int l=arr.size();
    int count=0;
    for(i=0;i<l;i++)
    {
        for(j=0;j<l;j++)
        {
            if(i==j)
                continue;

            //if(arr.get(i).toString()==arr.get(j).toString())
            if(arr.get(i).equals(arr.get(j)))
            {
                count++;
            }
        }
       //System.out.println(arr.get(i));
    }

return count/2;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
