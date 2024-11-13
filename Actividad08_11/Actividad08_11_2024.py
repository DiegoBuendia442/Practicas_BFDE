class Animal:
    def __init__(self, name):
        self.name = name
        self._color = "No especificado"
        
    def speak(self):
        raise NotImplementedError("Subclass must implement abstract method")

    def eat(self):
        raise NotImplementedError("Subclass must implement abstract method")

    def set_color(self, color):
        self._color = color

    def get_color(self):
        return self._color

class Dog(Animal):
    def speak(self):
        return f"{self.name} dice Woof!"

    def eat(self):
        return f"{self.name} está comiendo croquetas."

class Cat(Animal):
    def speak(self):
        return f"{self.name} dice Meow!"

    def eat(self):
        return f"{self.name} está comiendo pescado."

class Bird(Animal):
    def speak(self):
        return f"{self.name} dice Pío!"

    def eat(self):
        return f"{self.name} está comiendo semillas."

# Ejemplo de uso
dog = Dog("Rex")
cat = Cat("Whiskers")
bird = Bird("Tweety")

# Usando métodos de cada clase
print(dog.speak())
print(cat.speak())
print(bird.speak())

print(dog.eat())
print(cat.eat())
print(bird.eat())

# Manipulando el color
dog.set_color("Marrón")
cat.set_color("Negro")
bird.set_color("Amarillo")

print(f"El color de {dog.name} es {dog.get_color()}")
print(f"El color de {cat.name} es {cat.get_color()}")
print(f"El color de {bird.name} es {bird.get_color()}")
