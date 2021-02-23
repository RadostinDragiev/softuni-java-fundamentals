package L06_Objects_and_Classes_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04Songs {
    static class Songs {
        String typeList;
        String songName;
        String duration;

        Songs(String typeList, String songName, String duration) {
            this.typeList = typeList;
            this.songName = songName;
            this.duration = duration;
        }

        public String getTypeList() {
            return typeList;
        }

        public String getSongName() {
            return songName;
        }

        @Override
        public String toString() {
            return songName;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int songsCount = Integer.parseInt(scanner.nextLine());

        List<Songs> typeLists = new ArrayList<>();
        for (int i = 0; i < songsCount; i++) {
            String[] input = scanner.nextLine().split("_");
            String list = input[0];
            String songName = input[1];
            String duration = input[2];
            Songs typeList = new Songs(list, songName, duration);
            typeLists.add(typeList);
        }

        String lookingForType = scanner.nextLine();
        if (!lookingForType.equals("all")) {
            for (Songs song : typeLists) {
                if (song.getTypeList().equals(lookingForType)) {
                    System.out.println(song.getSongName());
                }
            }
        } else {
            for (Songs song : typeLists) {
                System.out.println(song.getSongName());
            }
        }
    }
}
