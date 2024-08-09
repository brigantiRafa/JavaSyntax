public class ConstructorTwo {
    public static void main(String[] args) {
        // Usando o construtor padrão
        ConstructorWithMethod carro1 = new ConstructorWithMethod();
        carro1.exibirInformacoes();
        
        // Usando o construtor parametrizado
        ConstructorWithMethod carro2 = new ConstructorWithMethod("Fusca", "Azul", 1974);
        carro2.exibirInformacoes();
    }
}

/*Note that the constructor name must match the class name, 
and it cannot have a return type (like void).

Also note that the constructor is called when the object is created.

All classes have constructors by default: if you do not create a class constructor yourself, 
Java creates one for you. However, then you are not able to set initial values for object attributes.
*/

