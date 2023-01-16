import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, Product> product = new HashMap<>();
        product.put("123457", new Product("Яблоки")); //key - уникальный штрих-код
        product.put("357134", new Product("Авокадо"));
        product.put("481278", new Product("Мандарины"));
        product.put("998723", new Product("Мандарины"));
        product.put("339254", new Product("Молоко"));

        for (Map.Entry<String, Product> item : product.entrySet()) {
            System.out.printf("%s %s \n", item.getKey(), item.getValue().getNameProduct());
        }
        Set<String>keys = product.keySet(); //набор ключей
        System.out.println(keys);

        /*Collection <Product> value = product.values();
        System.out.println(value); //на экран вывелись не названия, а ссылки*/

        ArrayList<Product>valueProduct = new ArrayList<>(product.values());//набор значений
        Iterator<Product>iter = valueProduct.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next().getNameProduct());
        }
    }
}