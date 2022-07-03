package item;

public class Livro extends Item {
  
  public Livro(int id, String nome, String autores, int ano) {
    super(id, nome, autores, ano);
  }

  @Override
  public void setPenalidadeDeAtraso(int diasAtrasados){
    super.penalidadeDeAtraso = (3 * diasAtrasados);
  }
}
