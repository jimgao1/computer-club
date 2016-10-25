
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int N, K;
vector<int> nums;

int main(){
	cin >> N >> K;
	for (int i = 0, x; i < N; i++){
		cin >> x;
		nums.push_back(x);
	}
	for (int i = 0, a, b; i < K; i++){
		cin >> a >> b;
		cout << (int)(upper_bound(nums.begin(), nums.end(), b) - lower_bound(nums.begin(), nums.end(), a)) << endl;
	}
}
