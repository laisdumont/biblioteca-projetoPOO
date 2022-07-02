package item;

public class Periodico extends Item {
  
  public Periodico(int id, String nome, String autores, int ano) {
    super(id, nome, autores, ano);
  }

  @Override
  public int multaPorAtraso(int diasAtrasados){
    return 5*diasAtrasados;
  }
}
