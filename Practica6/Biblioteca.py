class Libro:
    def __init__(self, titulo, autor, isbn):
        self.__titulo = titulo
        self.__autor = autor
        self.__isbn = isbn
        self.__estado = "disponible"
    
    # Getters
    def get_titulo(self):
        return self.__titulo

    def get_autor(self):
        return self.__autor

    def get_isbn(self):
        return self.__isbn

    def get_estado(self):
        return self.__estado

    # Setters
    def set_estado(self, estado):
        if estado in ["disponible", "prestado"]:
            self.__estado = estado

    # Métodos de cambio de estado
    def prestar(self):
        if self.__estado == "disponible":
            self.__estado = "prestado"
            return True
        return False

    def devolver(self):
        if self.__estado == "prestado":
            self.__estado = "disponible"
            return True
        return False


class Biblioteca:
    def __init__(self):
        self.__coleccion_libros = []

    # Método para agregar libro
    def agregar_libro(self, libro):
        self.__coleccion_libros.append(libro)

    # Método para buscar libro por ISBN
    def buscar_libro_por_isbn(self, isbn):
        for libro in self.__coleccion_libros:
            if libro.get_isbn() == isbn:
                return libro
        return None

    # Método para prestar libro
    def prestar_libro(self, isbn):
        libro = self.buscar_libro_por_isbn(isbn)
        if libro and libro.prestar():
            print(f"El libro '{libro.get_titulo()}' ha sido prestado.")
        else:
            print("El libro no está disponible o no se encontró.")

    # Método para devolver libro
    def devolver_libro(self, isbn):
        libro = self.buscar_libro_por_isbn(isbn)
        if libro and libro.devolver():
            print(f"El libro '{libro.get_titulo()}' ha sido devuelto.")
        else:
            print("El libro no se encontró o ya está disponible.")

    # Mostrar todos los libros
    def mostrar_libros(self):
     print("Colección de libros:")
     for libro in self.__coleccion_libros:
        print("• Título:", libro.get_titulo())
        print("  Autor:", libro.get_autor())
        print("  ISBN:", libro.get_isbn())
        print("  Estado:", libro.get_estado())
        print("-" * 30)  # Separador entre libros para mejor legibilidad




# Simulación del uso de la biblioteca
if __name__ == "__main__":
    # Crear biblioteca
    biblioteca = Biblioteca()

    # Añadir libros a la biblioteca
    libro1 = Libro("Cien Años de Soledad", "Gabriel García Márquez", "12345")
    libro2 = Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "67890")
    libro3 = Libro("El Principito", "Antoine de Saint-Exupéry", "54321")
    
    biblioteca.agregar_libro(libro1)
    biblioteca.agregar_libro(libro2)
    biblioteca.agregar_libro(libro3)

    # Mostrar colección inicial de libros
    biblioteca.mostrar_libros()
    
    # Prestar un libro
    isbn_prestar = "12345"
    print(f"\nIntentando prestar el libro con ISBN {isbn_prestar}:")
    biblioteca.prestar_libro(isbn_prestar)
    
    # Mostrar colección después de prestar un libro
    biblioteca.mostrar_libros()

    # Devolver el libro
    isbn_devolver = "12345"
    print(f"\nIntentando devolver el libro con ISBN {isbn_devolver}:")
    biblioteca.devolver_libro(isbn_devolver)
    
    # Mostrar colección después de devolver el libro
    biblioteca.mostrar_libros()
