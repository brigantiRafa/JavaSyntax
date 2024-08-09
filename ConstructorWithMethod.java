public class ConstructorWithMethod {
    // Atributos
    private String modelo;
    private String cor;
    private int ano;

    // Construtor padrão
    public ConstructorWithMethod() {
        this.modelo = "Desconhecido";
        this.cor = "Desconhecida";
        this.ano = 0;
    }

    // Construtor parametrizado
    public ConstructorWithMethod(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    // Métodos Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método para exibir informações do carro
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }
}

/*Note that the constructor name must match the class name, 
and it cannot have a return type (like void).

Also note that the constructor is called when the object is created.

All classes have constructors by default: if you do not create a class constructor yourself, 
Java creates one for you. However, then you are not able to set initial values for object attributes.
*/
