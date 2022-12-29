import Projeto_Banca_Revista.Produto;


public class Main {
        public static void main(String[] args) {
            Produto ProdutoBebida1 = new Produto ();
            ProdutoBebida1.setCodigo (2323) ;
            ProdutoBebida1.setNome("Fanta");
            ProdutoBebida1.setvalorUnitario(8.23);
            ProdutoBebida1.setTipo ("Refrigerante");
            ProdutoBebida1.incluirEstoque();
            ProdutoBebida1.tirarEstoque();
            System.out.println(ProdutoBebida1);


            Produto ProdutoBebida2 = new Produto() ;
            ProdutoBebida2.setCodigo(2324);
            ProdutoBebida2.setNome("Brahma");
            ProdutoBebida2.setvalorUnitario(12.25) ;
            ProdutoBebida2.setTipo("Bebida Alcoolica");
            ProdutoBebida2.incluirEstoque();
            ProdutoBebida2.tirarEstoque();
            System.out.println(ProdutoBebida2);

            Produto ProdutoBebida3 = new Produto ();
            ProdutoBebida3.setCodigo(2325) ;
            ProdutoBebida3.setNome("Santa Ana") ;
            ProdutoBebida3.setvalorUnitario (5.54);
            ProdutoBebida3.setTipo ("Agua") ;
            ProdutoBebida3.incluirEstoque();
            ProdutoBebida3.tirarEstoque();
            System.out.println(ProdutoBebida3);

            Produto ProdutoRevista1 = new Produto ();
            ProdutoRevista1.setCodigo(1213) ;
            ProdutoRevista1.setNome("Crescer") ;
            ProdutoRevista1.setvalorUnitario (4.98);
            ProdutoRevista1.setTipo ("Bebês") ;
            ProdutoRevista1.incluirEstoque();
            ProdutoRevista1.tirarEstoque();
            System.out.println(ProdutoRevista1);

            Produto ProdutoRevista2 = new Produto ();
            ProdutoRevista2.setCodigo(1214) ;
            ProdutoRevista2.setNome("Saude") ;
            ProdutoRevista2.setvalorUnitario (7.29);
            ProdutoRevista2.setTipo ("Adulto") ;
            ProdutoRevista2.incluirEstoque();
            ProdutoRevista2.tirarEstoque();
            System.out.println(ProdutoRevista2);

            Produto ProdutoRevista3 = new Produto ();
            ProdutoRevista3.setCodigo(1215) ;
            ProdutoRevista3.setNome("Brasa") ;
            ProdutoRevista3.setvalorUnitario (9.29);
            ProdutoRevista3.setTipo ("Culinaria");
            ProdutoRevista3.incluirEstoque();
            ProdutoRevista3.tirarEstoque();
            System.out.println(ProdutoRevista3);

            Produto ProdutoDoce1 = new Produto ();
            ProdutoDoce1.setCodigo (3132)  ;
            ProdutoDoce1.setNome("Chocolate") ;
            ProdutoDoce1.setvalorUnitario (1.32);
            ProdutoDoce1.setMarca ("Garoto");
            ProdutoDoce1.incluirEstoque();
            ProdutoDoce1.tirarEstoque();
            System.out.println(ProdutoDoce1);

            Produto ProdutoDoce2 = new Produto ();
            ProdutoDoce2.setCodigo (3132)  ;
            ProdutoDoce2.setNome("Chocolate") ;
            ProdutoDoce2.setvalorUnitario (1.12);
            ProdutoDoce2.setMarca ("Nestle");
            ProdutoDoce2.incluirEstoque();
            ProdutoDoce2.tirarEstoque();
            System.out.println(ProdutoDoce2);

        }



        }