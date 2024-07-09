package d10.prac.q2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MenuAdd {
    public static void main(String[] args) throws IOException {
        List<Menu> menuList = readData();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.print("name: ");
            String name = reader.readLine();
            System.out.print("price: ");
            int age = Integer.parseInt(reader.readLine());
            menuList.add(new Menu(
                    name,
                    age
            ));
            System.out.println("Saved!!!");
            System.out.print("Add more? [y/n]: ");
            String addMore = reader.readLine();
            if (addMore.equals("n")) {
                break;
            }
        }
        writeData(menuList);
    }

    private static List<Menu> readData() {
        List<Menu> menuList = new ArrayList<>();
        try (FileReader fileReader = new FileReader("menu.csv");
            BufferedReader reader = new BufferedReader(fileReader)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                menuList.add(new Menu(
                        values[0],
                        Integer.parseInt(values[1])
                ));
            }
        } catch (IOException e) {
            System.out.println("Read data error: " + e.getMessage());
        }

        return menuList;
    }

    private static void writeData(List<Menu> menuList) {
        try (FileWriter fileWriter = new FileWriter("menu.csv");
            BufferedWriter writer = new BufferedWriter(fileWriter)) {
            StringBuilder lineBuilder = new StringBuilder();
            for (Menu menu : menuList) {
                lineBuilder.append(menu.getName()).append(',');
                lineBuilder.append(menu.getPrice());
                writer.write(lineBuilder.toString());
                writer.newLine();
                lineBuilder.setLength(0);
            }

        } catch (IOException e) {
            System.out.println("Write data error: " + e.getMessage());
        }
    }
}
