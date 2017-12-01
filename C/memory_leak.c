#include <stdlib.h>
#include <limits.h>

int main(void)
{
	while(1){malloc(UINT_MAX);}
	return 0;
}