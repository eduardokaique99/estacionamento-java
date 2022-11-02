import java.util.ArrayList;

public abstract class Veiculo implements GetId{
    
    private int id;
    private String nome;
    
    static ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();

    protected Veiculo (int id, String nome) {
    this.id = id;
    this.nome = nome;
    
    veiculos.add(this);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Id: " + id + "\n"
            + "Nome: " + nome + "\n";
    }
}
