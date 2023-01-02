package org.example;

import javax.sound.sampled.Line;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException {
        Notebooks notebook1 = new Notebooks("Asus", 32, 16, 1499.99, "Windows",
                "Intel Core I5", 500);
        Notebooks notebook2 = new Notebooks("Acer", 64, 32, 1799.99, "Windows",
                "Intel Core I7", 1000);

        Notebooks notebook3 = new Notebooks("Apple", 16, 14, 1599.99, "macOS",
                "M1 Pro", 512);

        Set<Notebooks> notebooks = new HashSet<>();
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        Map<Integer, String> map = new HashMap<>();
        Set<String> Laptops = new HashSet<>();
        map.put(1, "RAM");
        map.put(2, "screenSize");
        map.put(3, "price");
        map.put(4, "operatingSystem");
        map.put(5, "processorModel");
        map.put(6, "storageCapacity");
        Scanner scanner = new Scanner(System.in);
        Map<String, Object> criteria = new HashMap<>();
        System.out.println("Enter the number that corresponds to the desired criterion : " + map);
        int criteries = scanner.nextInt();
        scanner.nextLine();


        switch (criteries) {
            case 1:
                System.out.println("Choose the RAM(gigabytes) from the list: 16, 32, 64");
                int ramSize = scanner.nextInt();
                criteria.put("RAM", ramSize);
                break;
            case 2:
                System.out.println("Choose the screenSize(inches) from the list: 14, 16, 32");
                int screenSize = scanner.nextInt();
                criteria.put("screenSize", screenSize);
                break;
            case 3:
                System.out.println("Choose the price (EUR) from the list: 1499.99, 1599.99, 1799.99 ");
                Double price = Double.parseDouble(scanner.next());
                criteria.put("price", price);
                break;
            case 4:
                System.out.println("Which OS do you prefer? Windows or macOS  :");
                String os = scanner.next();
                criteria.put("operatingSystem", os);
                break;
            case 5:
                System.out.println("Which processor do you prefer : Intel Core I5, Intel Core I7 or Apple M1 Pro ");
                String processor;
                processor = scanner.nextLine();
                processor.split(" ");
                criteria.put("processorModel", processor);
                break;
            case 6:
                System.out.println("Choose the the storage(Gigabytes) Capacity : 500, 512, 1000");
                Integer storage = scanner.nextInt();
                criteria.put("storageCapacity", storage);
                break;
            default:
                System.out.println("Invalid input. Please enter a valid number.");
                break;
        }

        for (Notebooks notebook : notebooks) {

            boolean isMatching = false;
            for (Map.Entry<String, Object> entry : criteria.entrySet()) {

                String criter = entry.getKey();
                Object value = entry.getValue();

                if (criter.equals("RAM") && (notebook.getRAM().equals(value))) {
                    isMatching = true;

                }
                if (criter.equals("screenSize") && (notebook.getScreenSize().equals(value))) {
                    isMatching = true;

                }

                if (criter.equals("price") && (notebook.getPrice().equals(value))) {
                    isMatching = true;

                }
                if (criter.equals("operatingSystem") && (notebook.getOperatingSystem().equals(value))) {
                    isMatching = true;

                }
                if (criter.equals("processorModel") && (notebook.getProcessorModel().equals(value))) {
                    isMatching = true;

                }
                if (criter.equals("storageCapacity") && (notebook.getStorageCapacity().equals(value))) {
                    isMatching = true;
                }
            }

            if (isMatching) Laptops.add(notebook.getBrand());

        }
        if (!Laptops.isEmpty())
            System.out.println(" With chosen criteria we have next(s) models of notebook(s):" + Laptops);
        if (Laptops.isEmpty()) System.out.println("Sorry, we have not such Laptops.");
    }
}






