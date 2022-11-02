import java.util.ArrayList;

public class Vaga implements GetId{
    
    private int id;
    private int numero;
    private String tipo;
    private String tamanho;
    private float preco;

    static ArrayList<Vaga> vagas = new ArrayList<>();

    public Vaga(int numero, String tipo, String tamanho, float preco) {
        this.id = GetId.getNextId(vagas);
        this.numero = numero;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.preco = preco;

        vagas.add(this);
    }

    public int getId() {
        return id;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public float getPreco() {
        return preco;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public static ArrayList<Vaga> getVaga() {
        return vagas;
    }

    public static Vaga getVaga(int id) throws Exception {
        for (Vaga vaga : vagas) {
            if (vaga.getId() == id) {
                return vaga;
            }
        }
        throw new Exception("Vaga não encontrada");
    }

    //public static void removeVaga(int id) throws Exception {
    //    Vaga vaga = getVaga(id);
    //    vagas.remove(vaga);
    //}

    @Override
    public String toString() {
        return "Id: " + id + "\n"
            + "Número: " + numero + "\n"
            + "Tipo: " + tipo + "\n"
            + "Tamanho: " + tamanho + "\n"
            + "Preço: " + preco + "\n";
    }

}
