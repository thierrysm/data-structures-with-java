package arrays;

public class Test {
    public static void main(String[] args) {
        MyArray<String> arrayString = new MyArray<String>(5);

        arrayString.add("A");
        arrayString.add("B");
        arrayString.add("C");
        arrayString.add("DD");
        System.out.println("imprimindo array: " + arrayString);
        System.out.println("metodo get:  " + arrayString.get(1));

        arrayString.add(1, "AA2");
        arrayString.remove(3);

        System.out.println("buscando elemento com base no parâmetro: " + arrayString.getByValue("C"));


        System.out.println("imprimindo array: " + arrayString);
        System.out.println("tamanho do array: " + arrayString.getSize());

        arrayString.add("Cddd");
        arrayString.add("DDccc");
        System.out.println("tamanho do array: " + arrayString.getSize());
        arrayString.add("ttttt");
        System.out.println("tamanho do array: " + arrayString.getSize());
        arrayString.add("ttttt");

        System.out.println("imprimindo array: " + arrayString);

        // Inteiros
        MyArray<Integer> arrayInteger = new MyArray<Integer>(3);
        arrayInteger.add(1);
        arrayInteger.add(33);

        System.out.println("imprimindo array de inteiros: " + arrayInteger);
    }
}
