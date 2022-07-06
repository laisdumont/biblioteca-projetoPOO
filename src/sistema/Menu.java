package sistema;

import java.util.Scanner;

import item.Item;
import usuario.Usuario;

public class Menu {

  private boolean validate = false;
  private Usuario usuarioLogado;

  public void menuInicial(){
    int numero;

    do{
      System.out.printf("---------- Menu Inicial ----------\n");
      System.out.printf("| 1 - Funcionário                |\n");
      System.out.printf("| 2 - Usuário                    |\n");
      System.out.printf("| 3 - Acervo                     |\n");
      System.out.printf("| 4 - Informações                |\n");
      System.out.printf("| 5 - Sair                       |\n");
      System.out.printf("----------------------------------\n");
      
      Scanner entrada = new Scanner(System.in);
      System.out.printf("| Digite sua opção: \n");
      numero = entrada.nextInt();
      entrada.close();
      
      if(numero == 1 | numero == 2){
        menuLogin(numero);
      } else if(numero == 3){
        acervo();
      } else if(numero == 4){
        informacoes();
      }
    } while(numero != 5);
  }

  public void menuLogin(int tipoUsuario){
    while(this.validate == false){
      System.out.printf("-------------- Login -------------\n");
      Scanner log = new Scanner(System.in);
      System.out.printf("| Login: \n");
      String login = log.toString();
      log.close();
      Scanner key = new Scanner(System.in);
      System.out.printf("| Senha: \n");
      String senha = key.toString();
      key.close();

      Biblioteca user = new Biblioteca();
      Usuario userValidate = new Usuario();
      boolean search = false;

      for (Usuario i : user.getListaUsuarios()) {
        if(i.getLogin() == login){
          search = true;
          if(i.getSenha() == senha){
            this.validate = true;
            userValidate = i;
          } else{
            System.out.printf("Senha Incorreta!\n");
          }
        }
      }
      if(search == true && validate == true){
        if(tipoUsuario == 1){
          menuFuncionário();
        } else {
          menuUsuario();
        }
        this.usuarioLogado = userValidate;
      } else{
        search = false;
        System.out.printf("Usuário não foi encontrado! Tente Novamente!\n");
      }
    }
    validate = false;
  }

  public void acervo(){

    Biblioteca itens = new Biblioteca();

    System.out.printf("------------------------ Acervo ------------------------\n");
    for (Item i : itens.getListaItens()) {
      System.out.printf("--------------------------------------------------------\n");
      System.out.printf("| Tipo: %s", i.tipoDeItem());
      System.out.printf("| Nome: %s", i.getNome());
      System.out.printf("| Autores: %s", i.getAutores());
      System.out.printf("| Ano: %d",i.getAno());
      System.out.printf("| Status: %s / %s", i.estaEmprestado(), i.estaReservado());
      System.out.printf("--------------------------------------------------------\n");
    }

    menuInicial();
  }

  public void informacoes(){
    menuInicial();
  }

  public void menuFuncionário(){
    int numero;

    System.out.printf("-------- Menu Funcionário --------\n");
    System.out.printf("| 1 - CRUD dos Itens             |\n");
    System.out.printf("| 2 - Usuários Punidos           |\n");
    System.out.printf("| 3 - Empréstimos                |\n");
    System.out.printf("| 4 - Reservas                   |\n");
    System.out.printf("| 5 - Acervo                     |\n");
    System.out.printf("| 6 - Voltar ao menu inicial     |\n");
    System.out.printf("----------------------------------\n");
    
    Scanner entrada = new Scanner(System.in);
    System.out.printf("| Digite sua opção: \n");
    numero = entrada.nextInt();
    entrada.close();

    if(numero == 1){
      crudItem();
    } else if (numero == 2){
      usuariosPunidos();
    } else if(numero == 3){
      emprestimos();
    } else if(numero == 4){
      reservas();
    }else if(numero == 5){
      acervo();
    } else{
      menuInicial();
    }
  }

  public void menuUsuario(){

    int numero;
    System.out.printf("| Nome: %s.\n");
    System.out.printf("| Pena por atraso :\n\n");
    System.out.printf("---------- Menu Usuário ----------\n");
    System.out.printf("| 1 - Acervo                     |\n");
    System.out.printf("| 2 - Reservar                   |\n");
    System.out.printf("| 3 - Livros emprestados         |\n");
    System.out.printf("| 4 - Livros reservados          |");
    System.out.printf("| 5 - Voltar ao menu inicial     |\n");
    System.out.printf("----------------------------------\n");

    Scanner entrada = new Scanner(System.in);
    System.out.printf("| Digite sua opção: \n");
    numero = entrada.nextInt();
    entrada.close();

    if(numero == 1){

    } else if (numero == 2){

    } else if(numero == 3){
      acervo();
    } else if(numero == 4){

    } else{
      menuInicial();
    }
  }

  public void crudItem(){
    int numero;
    
    System.out.printf("-------------- Item --------------\n");
    System.out.printf("| 1 - Cadastro                   |\n");
    System.out.printf("| 2 - Remoção                    |\n");
    System.out.printf("| 3 - Voltar ao menu funcionário |\n");
    System.out.printf("----------------------------------\n");

    Scanner entrada = new Scanner(System.in);
    System.out.printf("| Digite sua opção: \n");
    numero = entrada.nextInt();
    entrada.close();

    if(numero == 1){

    } else if (numero == 2){

    } else{
      menuFuncionário();
    }
  }

  public void usuariosPunidos(){
    Biblioteca usuarios = new Biblioteca();

    System.out.printf("-------------------- Usuários Punidos ------------------\n");
    System.out.printf("--------------------------------------------------------\n");
    for (Usuario i : usuarios.getListaUsuarios()) {
      if(i.estaPunido()){
        System.out.printf("| Nome: %s.", i.getNome());
        System.out.printf("| Tempo de Punição: %s dias.", i.getDiasPunidos());
        System.out.printf("--------------------------------------------------------\n");
      }
    }
  }

  public void emprestimos(){
    Item itens = new Item();

    System.out.printf("---------------------- Emprestimos ---------------------\n");
    System.out.printf("--------------------------------------------------------\n");
    for (Emprestimo i : itens.getEmprestimos()) {
      System.out.printf("| Tipo: %s", i.getItem().tipoDeItem());
      System.out.printf("| Nome: %s", i.getItem().getNome());
      System.out.printf("| Autores: %s", i.getItem().getAutores());
      System.out.printf("| Ano: %d",i.getItem().getAno());
      System.out.printf("--------------------------------------------------------\n");
    }
  }

  public void reservas(){
    Item itens = new Item();

    System.out.printf("----------------------- Reservas -----------------------\n");
    System.out.printf("--------------------------------------------------------\n");
    for (Reserva i : itens.getReservas()) {
      System.out.printf("| Tipo: %s", i.getItem().tipoDeItem());
      System.out.printf("| Nome: %s", i.getItem().getNome());
      System.out.printf("| Autores: %s", i.getItem().getAutores());
      System.out.printf("| Ano: %d",i.getItem().getAno());
      System.out.printf("--------------------------------------------------------\n");
    }
  }
}

