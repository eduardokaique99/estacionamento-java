import java.util.ArrayList;

public class Moto extends Veiculo{
    
    private String placa;
    private String cilindrada;

    private static ArrayList<Moto> motos = new ArrayList<>();
    
    public Moto(
        String nome,
        String placa,
        String cilindrada
    ) {
        super(GetId.getNextId(motos), nome);
        this.placa = placa;
        this.cilindrada = cilindrada;

        motos.add(this);
    }

    public String getPlaca() {
        return placa;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCor(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public static Moto getMoto(int id) throws Exception {
        for (Moto moto : motos) {
            if (moto.getId() == id) {
                return moto;
            }
        }
        throw new Exception("Carro não enconrado");
    }

    //public static void removeMoto(int id) throws Exception {
    //    Moto moto = getMoto(id);
    //    motos.remove(moto);
    //}

    @Override
    public String toString() {
        return super.toString() + "Placa: " + placa + "\n"
                                + "Cor: " + cilindrada + "\n";
    }


}

