package usuario;
import java.util.List;

import sistema.Emprestimo;
import sistema.Reserva;

public class Usuario {
  
  private String nome;
  private String login;
  private String senha;
  private int maxEmprestimos;
  private List<Emprestimo> emprestimos;
  private List<Reserva> reservas;

  public boolean estaPunido(){
    return false;
  }
}
