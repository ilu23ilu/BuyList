import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> product = new ArrayList<>();
        int countAddProduct = 0;

        while (true) {
            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1 Операция \"добавить\"");
            System.out.println("2 Операция \"показать\"");
            System.out.println("3 Операция \"удалить\"");
            System.out.println("4 Операция \"найти\"");
            String input = scanner.nextLine();
            System.out.println();

            switch (input) {
                case "1":
                    System.out.println("Какую покупку хотите добавить?");
                    String addProduct = scanner.nextLine();
                    product.add(addProduct);
                    countAddProduct++;
                    System.out.println("Итого в списке покупок: " + countAddProduct);
                    break;
                case "2":
                    System.out.println("Список покупок:");
                    for (int i = 0; i < product.size(); i++) {
                        System.out.println((i + 1) + " " + product.get(i));
                    }
                    break;
                case "3":
                    System.out.println("Список покупок:");
                    for (int i = 0; i < product.size(); i++) {
                        System.out.println((i + 1) + " " + product.get(i));
                    }
                    System.out.println("Какую хотите удалить? Введите номер или название");
                    String delProduct = scanner.next();
                    try {
                        int delProductByNumber = Integer.parseInt(delProduct);
                        for (int j = 0; j < product.size(); j++) {
                            if (delProductByNumber == j + 1) {
                                String temp = product.remove(j);
                                System.out.println("Продукт " + temp + " удален. Список покупок:");
                            }
                        }
                        countAddProduct--;
                    } catch (NumberFormatException e) {
                        for (int j = 0; j < product.size(); j++) {
                            if (delProduct.equals(product.get(j))) {
                                product.remove(product.get(j));
                                System.out.println("Продукт " + delProduct + " удален. Список покупок:");
                            }
                        }
                        countAddProduct--;
                    }
                    for (int i = 0; i < product.size(); i++) {
                        System.out.println((i + 1) + " " + product.get(i));
                    }
                    break;
                case "4":
                    System.out.println("Введите текст для поиска:");
                    String findProduct = scanner.nextLine();
                    System.out.println("Найдено:");
                    for (int i = 0; i < product.size(); i++) {
                        if (product.get(i).toLowerCase().contains(findProduct.toLowerCase())) {
                            System.out.println((i + 1) + " " + product.get(i));
                        }
                    }
                    break;
            }
        }

    }
}
