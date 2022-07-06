package item;

public class Midia extends Item {
  
  public Midia(int id, String nome, String autores, int ano) {
    super(id, nome, autores, ano);
  }

  @Override
  public void setPenalidadeDeAtraso(){
    super.penalidadeDeAtraso = 4;
  }
}
