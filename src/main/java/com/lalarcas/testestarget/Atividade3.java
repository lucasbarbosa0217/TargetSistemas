package com.lalarcas.testestarget;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Atividade3 {
    public static void main(String[] args) {
        File jsonFile = new File("src/main/resources/faturamento_mensal.json");
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Map<String, List<Map<String, Double>>> jsonData = objectMapper.readValue(jsonFile, Map.class);
            List<Map<String, Double>> faturamentoList = jsonData.get("faturamento_mensal");

            if (faturamentoList.isEmpty()) {
                System.out.println("Não há dados de faturamento disponíveis.");
                return;
            }

            double soma = 0.0;
            double menor = Double.MAX_VALUE;
            double maior = Double.MIN_VALUE;
            int diasMaiorQueMedia = 0;

            for (Map<String, Double> faturamentoDia : faturamentoList) {
                double faturamento = faturamentoDia.get("faturamento");
                soma += faturamento;

                if (faturamento < menor) {
                    menor = faturamento;
                }
                if (faturamento > maior) {
                    maior = faturamento;
                }
            }

            double media = soma / faturamentoList.size();

            for (Map<String, Double> faturamentoDia : faturamentoList) {
                if (faturamentoDia.get("faturamento") > media) {
                    diasMaiorQueMedia++;
                }
            }

            System.out.println("O menor valor de faturamento ocorrido em um dia do mês: " + menor);
            System.out.println("O maior valor de faturamento ocorrido em um dia do mês: " + maior);
            System.out.println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal: " + diasMaiorQueMedia);

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo JSON: " + e.getMessage());
        }
    }
}
