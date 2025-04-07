#include <bits/stdc++.h>

using namespace std;

// Complete the staircase function below.
void staircase(int n) {
    char arr[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=' ';
    }

     for(int i=n-1;i>=0;i--)
    {
        arr[i]='#';
        for(int j=0;j<n;j++)
        {
            cout<<arr[j];
        }
        cout<<"\n";
    }

}

int main()
{
    int n;
    cin >> n;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    staircase(n);

    return 0;
}
