package sistema;
import item.Item;
import usuario.Usuario;

public class Emprestimo {
  
  private Usuario usuario;
  private Item item;
  private int qntRenovado;
  private String dataExpiracao;
  private boolean status;

  public Item getItem(){
    return this.item;
  }

  public void setItem(Item item){
    this.item = item;
  }
}
