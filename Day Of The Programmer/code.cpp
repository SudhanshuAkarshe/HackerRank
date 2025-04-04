#include <iostream>
#include <string>

using namespace std;

string dayOfProgrammer(int year) {
    int day;
    if (year == 1918) {
        day = 26; // Special case for 1918 transition year
    } else if ((year < 1918 && year % 4 == 0) || (year > 1918 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))) {
        day = 12; // Leap year
    } else {
        day = 13; // Non-leap year
    }
    return to_string(day) + ".09." + to_string(year);
}

int main() {
    int year;
    cin >> year;
    cout << dayOfProgrammer(year) << endl;
    return 0;
}
