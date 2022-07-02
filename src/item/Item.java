package item;
import java.util.List;

import sistema.Emprestimo;
import sistema.Reserva;

public class Item {
  
  private int id;
  private String nome;
  private String autores;
  private int ano;
  private double penalidadeDeAtraso;
  private double tempoReserva;
  private List<Emprestimo> emprestimos;
  private List<Reserva> reservas;
  
  public Item(int id, String nome, String autores, int ano){
    this.id = id;
    this.nome = nome;
    this.autores = autores;
    this.ano = ano;
  }

  public int getID(){
    return this.id;
  }

  public void setID(int id){
    this.id = id;
  }

  public String getNome(){
    return this.nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }
  
  public String getAutores(){
    return this.autores;
  }

  public void setAutores(String autores){
    this.autores = autores;
  }

  public int getAno(){
    return this.ano;
  }

  public void setAno(int ano){
    this.ano = ano;
  }

  public String tipoDeItem(){
    if(id == 1){
      return "Livro";
    }
    if(id == 2){
      return "Mídia";
    }
    if(id == 3){
      return "Monografia";
    }
    return "Periódico";
  }

  public boolean estaEmprestado(){
    return false;
  }

  public boolean estaReservado(){
    return false;
  }

  public int multaPorAtraso(int diasAtrasados){
    return diasAtrasados;
  }
}
