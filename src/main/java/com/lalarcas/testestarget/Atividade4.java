package com.lalarcas.testestarget;

import java.util.HashMap;
import java.util.Map;

public class Atividade4 {
	public static void main(String[] args) {
		Map<String, Double> dados = new HashMap<String, Double>();
		dados.put("SP", 67836.43);
        dados.put("RJ", 36678.66);
        dados.put("MG", 29229.88);
        dados.put("ES", 27165.48);
        dados.put("Outros", 19849.53);
        
        double valorTotal = 0.0;
        for (double valor : dados.values()) {
            valorTotal += valor;
        }
        System.out.println("Valor Total: R$" + valorTotal);

        for (Map.Entry<String, Double> entry : dados.entrySet()) {
            String estado = entry.getKey();
            double valorEstado = entry.getValue();
            double percentual = (valorEstado / valorTotal) * 100;
            System.out.printf("%s: %.2f%% (R$%.2f)%n", estado, percentual, valorEstado);
        }
	}
}
