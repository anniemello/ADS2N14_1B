package com.senac.mvc.controller;



import com.senac.mvc.model.*;
import com.senac.mvc.view.PessoaView;

import java.util.Random;

public class PessoaController {

  private Pessoa pessoa = new Pessoa();
  private Random random = new Random();
  private PessoaView pessoaview =  new PessoaView();

  public String gerarTelefoneAleatorio() {
      return (random.nextInt(1000-100)+100) + "-" + (random.nextInt(10000-1000)+1000);
  }
  

  private String gerarNomeAleatorio() {
      String nome[] = {"Annie","Willy","Rui","Leonardo","Bruna","Valeria","Morgana"};
      int nomealeatorio = random.nextInt(nome.length);
      return nome[nomealeatorio]; 
  }

  private String gerarSobrenomeAleatorio() {
      String sobrenome[] = {"Mello Machado","Silva Souza","Hass Hoffman","Santos Ferreira","Carpaneda Saragossa"};
      int sobrenomealeatorio = random.nextInt(sobrenome.length);
      return sobrenome[sobrenomealeatorio];
  }
  private String gerarEnderecoAleatorio() {
      String endereco[] = {"Rua Lydia Moschetti 175","Rua Domingos Varela 404","Rua Antonio Nunes Vicente 135",};
      int enderecoaleatorio = random.nextInt(endereco.length);
      return endereco[enderecoaleatorio];
  }
  
  public void resultadoAleatorio() {
      for(int i = 0; i < 50; i++) {
    	  String resultadoNomeAleatorio = gerarNomeAleatorio() + " " + gerarSobrenomeAleatorio() + "  ";
          gerarPessoa(resultadoNomeAleatorio, gerarTelefoneAleatorio(), gerarEnderecoAleatorio());
          this.pessoaview.imprimeDados(pessoa.getNome(),pessoa.getTelefone(), pessoa.getEndereco());
      }
      
      
  }
 
  public void gerarPessoa(String nome, String telefone, String endereco) {
      pessoa.setNome(nome);
      pessoa.setTelefone(telefone);
      pessoa.setEndereco(endereco);
  }
  
 
}