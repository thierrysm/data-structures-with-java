package arrays;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        System.out.println("==== Testando array de Strings ====");

        MyArray<String> arrayString = new MyArray<>(5);
        ArrayList<String> test = new ArrayList<>();
        test.add("3");
        System.out.println("test ulitmo " + test.getLast());


        // Adicionando elementos
        arrayString.add("A");
        arrayString.add("B");
        arrayString.add("C");
        arrayString.add("DD");

        System.out.println("Array inicial: " + arrayString);
        System.out.println("Elemento na posição 1 (get): " + arrayString.get(1));

        // Inserindo em posição específica
        arrayString.add(1, "AA2");
        System.out.println("Após inserir 'AA2' na posição 1: " + arrayString);

        // Removendo elemento
        arrayString.remove(3); // remove o antigo "C"
        System.out.println("Após remover elemento na posição 3: " + arrayString);

        // Buscando elemento por valor
        System.out.println("Busca por valor 'B' (get): " + arrayString.get("B"));

        // Tamanho atual
        System.out.println("Tamanho atual do array: " + arrayString.getSize());

        // Testando aumento de capacidade
        arrayString.add("Cddd");
        arrayString.add("DDccc");
        arrayString.add("ttttt");
        arrayString.add("zzzzz");
        System.out.println("Array após várias adições (com resize): " + arrayString);
        System.out.println("Tamanho final do array: " + arrayString.getSize());

        // Testando metodo getLast()
        System.out.println("Metodo getLast(): " + arrayString.getLast());

        // Testando metodo clear()
        arrayString.clear();
        System.out.println("Array apos metodo clear(): " + arrayString);

        // Testando array de inteiros
        System.out.println("\n==== Testando array de Integers ====");
        MyArray<Integer> arrayInteger = new MyArray<>(3);

        arrayInteger.add(1);
        arrayInteger.add(33);
        System.out.println("Array de inteiros: " + arrayInteger);

        // contém no array
        System.out.println("Metodo contains: (33): " + arrayInteger.contains(33));
        // não contém no array
        System.out.println("Metodo contains: (20): " + arrayInteger.contains(20));
    }
}
