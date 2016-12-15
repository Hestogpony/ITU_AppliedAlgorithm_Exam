#include <iostream>

using namespace std;

int main() {

    int n;
    cin >> n;
    int k[n], v[n];

    for (int i = 0; i < n; i++) {
        cin >> k[i] >> v[i];
    }

    for (int i = 0; i < n; i++) {
        cout << "key: " << k[i] << " value: " << v[i] << endl;
    }

    return 0;
}