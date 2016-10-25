
#include <cstdio>
#include <set>

using namespace std;

int N, K;
set<int> nums;

int main(){
	scanf("%d%d", &N, &K);
	for (int i = 0, x; i < N; i++){
		scanf("%d", &x);
		nums.insert(x);
	}
	for (int i = 0, x; i < K; i++){
		scanf("%d", &x);
		if (nums.find(x) != nums.end()){
			printf("Yes\n");
		} else {
			printf("No\n");
		}
	}
}
