package map;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        // Criando um mapa que associa nomes (String) a idades (Integer)
        Map<String, Integer> map = new HashMap<>();

        // Adicionando pares chave-valor
        map.put("Pedro", 17);
        map.put("Maria", 23);
        map.put("Souza", 36);
        map.put("Souza", 44); // Sobrescreve o valor anterior da chave "Souza"

        System.out.println("Mapa completo:");
        System.out.println(map); // Exibe o conteúdo do mapa

        System.out.println("\n--- Imprimindo apenas as chaves (keySet) ---");
        for (String key : map.keySet()) {
            System.out.println("Chave: " + key);
        }

        System.out.println("\n--- Imprimindo apenas os valores (values) ---");
        for (Integer value : map.values()) {
            System.out.println("Valor: " + value);
        }

        System.out.println("\n--- Imprimindo chaves e valores (entrySet) ---");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Chave: " + entry.getKey() + " | Valor: " + entry.getValue());
        }
    }
}
