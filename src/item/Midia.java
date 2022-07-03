package item;

public class Midia extends Item {
  
  public Midia(int id, String nome, String autores, int ano) {
    super(id, nome, autores, ano);
  }

  @Override
  public void setPenalidadeDeAtraso(int diasAtrasados){
    super.penalidadeDeAtraso = (2 * diasAtrasados);
  }
}
