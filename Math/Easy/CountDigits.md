## [Count Digits](https://www.codingninjas.com/studio/problems/count-digits_8416387)

```
int countDigits(int n){
	// Write your code here.	
	int x=n;
	int count=0;
	while(x!=0){
		count++;
		n=n/10;
	}
	return count;
}
```
#### `TC` O(n)

```
int countDigits(int n){
	// Write your code here.	
	String count = Integer.toString(n);
	return count.lenght();
}
```

```
int countDigits(int n){
	// Write your code here.	
	int x=n;
	int count=0;
	while(x!=0){
	  count += Math.floor(Math.log10(x) +1);
	}
	return count;
}
```

