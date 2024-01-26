public class Personagem {

    private String nome;
    private int idade;
    private int força;
    private int inteligência;
    private int carisma;
    private int habilidadeFisica;

    public Personagem(String nome, int idade, int força, int inteligência, int carisma, int habilidadeFisica) {
        this.nome = nome;
        this.idade = idade;
        this.força = força;
        this.inteligência = inteligência;
        this.carisma = carisma;
        this.habilidadeFisica = habilidadeFisica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getForça() {
        return força;
    }

    public void setForça(int força) {
        this.força = força;
    }

    public int getInteligência() {
        return inteligência;
    }

    public void setInteligência(int inteligência) {
        this.inteligência = inteligência;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public int getHabilidadeFisica() {
        return habilidadeFisica;
    }

    public void setHabilidadeFisica(int habilidadeFisica) {
        this.habilidadeFisica = habilidadeFisica;
    }
}
