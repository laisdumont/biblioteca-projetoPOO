package usuario;

public class UsuarioEspecial extends Usuario {
  
  public UsuarioEspecial(String nome, String login, String senha){
    super(nome, login, senha);
    super.diasEmprestimos = 10;
    super.maxEmprestimos = 10;
  }
}
