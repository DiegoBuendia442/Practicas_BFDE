
dividendo = int(input("Introduce el dividendo: "))
divisor = int(input("Introduce el divisor: "))


if divisor == 0:
    print("El divisor no puede ser 0.")
else:
 
    cociente = 0

   
    while dividendo >= divisor:
        dividendo -= divisor  
        cociente += 1  


    residuo = dividendo

    # Mostrar los resultados
    print("Cociente:", cociente)
    print("Residuo:", residuo)
