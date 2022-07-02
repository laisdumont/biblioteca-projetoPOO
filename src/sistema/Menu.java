package sistema;

import java.util.Scanner;

import item.Item;
import usuario.Usuario;

public class Menu {
  private boolean validate = false;
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
        // menuLogin(validate);
      } else if(numero == 3){
        acervo();
      } else if(numero == 4){
        informacoes();
      }
    } while(numero != 5);
  }

  public Usuario menuLogin(){
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
        return userValidate;
      } else{
        search = false;
        System.out.printf("Usuário não foi encontrado! Tente Novamente!\n");
      }
    }
    validate = false;
    return null;
      
  }

  public void acervo(){

    Biblioteca itens = new Biblioteca();

    System.out.printf("------------------------ Acervo ------------------------\n");
    for (Item i : itens.getListaitems()) {
      System.out.printf("--------------------------------------------------------\n");
      System.out.printf("| Tipo: %s", i.tipoDeItem());
      System.out.printf("| Nome: %s", i.getNome());
      System.out.printf("| Autores: %s", i.getAutores());
      System.out.printf("| Ano: %d",i.getAno());
      System.out.printf("--------------------------------------------------------\n");
    }

    menuInicial();
  }

  public void informacoes(){
    menuInicial();
  }
}

