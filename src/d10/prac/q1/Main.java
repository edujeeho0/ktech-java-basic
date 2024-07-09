package d10.prac.q1;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Music> musicList = readData();
        for (int i = 0; i < musicList.size(); i++) {
            Music music = musicList.get(i);
            System.out.println(String.format("Music %d", i + 1));
            System.out.println("title: " + music.getTitle());
            System.out.println("album: " + music.getAlbum());
            System.out.println("artist: " + music.getArtist());
            System.out.println(String.format(
                    "release: %d-%02d-%02d",
                    music.getRelease().getYear(),
                    music.getRelease().getMonthValue(),
                    music.getRelease().getDayOfMonth()
            ));
            System.out.println();
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.print("title: ");
            String title = reader.readLine();
            System.out.print("album: ");
            String album = reader.readLine();
            System.out.print("artist: ");
            String artist = reader.readLine();
            System.out.print("release: ");
            String release = reader.readLine();
            LocalDate releaseDate = LocalDate.parse(release);
            musicList.add(new Music(
                    title,
                    album,
                    artist,
                    releaseDate
            ));
            System.out.println("Saved!!!");
            System.out.print("Add more? [y/n]: ");
            String addMore = reader.readLine();
            if (addMore.equals("n")) {
                break;
            }
        }
        writeData(musicList);
    }

    private static List<Music> readData() {
        List<Music> musicList = new ArrayList<>();
        try (FileReader fileReader = new FileReader("music.csv");
            BufferedReader reader = new BufferedReader(fileReader)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                String[] date = values[3].split("-");
                int year = Integer.parseInt(date[0]);
                int month = Integer.parseInt(date[1]);
                int day = Integer.parseInt(date[2]);
//                LocalDate releaseDate = LocalDate.of(year, month, day);
                LocalDate releaseDate = LocalDate.parse(values[3]);
                musicList.add(new Music(
                        values[0],
                        values[1],
                        values[2],
                        releaseDate
                ));
            }
        } catch (IOException e) {
            System.out.println("Read data error: " + e.getMessage());
        }

        return musicList;
    }

    private static void writeData(List<Music> musicList) {
        try (FileWriter fileWriter = new FileWriter("music.csv");
            BufferedWriter writer = new BufferedWriter(fileWriter)) {
            StringBuilder lineBuilder = new StringBuilder();
            for (Music music : musicList) {
                lineBuilder.append(music.getTitle()).append(',');
                lineBuilder.append(music.getAlbum()).append(',');
                lineBuilder.append(music.getArtist()).append(',');
                lineBuilder
                        .append(music.getRelease().getYear()).append('-')
                        .append(music.getRelease().getMonthValue()).append('-')
                        .append(music.getRelease().getDayOfMonth());
                writer.write(lineBuilder.toString());
                writer.newLine();
                lineBuilder.setLength(0);
            }

        } catch (IOException e) {
            System.out.println("Write data error: " + e.getMessage());
        }
    }
}
