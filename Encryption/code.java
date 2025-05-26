import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the encryption function below.
    static String encryption(String s) {
        StringBuilder sr=new StringBuilder();

        int len=0;
        //String news;
        int row,col;
        double rowt,colt;
        s.trim();
        len=s.length();
        row =(int) Math.ceil(Math.sqrt(len));
        col =(int) Math.ceil(Math.sqrt(len));
        int k=0;
        char arr[][]=new char[row][col];
       int cn=len;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(cn!=0)
                { 
                arr[i][j]=s.charAt(k);
                k++;
                cn--;
                }
                else
                    arr[i][j]='.';
                
            }
        }
       /*for(int i=0;i<col;i++)
       {
           at=i;
          while(temp!=0)
          {
           sr=sr.append(arr[at]);
           at+=4;
           temp--;
          }
          temp=row;
          sr=sr.append(" ");
       }*/
        char art[][]=new char[col][row];
       for(int i=0;i<row;i++)
       {
           for(int j=0;j<col;j++)
           {
               art[j][i]=arr[i][j];
           }
       }
       //int count=len;
        for(int i=0;i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
                if(art[i][j]!='.')
                { 
                sr=sr.append(art[i][j]);
                }
                
            }
            sr=sr.append(" ");
        }
        
        return sr.toString();

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
