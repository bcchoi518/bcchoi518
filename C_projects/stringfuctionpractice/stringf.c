#include <stdio.h>

char *strcpy(char *dest, const char *src);
size_t strlen(const char *s);
int strcmp(const char *s1, const char *s2);

int main(void) {

        char str1[20] = "abcd";
        char str2[20] = "abcda";
        char str3[20] = "hello world!";
        char str4[20] = "copy world!";

        printf("%d\n", strcmp(str1, str2));

        printf("before str3 : %s\n", str3);

        strcpy(str3, str4);

        printf("after str3 : %s\n", str3);

        return 0;
}

size_t strlen(const char *s) {

        size_t count = 0;

        if (s != NULL) {
            for(int i = 0; *(s+i) != 0; i++) {
                count++;
            }
        }
        else {
            return -1;
        }
        return count;
}

char *strcpy(char *dest, const char *src) {

    for(int i = 0; i <= strlen(src) != 0; i++) {
        dest[i] = src[i];
    }
    return dest;
}

int strcmp(const char *s1, const char *s2) {

    for(int i = 0; i <= strlen(s1); i++) {
        if(s1[i] == s2[i]) {
            continue;
        }
        else {
            return s1[i] - s2[i];
        }
    }
    return 0;
}