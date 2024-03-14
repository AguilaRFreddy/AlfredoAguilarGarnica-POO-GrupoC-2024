class Libro:
    def __init__(self, titulo):
        self.titulo = titulo
        self.rentado = False

    def get_titulo(self):
        return self.titulo

    def is_rentado(self):
        return self.rentado

    def set_rentado(self, rentado):
        self.rentado = rentado


class Persona:
    def __init__(self, nombre):
        self.nombre = nombre
        self.libros_rentados = []

    def get_nombre(self):
        return self.nombre

    def get_libros_rentados(self):
        return self.libros_rentados

    def rentar_libro(self, libro):
        self.libros_rentados.append(libro)


class Libreria:
    def __init__(self):
        self.personas = []
        self.libros = []

    def registrar_persona(self, nombre):
        self.personas.append(Persona(nombre))

    def registrar_libro(self, titulo):
        self.libros.append(Libro(titulo))

    def realizar_renta(self, persona, libro):
        libro.set_rentado(True)
        persona.rentar_libro(libro)

    def listar_usuarios_con_libros(self):
        usuarios_con_libros = []
        for persona in self.personas:
            if persona.get_libros_rentados():
                usuarios_con_libros.append(persona)
        return usuarios_con_libros

    def listar_libros_no_rentados(self):
        libros_no_rentados = []
        for libro in self.libros:
            if not libro.is_rentado():
                libros_no_rentados.append(libro)
        return libros_no_rentados

    def listar_libros_rentados(self):
        libros_rentados = []
        for libro in self.libros:
            if libro.is_rentado():
                libros_rentados.append(libro)
        return libros_rentados

    def listar_usuarios(self):
        print("Usuarios registrados:")
        for persona in self.personas:
            print(persona.get_nombre())

    def listar_libros(self):
        print("Libros registrados:")
        for libro in self.libros:
            print(libro.get_titulo())


def main():
    libreria = Libreria()
    opcion = None

    while opcion != "9":
        print("\nMenú:")
        print("1. Registrar usuario")
        print("2. Registrar libro")
        print("3. Realizar renta de un libro")
        print("4. Listar todos los usuarios registrados")
        print("5. Listar todos los libros registrados")
        print("6. Listar usuarios que han rentado al menos un libro")
        print("7. Listar libros no rentados")
        print("8. Listar libros rentados")
        print("9. Salir")

        opcion = input("Ingrese su opción: ")

        if opcion == "1":
            nombre_usuario = input("Ingrese el nombre del usuario: ")
            libreria.registrar_persona(nombre_usuario)
            print("Usuario registrado exitosamente.")

        elif opcion == "2":
            titulo_libro = input("Ingrese el título del libro: ")
            libreria.registrar_libro(titulo_libro)
            print("Libro registrado exitosamente.")

        elif opcion == "3":
            print("Usuarios registrados:")
            libreria.listar_usuarios()
            index_usuario = int(input("Seleccione el número del usuario: ")) - 1

            print("Libros registrados:")
            libreria.listar_libros()
            index_libro = int(input("Seleccione el número del libro: ")) - 1

            libreria.realizar_renta(libreria.personas[index_usuario], libreria.libros[index_libro])
            print("Renta realizada con éxito.")

        elif opcion == "4":
            libreria.listar_usuarios()

        elif opcion == "5":
            libreria.listar_libros()

        elif opcion == "6":
            print("Usuarios que han rentado al menos un libro:")
            for persona in libreria.listar_usuarios_con_libros():
                print(persona.get_nombre())

        elif opcion == "7":
            print("Libros no rentados:")
            for libro in libreria.listar_libros_no_rentados():
                print(libro.get_titulo())

        elif opcion == "8":
            print("Libros rentados:")
            for libro in libreria.listar_libros_rentados():
                print(libro.get_titulo())

        elif opcion == "9":
            print("Saliendo del programa...")

        else:
            print("Opción no válida. Intente nuevamente.")


if __name__ == "__main__":
    main()

class Libro:
    def __init__(self, titulo):
        self.titulo = titulo
        self.rentado = False

    def get_titulo(self):
        return self.titulo

    def is_rentado(self):
        return self.rentado

    def set_rentado(self, rentado):
        self.rentado = rentado


class Libreria:
    def __init__(self):
        self.personas = []
        self.libros = []

    def registrar_persona(self, nombre):
        self.personas.append(Persona(nombre))

    def registrar_libro(self, titulo):
        self.libros.append(Libro(titulo))

    def realizar_renta(self, persona, libro):
        libro.set_rentado(True)
        persona.rentar_libro(libro)

    def listar_usuarios_con_libros(self):
        usuarios_con_libros = []
        for persona in self.personas:
            if persona.get_libros_rentados():
                usuarios_con_libros.append(persona)
        return usuarios_con_libros

    def listar_libros_no_rentados(self):
        libros_no_rentados = []
        for libro in self.libros:
            if not libro.is_rentado():
                libros_no_rentados.append(libro)
        return libros_no_rentados

    def listar_libros_rentados(self):
        libros_rentados = []
        for libro in self.libros:
            if libro.is_rentado():
                libros_rentados.append(libro)
        return libros_rentados

    def listar_usuarios(self):
        print("Usuarios registrados:")
        for persona in self.personas:
            print(persona.get_nombre())

    def listar_libros(self):
        print("Libros registrados:")
        for libro in self.libros:
            print(libro.get_titulo())


class Persona:
    def __init__(self, nombre):
        self.nombre = nombre
        self.libros_rentados = []

    def get_nombre(self):
        return self.nombre

    def get_libros_rentados(self):
        return self.libros_rentados

    def rentar_libro(self, libro):
        self.libros_rentados.append(libro)

