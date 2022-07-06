package sistema;
import java.util.ArrayList;

import item.Item;
import usuario.Usuario;

public class Biblioteca {

  private ArrayList<Usuario> usuarios = new ArrayList<>();
  private ArrayList<Item> itens = new ArrayList<>();

  public void emprestar(Usuario usuario, Item item, ArrayList<Integer> dataExpiracao){
    if(usuario.estaPunido() == false || usuario.getMaxEmprestimos() > 0){
      Emprestimo E = new Emprestimo();
      E.setUsuario(usuario);
      E.setItem(item);
      E.setDataExpiracao(dataExpiracao);
      E.setStatus(true);
      usuario.setMaxEmprestimos(-1);
      usuario.setEmprestimos(E);
      item.setEmprestimos(E);
      System.out.printf("Livro emprestado!\n");
    } else{
      if(usuario.estaPunido() == true){
        System.out.printf("Livro não pode ser emprestado pois o usuário está punido por atraso!\n");
      } else{
        System.out.printf("Livro não pode ser emprestado pois o usuário atingiu a quantidade máxima de empréstimos!\n");
      }
    }
  }

  public void devolver(Usuario usuario, Item item, ArrayList<Integer> diaAtual){
    for(Emprestimo i: usuario.getEmprestimos()){
      if(i.getItem().getID() == item.getID()){
        i.setStatus(false);
        usuario.setMaxEmprestimos(1);
        punirAtrasos(diaAtual);
        System.out.printf("Livro devolvido!\n");
      }
    }
  }

  public void reservar(Usuario usuario, Item item, ArrayList<Integer> dataReserva){
    if(usuario.estaPunido() == false){
    Reserva E = new Reserva();
    E.setUsuario(usuario);
    E.setItem(item);
    E.setStatus(true);
    usuario.setReservas(E);
    item.setReservas(E);
    item.setTempoReserva(dataReserva);
    System.out.printf("Livro reservado!\n");
    } else{
      System.out.printf("Livro não pode ser reservado pois o usuário está punido por atraso!\n");
    }
  }

  public void renovar(Usuario usuario, Item item){
    if(usuario.estaPunido() == false){
      for(Emprestimo i: usuario.getEmprestimos()){
        if(i.getItem().getID() == item.getID()){
          i.setQntRenovado();
        }
      }
      System.out.printf("Livro renovado!\n");
    } else{
      System.out.printf("Livro não pode ser renovado pois o usuário está punido por atraso!\n");
    }
  }

  public void punirAtrasos(ArrayList<Integer> dataAtual){
    for(Usuario i: this.usuarios){
      for(Emprestimo j: i.getEmprestimos()){
        if(j.getStatus() == true){
          if(j.getDataExpiracao().get(2) <= dataAtual.get(2)){
            if(j.getDataExpiracao().get(1) <= dataAtual.get(1)){
              if(j.getDataExpiracao().get(0) <= dataAtual.get(0)){

              }else{
                i.setDiasPunidos(j.getItem().getPenalidadeDeAtraso());
              }
            }else{
              i.setDiasPunidos(j.getItem().getPenalidadeDeAtraso());
            }
          } else{
            i.setDiasPunidos(j.getItem().getPenalidadeDeAtraso());
          }
        }
      }
    }
  }

  public void limparReservas(ArrayList<Integer> dataAtual){
    for(Usuario i: this.usuarios){
      for(Reserva j: i.getReservas()){
        if(j.getStatus() == true){
          if(j.getItem().getTempoReserva().get(2) <= dataAtual.get(2)){
            if(j.getItem().getTempoReserva().get(1) <= dataAtual.get(1)){
              if(j.getItem().getTempoReserva().get(0) <= dataAtual.get(0)){

              }else{
                j.setStatus(false);
              }
            }else{
              j.setStatus(false);
            }
          } else{
            j.setStatus(false);
          }
        }
      }
    }
  }

  public void cadastrarItem(int id, String nome, String autores, int ano){
    Item item = new Item(id, nome, autores, ano);
    this.itens.add(item);
  }

  public void cadastrarUsuario(String nome, String login, String senha){
    Usuario usuario = new Usuario(nome, login, senha);
    this.usuarios.add(usuario);
  }

  public ArrayList<Usuario> getListaUsuarios(){
    return (ArrayList<Usuario>) usuarios;
  }

  public void setListaUsuarios(Usuario usuario){
    this.usuarios.add(usuario);
  }

  public ArrayList<Item> getListaItens(){
    return (ArrayList<Item>) itens;
  }

  public void setListaItens(Item item){
    this.itens.add(item);
  }
}