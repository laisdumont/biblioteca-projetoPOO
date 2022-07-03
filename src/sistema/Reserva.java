package sistema;
import item.Item;
import usuario.Usuario;

public class Reserva {
  
  private Usuario usuario;
  private Item item;
  private boolean status;

  public Item getItem(){
    return this.item;
  }

  public void setItem(Item item){
    this.item = item;
  }
}
