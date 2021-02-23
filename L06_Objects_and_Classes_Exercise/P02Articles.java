package L06_Objects_and_Classes_Exercise;

import java.util.Scanner;

public class P02Articles {
    static class Article {
        String title;
        String content;
        String author;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        Article() {
            this.title = getTitle();
            this.content = getContent();
            this.author = getAuthor();
        }

        @Override
        public String toString() {
            return title + " - " + content + ": " + author;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        Article article = new Article();
        article.setTitle(input[0]);
        article.setContent(input[1]);
        article.setAuthor(input[2]);

        int editLinesCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < editLinesCount; i++) {
            String[] command = scanner.nextLine().split(": ");
            if (command[0].contains("Edit")) {
                article.setContent(command[1]);
            } else if (command[0].contains("ChangeAuthor")) {
                article.setAuthor(command[1]);
            } else if (command[0].contains("Rename")) {
                article.setTitle(command[1]);
            }
        }

        System.out.println(article);

    }
}
