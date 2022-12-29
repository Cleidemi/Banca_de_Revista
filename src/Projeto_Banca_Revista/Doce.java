package Projeto_Banca_Revista;

public class Doce extends Produto{
    private String Marca;

    public Doce(int codigo, String nome, String marca) {
        super(codigo, nome);
        Marca = marca;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }
}
