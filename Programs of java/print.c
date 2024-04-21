#include <stdio.h>
void main()
{
    int counter=1;
    int n=10;
    Rj :
    printf("%d ",counter);
    counter++;
    if(counter<=n)
        goto Rj;
}