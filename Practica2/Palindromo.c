#include <stdio.h>

int main() {
    int numero, numeroOriginal, resto, numeroInvertido = 0;
    
    printf("Introduce un numero entero: ");
    scanf("%d", &numero);
    
    numeroOriginal = numero;
    
    while (numero != 0) {
        resto = numero % 10;  
        numeroInvertido = numeroInvertido * 10 + resto;  
        numero /= 10;  
    }
   
    if (numeroOriginal == numeroInvertido) {
        printf("%d es un palindromo.\n", numeroOriginal);
    } else {
        printf("%d no es un palindromo.\n", numeroOriginal);
    }

    return 0;
}
