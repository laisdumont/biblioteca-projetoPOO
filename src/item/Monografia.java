package item;

public class Monografia extends Item {
  
  public Monografia(int id, String nome, String autores, int ano) {
    super(id, nome, autores, ano);
  }

  @Override
  public void setPenalidadeDeAtraso(){
    super.penalidadeDeAtraso = 8;
  }
}
