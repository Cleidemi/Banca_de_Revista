package Projeto_Banca_Revista;

public class Produto {

    public String Bebida;
    //atributos
    private int codigo;
    private String nome;
    private int estoque;
    private double valorUnitario;

    //construtor
        public Produto (int codigo, String nome){
            this.codigo=codigo;
            this.nome=nome;
        }
        // Encapsulamento
        public int getCodigo (){
            return codigo;
        }
        public void setCodigo (int codigo) {
            this.codigo = codigo;
        }
        public String getNome () {
            return nome;
        }
        public void setNome (String nome){
            this.nome=nome;
        }
        public int getEstoque() {
            return estoque;
        }
        public double getvalorUnitario() {
            return valorUnitario;
        }
        public void setvalorUnitario (double valorUnitario) {
            this.valorUnitario = valorUnitario;
        }
        //Métodos
        public void incluirEstoque (int quantidade) {
            estoque = estoque + quantidade;
        }
        public void tirarEstoque (int quantidade){
            if (quantidade <=estoque) {
                estoque = estoque - quantidade;
            }else
            {
                System.out.println ("Estoque Indisponível!");
            }


    }

    public double getTipo() {
    }

    public String setTipo() {
    }

    public void setMarca() {
    }

    }
}

Brasil@2022