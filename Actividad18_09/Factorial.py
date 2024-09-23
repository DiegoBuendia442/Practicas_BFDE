def factorial(n):
    
    if n < 0:
        return "El factorial no está definido para números negativos"
   
    elif n == 0:
        return 1
    else:
        result = 1
        for i in range(1, n + 1):
            result *= i
        return result


try:
    numero = int(input("Ingresa un número entero: "))
    print(f"El factorial de {numero} es {factorial(numero)}")
except ValueError:
    print("Por favor, ingresa un número entero válido.")
