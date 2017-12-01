#include <stdio.h>
#include <ctype.h>
#include <stdlib.h>
#include <time.h>

// Randomly capitalises characters in first argument (v[1]) and prints out the result.

int main(int a, char** v)
{
	if(a<2)return -1;
	srand(time(NULL));
	char* s = v[1];
	for(;*s++=(rand()%2?toupper(*s):*s);){}
	printf("out: %s", v[1]);
	return 0;
}