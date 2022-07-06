package usuario;
import java.util.ArrayList;

import sistema.Emprestimo;
import sistema.Reserva;

public class Usuario {
  
  private String nome;
  private String login;
  private String senha;
  protected int maxEmprestimos;
  protected int diasEmprestimos;
  private int diasPunidos;
  private ArrayList<Emprestimo> emprestimos = new ArrayList<>();
  private ArrayList<Reserva> reservas = new ArrayList<>();

  public Usuario(){}

  public Usuario(String nome, String login, String senha){
    this.nome = nome;
    this.login = login;
    this.senha = senha;
  }

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
    this.maxEmprestimos += maxEmprestimos;
  }

  public boolean estaPunido(){
    return false;
  }

  public int getDiasEmprestimos(){
    return this.diasEmprestimos;
  }

  public void setDiasEmprestimos(int diasEmprestimos){
    this.diasEmprestimos = diasEmprestimos;
  }

  public int getDiasPunidos(){
    return this.diasPunidos;
  }

  public void setDiasPunidos(int diasPunidos){
    this.diasPunidos = diasPunidos;
  }

  public ArrayList<Emprestimo> getEmprestimos(){
    return (ArrayList<Emprestimo>) this.emprestimos;
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
}
