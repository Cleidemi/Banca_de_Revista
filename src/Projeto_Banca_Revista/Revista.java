package Projeto_Banca_Revista;

public class Revista extends Produto{
    private String Editora;

    public Revista(int codigo, String nome, String editora) {
        super(codigo, nome);
        Editora = editora;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String editora) {
        Editora = editora;
    }
}
