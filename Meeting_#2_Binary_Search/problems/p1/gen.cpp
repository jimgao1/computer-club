//Testcase generation program for p1

#include <bits/stdc++.h>

using namespace std;

int main(){
	srand(time(NULL));
	int N = 10000, K = 50000, bound = 100000;
	printf("%d %d\n", N, K);

	set<int> s1, s2;
	vector<int> nums;
	for (int i = 0; i < N; ){
		int n = rand() % bound + 1;
		if (s1.find(n) == s1.end()){
			nums.push_back(n);
			i++;
		}
	}
	sort(nums.begin(), nums.end());

	for (int i = 0; i < nums.size(); i++){
		if (i != 0) printf(" ");
		printf("%d", nums[i]);
	}
	printf("\n");

	int cur = rand() % 5;

	for (int i = 0; i < K; ){
		int query = rand() % bound + 1;
		if (s2.find(query) != s2.end()) continue;
		if (cur % 5 != 0){
			query = nums[rand() % nums.size()];
		}
		s2.insert(query);
		printf("%d\n", query);
		i++;
		cur = rand() % 5;
	}
}
