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
  
  public boolean estaEmprestado(){
    return false;
  }

  public boolean estaReservado(){
    return false;
  }
}
