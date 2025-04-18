#include <bits/stdc++.h>

using namespace std;

vector<string> split_string(string);

// Complete the miniMaxSum function below.
void miniMaxSum(vector<int> arr) {
    int len=arr.size();
    long long int temp[len];
    long long int sum=0;
    long long int min=0;
    long long int max=0;

    for(int i=0;i<len;i++)
    {
        for(int j=0;j<len;j++)
        {
            if(i!=j)
            {
                sum= sum + arr[j];
            }
        }
        temp[i]=sum;
        sum=0;
       
    }

    min=temp[0];
    max=temp[0];
    for(int i=1;i<=len-1;i++)
    {
        if(max<temp[i])
        {
            max=temp[i];
          
        }
        if(min>temp[i])
        {
            min=temp[i];
           
        }
   }
   cout<<min<<" "<<max;
}

int main()
{
    string arr_temp_temp;
    getline(cin, arr_temp_temp);

    vector<string> arr_temp = split_string(arr_temp_temp);

    vector<int> arr(5);

    for (int i = 0; i < 5; i++) {
        int arr_item = stoi(arr_temp[i]);

        arr[i] = arr_item;
    }

    miniMaxSum(arr);

    return 0;
}

vector<string> split_string(string input_string) {
    string::iterator new_end = unique(input_string.begin(), input_string.end(), [] (const char &x, const char &y) {
        return x == y and x == ' ';
    });

    input_string.erase(new_end, input_string.end());

    while (input_string[input_string.length() - 1] == ' ') {
        input_string.pop_back();
    }

    vector<string> splits;
    char delimiter = ' ';

    size_t i = 0;
    size_t pos = input_string.find(delimiter);

    while (pos != string::npos) {
        splits.push_back(input_string.substr(i, pos - i));

        i = pos + 1;
        pos = input_string.find(delimiter, i);
    }

    splits.push_back(input_string.substr(i, min(pos, input_string.length()) - i + 1));

    return splits;
}
