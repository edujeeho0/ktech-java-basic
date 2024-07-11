package project;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TodoRepository {
    private final List<Todo> todos;
    private final String filename;

    public TodoRepository() {
        this("todo.csv");
    }

    public TodoRepository(String filename) {
        this.filename = filename;
        this.todos = new ArrayList<>();
        try {
            this.readFromFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not found, if there are new todo's it will be created");
        } catch (IOException e) {
            System.err.println("Error while reading file");
            throw new RuntimeException(e);
        }
    }

    private void readFromFile() throws IOException {
        try (FileReader fileReader = new FileReader(filename);
             BufferedReader reader = new BufferedReader(fileReader)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                todos.add(new Todo(
                        values[0],
                        LocalDate.parse(values[1]),
                        Boolean.parseBoolean(values[2])
                ));
            }
        }
    }

    public void writeToFile() throws IOException {
        try (FileWriter fileWriter = new FileWriter(filename);
             BufferedWriter writer = new BufferedWriter(fileWriter)) {
            for (Todo todo : todos) {
                writer.write(todo.toCsvRow());
                writer.newLine();
            }
        }
    }

    public List<Todo> getTodos() {
        return todos;
    }
}
