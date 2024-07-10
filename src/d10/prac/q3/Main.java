package d10.prac.q3;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Movie> movieList = readData();
        for (int i = 0; i < movieList.size(); i++) {
            Movie movie = movieList.get(i);
            System.out.println(String.format("Movie %d", i + 1));
            System.out.println("title: " + movie.getTitle());
            System.out.println("release: " + movie.getRelease());
            System.out.println("director: " + movie.getDirector());
            System.out.println("genres: " + String.join(", ", movie.getGenres()));
            System.out.println();
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.print("title: ");
            String title = reader.readLine();
            System.out.print("release: ");
            String release = reader.readLine();
            LocalDate releaseDate = LocalDate.parse(release);
            System.out.print("director: ");
            String director = reader.readLine();
            System.out.print("genre count: ");
            int count = Integer.parseInt(reader.readLine());
            List<String> genres = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                System.out.print(String.format("genre %d: ", i + 1));
                genres.add(reader.readLine());
            }
            movieList.add(new Movie(
                    title,
                    releaseDate,
                    director,
                    genres
            ));
            System.out.println("Saved!!!");
            System.out.print("Add more? [y/n]: ");
            String addMore = reader.readLine();
            if (addMore.equals("n")) {
                break;
            }
        }
        writeData(movieList);
    }

    private static List<Movie> readData() {
        List<Movie> movieList = new ArrayList<>();
        try (FileReader fileReader = new FileReader("movie.csv");
             BufferedReader reader = new BufferedReader(fileReader)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                LocalDate releaseDate = LocalDate.parse(values[1]);
                List<String> genres = Arrays.stream(values[3].split("\\|"))
                                .toList();
                movieList.add(new Movie(
                        values[0],
                        releaseDate,
                        values[2],
                        genres
                ));
            }
        } catch (IOException e) {
            System.out.println("Read data error: " + e.getMessage());
        }

        return movieList;
    }

    private static void writeData(List<Movie> movieList) {
        try (FileWriter fileWriter = new FileWriter("movie.csv");
            BufferedWriter writer = new BufferedWriter(fileWriter)) {
            StringBuilder lineBuilder = new StringBuilder();
            for (Movie movie : movieList) {
                lineBuilder.append(movie.getTitle()).append(',');
                lineBuilder.append(movie.getRelease()).append(',');
                lineBuilder.append(movie.getDirector()).append(',');
                lineBuilder.append(String.join("|", movie.getGenres()));
                writer.write(lineBuilder.toString());
                writer.newLine();
                lineBuilder.setLength(0);
            }

        } catch (IOException e) {
            System.out.println("Write data error: " + e.getMessage());
        }
    }
}
