package Projeto_Banca_Revista;

public class Bebida extends Produto {
    private String Tipo;

    public Bebida(int codigo, String nome, String tipo) {
        super(codigo, nome);
        Tipo = tipo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }
}
