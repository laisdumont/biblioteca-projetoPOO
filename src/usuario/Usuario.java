package usuario;
import java.util.List;

import sistema.Emprestimo;
import sistema.Reserva;

public class Usuario {
  
  private String nome;
  private String login;
  private String senha;
  private int maxEmprestimos = 0;
  private int diasPunidos = 0;
  private List<Emprestimo> emprestimos;
  private List<Reserva> reservas;

  public String getNome(){
    return this.nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getLogin(){
    return this.login;
  }

  public void setLogin(String login){
    this.login = login;
  }

  public String getSenha(){
    return this.senha;
  }

  public void setSenha(String senha){
    this.senha = senha;
  }

  public int getMaxEmprestimos(){
    return this.maxEmprestimos;
  }

  public void setMaxEmprestimos(int maxEmprestimos){
    this.maxEmprestimos = maxEmprestimos;
  }

  public boolean estaPunido(){
    return false;
  }

  public int getDiasPunidos(){
    return this.diasPunidos;
  }

  public void setDiasPunidos(int diasPunidos){
    this.diasPunidos = diasPunidos;
  }
}
