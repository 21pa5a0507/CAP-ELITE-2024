#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    char s[1000];
    int arr1[10]={0,0,0,0,0,0,0,0,0,0};
    scanf("%s",s);
    for(int i=0;i<strlen(s);i++){
        int a=s[i];
        if(a>47 && a<58){
            arr1[a-48]+=1;
        }
    }
    for(int i=0;i<10;i++)
    {
        printf("%d ",arr1[i]);
    }
    }
