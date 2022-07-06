import java.util.ArrayList;

import item.Item;
import item.Livro;
import item.Midia;
import item.Monografia;
import item.Periodico;
import sistema.Biblioteca;
import usuario.Usuario;
import usuario.UsuarioComum;
import usuario.UsuarioEspecial;

public class App {
    public static void main(String[] args) throws Exception {
        Biblioteca sistema = new Biblioteca();

        sistema.cadastrarItem(123, "História", "Zezinho", 1968);
        sistema.cadastrarItem(456, "Matemática", "Niliques", 1990);
        sistema.cadastrarItem(890, "Inglês", "Aroldo", 2000);
       
        sistema.cadastrarItem(213, "Caixas de paz", "Lelinho", 1958);
        sistema.cadastrarItem(564, "História do Cinema", "Fininho", 1868);
        sistema.cadastrarItem(789, "História", "Otavinho", 1998);

        sistema.cadastrarItem(321, "Como eu cheguei aqui?", "ginho", 1968);
        sistema.cadastrarItem(546, "História da Vida", "uinho", 1968);
        sistema.cadastrarItem(987, "Pão com fatiaz de abacaxi hipoclorito", "Zezinho", 1968);

        sistema.cadastrarItem(231, "História do Mundo", "Zezinho", 1968);
        sistema.cadastrarItem(465, "Malharias", "Zezinho", 1968);
        sistema.cadastrarItem(970, "Computação Gráfica", "Zezinho", 1968);

        sistema.cadastrarUsuario("Dumont", "dumont02", "12jd");
        sistema.cadastrarUsuario("Lais", "lais02", "1223");
        sistema.cadastrarUsuario("Ana", "ana02", "1235");
        sistema.cadastrarUsuario("Duarte", "duarte02", "1243");

        ArrayList<Integer> dia = new ArrayList<>();
        dia.add(0, 12);
        dia.add(1, 10);
        dia.add(2, 2021);

        sistema.reservar(sistema.getListaUsuarios().get(0), sistema.getListaItens().get(1), dia);
        sistema.emprestar(sistema.getListaUsuarios().get(1), sistema.getListaItens().get(4), dia);
        sistema.emprestar(sistema.getListaUsuarios().get(2), sistema.getListaItens().get(5), dia);
        sistema.emprestar(sistema.getListaUsuarios().get(3), sistema.getListaItens().get(7), dia);

        System.out.printf("------------------------ Acervo ------------------------\n");
        for (Item i : sistema.getListaItens()) {
            System.out.printf("--------------------------------------------------------");
            System.out.printf("\n| Tipo: %s", i.tipoDeItem());
            System.out.printf("\n| Nome: %s", i.getNome());
            System.out.printf("\n| Autores: %s", i.getAutores());
            System.out.printf("\n| Ano: %d",i.getAno());
            System.out.printf("\n| Status: %s / %s", i.estaEmprestado(), i.estaReservado());
            System.out.printf("\n--------------------------------------------------------\n");
        }

    }
}
