package d10.prac.q2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MenuOrder {
    public static void main(String[] args) throws IOException {
        List<Menu> menuList = readData();
        for (int i = 0; i < menuList.size(); i++) {
            Menu menu = menuList.get(i);
            System.out.println(String.format(
                    "%d. %s %d",
                    i + 1,
                    menu.getName(),
                    menu.getPrice())
            );
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Menu: ");
        int price = menuList.get(Integer.parseInt(reader.readLine()) - 1)
                .getPrice();
        System.out.print("Count: ");
        int count = Integer.parseInt(reader.readLine());
        System.out.println("Total: " + (price * count));

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
}
