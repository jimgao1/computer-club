
#include <bits/stdc++.h>

using namespace std;

int G, P;
vector<int> planes;

int main(){
	cin >> G >> P;
	for (int i = 1; i <= G; i++) planes.push_back(i);
	
	for (int i = 0, x; i < P; i++){
		cin >> x;
		vector<int>::iterator it = upper_bound(planes.begin(), planes.end(), x);
		if (it == planes.begin()){
			cout << i << endl;
			return 0;
		}
		planes.remove(--it);
	}
	
	cout << P << endl;
}
