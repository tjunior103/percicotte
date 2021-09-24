/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regra_negocio;

import entidade.Cartao;

/**
 *
 * @author Silvio
 */
public class CartaoNegocio {

    public void cadastrarCartao(Cartao cartao) {
        cartao.setSenha(gerarSenha());
        cartao.setNumero(gerarBandeiraCartao());
        cartao.setBandeira(gerarNumeroCartao());
    }

    private String gerarSenha() {
        String senha = "";
        String[] letras = {"a", "b", "c", "d", "e",
            "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
            "s", "t", "u", "v", "w", "x",
            "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
            "L", "M", "N", "O", "P", "Q",
            "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3",
            "4", "5", "6", "7", "8", "9"};
        int tamanho = letras.length;
        int indice;
        for (int i = 0; i < 4; i++) {
            indice = (int) (Math.random() * tamanho);
            senha = senha + letras[indice];
        }
        return senha;
    }

    private String gerarBandeiraCartao() {
        String[] bandeiras = {"Master", "Visa", "American Express"};
        int indice = (int) (Math.random() * bandeiras.length);
        return bandeiras[indice];
    }

    private String gerarNumeroCartao() {
        String numero = "";
        int indice;
        for (int i = 0; i < 16; i++) {
            indice = (int) (Math.random() * 10);
            if (i % 4 == 0 && i > 0) {
                numero = numero + "-" + indice;
            } else {
                numero = numero + indice;
            }
        }
        return numero;
    }

    public String fazerComprar(double valor, Cartao cartao) {

        if (valor > cartao.getCredito()) {
            return "Saldo Insuficiênte";
        } else {
            cartao.setSaldo(cartao.getSaldo() - valor);
            cartao.setCredito(cartao.getCredito() - valor);
            
            System.out.println("Crédito: " + cartao.getCredito());
            System.out.println("Saldo: " + cartao.getSaldo());
            System.out.println("");
            return "Compra efetuada com sucesso!!";
        }
        
    }
    
    public String fazerPagamento(double valor, Cartao cartao) {
        double valorMinimo = cartao.getSaldo() * 0.1;
        if (valor < valorMinimo) {
            return "O valor do pagamento deve ser maior que o mínimo!!";
        } else {
            cartao.setSaldo(cartao.getSaldo() + valor);
            cartao.setCredito(cartao.getCredito() + valor);
            
            System.out.println("Crédito: " + cartao.getCredito());
            System.out.println("Saldo: " + cartao.getSaldo());
            System.out.println("");
            return "Pagamento efetuado com sucesso!!";
        }
        
    }

}
