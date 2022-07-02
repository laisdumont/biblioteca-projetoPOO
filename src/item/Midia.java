package item;

public class Midia extends Item {
  
  public Midia(int id, String nome, String autores, int ano) {
    super(id, nome, autores, ano);
  }

  @Override
  public int multaPorAtraso(int diasAtrasados){
    return 2*diasAtrasados;
  }
}
