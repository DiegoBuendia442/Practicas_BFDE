def conteo(tipodecadena):
    t = 0
    n = len(tipodecadena)
    
    for i in range(n):  
        if tipodecadena[i] == '(':  
            for j in range(i + 1, n):  
                if tipodecadena[j] == ')':
                    
                    t += 2  
                    break   
    return t  

# Tamño de la cadena
n = int(input("Ingresa el tamaño de la cadena: "))

cadena_ingresada = input("Ingresa la cadena: ")


tamanio = conteo(cadena_ingresada)

# Mostrar el resultado
print(tamanio)