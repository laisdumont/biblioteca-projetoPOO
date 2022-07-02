package sistema;
import java.util.ArrayList;
import java.util.List;

import item.Item;
import usuario.Usuario;

public class Biblioteca {

  private List<Usuario> usuarios;
  private List<Item> itens;

  public void emprestar(Usuario usuario, Item item){

  }

  public void devolver(Usuario usuario, Item item){
    
  }

  public void reservar(Usuario usuario, Item item){
    
  }

  public void renovar(Usuario usuario, Item item){
    
  }

  public void punirAtrasos(){

  }

  public void limparReservas(){
    
  }

  public ArrayList<Usuario> getListaUsuarios(){
    return (ArrayList<Usuario>) usuarios;
  }

  public void setListaUsuarios(Usuario usuario){
    this.usuarios.add(usuario);
  }

  public ArrayList<Item> getListaitems(){
    return (ArrayList<Item>) itens;
  }

  public void setListaItems(Item item){
    this.itens.add(item);
  }
}