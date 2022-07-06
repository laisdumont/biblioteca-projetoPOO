package usuario;

public class UsuarioComum extends Usuario {

  public UsuarioComum(String nome, String login, String senha){
    super(nome, login, senha);
    super.maxEmprestimos = 5;
    super.diasEmprestimos = 7;
  }
}
