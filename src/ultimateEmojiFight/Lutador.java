package ultimateEmojiFight;

public class Lutador implements ILutador {
    private String nome, nacionalidade,categoria;
    private  int idade,vitorias,derrotas,empates;
    private float altura;
    private float peso;


    //CONSTRUTOR

    public Lutador(String nome, String nacionalidade, int idade, int vitorias, int derrotas, int empates, float altura, float peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.altura = altura;
        this.setPeso(peso);
    }


    // METODOS ESPECIAIS

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();

    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria= "Invalido";
        }else if(this.peso <= 70.13){
            this.categoria = "Leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Médio";
        }else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria ="Inválida";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
//METODOS INTERFACE
    @Override
    public void apresentar() {

        System.out.println("Lutador: "+ this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Vitorias: "+ this.getVitorias());
        System.out.println("Derrotas: "+ this.getDerrotas());
        System.out.println("Empates: "+ this.getEmpates());

    }

    @Override
    public void status() {
        System.out.print("Lutador "+ this.getNome());
        System.out.print(" é um peso " + this.getCategoria());
        System.out.print(" Vitorias: "+ this.getVitorias());
        System.out.print(" Derrotas: "+ this.getDerrotas());
        System.out.print(" Empates: "+ this.getEmpates());
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(getEmpates() + 1);
    }
}
