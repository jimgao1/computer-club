
#include <bits/stdc++.h>

using namespace std;

int N = 5000, K = 10000, bound = 50000;

int main(){
	srand(time(NULL));

	printf("%d %d\n", N, K);
	set<int> s;
	vector<int> numbers;

	for (int i = 0; i < N; ){
		int n = rand() % bound + 1;
		if (s.find(n) != s.end()) continue;
		s.insert(n);
		numbers.push_back(n);
		i++;
	}

	sort(numbers.begin(), numbers.end());

	for (int i = 0; i < N; i++){
		if (i != 0) printf(" ");
		printf("%d", numbers[i]);
	}
	printf("\n");

	for (int i = 0; i < K; i++){
		if (rand() % 3 == 0){
			int r1 = rand() % (N / 2);
			int r2 = r1 + rand() % (N - r1);
			printf("%d %d\n", numbers[r1], numbers[r2]);
		} else {
			int r1 = numbers[0] + (rand() % (numbers[N / 2] - numbers[0]));
			int r2 = r1 + rand() % (numbers[N - 1] - r1);
			printf("%d %d\n", r1, r2);
		}
	}
}
