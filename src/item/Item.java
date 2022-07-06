package item;
import java.util.ArrayList;

import sistema.Emprestimo;
import sistema.Reserva;

public class Item {
  
  private int id;
  private String nome;
  private String autores;
  private int ano;
  protected int penalidadeDeAtraso;
  private ArrayList<Integer> tempoReserva;
  private ArrayList<Emprestimo> emprestimos = new ArrayList<>();
  private ArrayList<Reserva> reservas = new ArrayList<>();
  
  public Item(){}

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

  public ArrayList<Integer> getTempoReserva(){
    return this.tempoReserva;
  }

  public void setTempoReserva(ArrayList<Integer> tempoReserva){
    this.tempoReserva = tempoReserva;
  }

  public ArrayList<Emprestimo> getEmprestimos(){
    return (ArrayList<Emprestimo>) emprestimos;
  }

  public void setEmprestimos(Emprestimo emprestimo){
    this.emprestimos.add(emprestimo);
  }

  public ArrayList<Reserva> getReservas(){
    return (ArrayList<Reserva>) this.reservas;
  }

  public void setReservas(Reserva reserva){
    this.reservas.add(reserva);
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

  public String estaEmprestado(){
    for(Emprestimo i:emprestimos){
      if(this.id == i.getItem().id){
        return "Item emprestado";
      }
    }
    return "Item no acervo";
  }

  public String estaReservado(){
    for(Reserva i: reservas){
      if(this.id == i.getItem().id){
        return "Item reservado";
      }
    }
    return "Sem revervas";
  }

  public int getPenalidadeDeAtraso(){
    return this.penalidadeDeAtraso;
  }

  public void setPenalidadeDeAtraso(){
    this.penalidadeDeAtraso = 1;
  }
}

