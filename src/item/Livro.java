package item;

public class Livro extends Item {
  
  public Livro(int id, String nome, String autores, int ano) {
    super(id, nome, autores, ano);
  }

  @Override
  public int multaPorAtraso(int diasAtrasados){
    return 3*diasAtrasados;
  }
}
