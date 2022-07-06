package sistema;
import java.util.ArrayList;

import item.Item;
import usuario.Usuario;

public class Emprestimo {
  
  private Usuario usuario;
  private Item item;
  private int qntRenovado = 0;
  private ArrayList<Integer> dataExpiracao = new ArrayList<>();
  private boolean status;

  public Item getItem(){
    return this.item;
  }

  public void setItem(Item item){
    this.item = item;
  }

  public Usuario getUsuario(){
    return this.usuario;
  }

  public void setUsuario(Usuario usuario){
    this.usuario = usuario;
  }

  public boolean getStatus(){
    return this.status;
  }

  public void setStatus(boolean status){
    this.status = status;
  }
  
  public int getQntRenovado(){
    return this.qntRenovado;
  }

  public void setQntRenovado(){
    this.qntRenovado += 1;
  }

  public ArrayList<Integer> getDataExpiracao(){
    return this.dataExpiracao;
  }

  public void setDataExpiracao(ArrayList<Integer> dataEmprestimo){
    int diasEmprestados = this.usuario.getDiasEmprestimos();
    int dia = diasEmprestados + dataEmprestimo.get(0);
    int mes = dataEmprestimo.get(1), ano = dataEmprestimo.get(2);
    if(dia > 30){
      dia = 0;
      mes += 1;
      if(mes > 12){
        mes = 1;
        ano += 1;
      }
    }
    ArrayList<Integer> dataExpiracao = new ArrayList<Integer>();
    dataExpiracao.add(dia);
    dataExpiracao.add(mes);
    dataExpiracao.add(ano);
    this.dataExpiracao = dataExpiracao;
  }
}
