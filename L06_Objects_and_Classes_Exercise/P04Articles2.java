package L06_Objects_and_Classes_Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P04Articles2 {
    static class Article {
        private String title;
        private String content;
        private String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s", title, content, author);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputCount = Integer.parseInt(scanner.nextLine());

        List<Article> articles = new ArrayList<>();
        for (int i = 0; i < inputCount; i++) {
            String[] input = scanner.nextLine().split(", ");
            Article article = new Article(input[0], input[1], input[2]);
            articles.add(article);
        }

        String printInOrder = scanner.nextLine();
        if (printInOrder.equalsIgnoreCase("title")) {
            articles.sort((Comparator.comparing(Article::getTitle)));
        } else if (printInOrder.equalsIgnoreCase("content")) {
            articles.sort(Comparator.comparing(Article::getContent));
        } else if (printInOrder.equalsIgnoreCase("author")) {
            articles.sort(Comparator.comparing(Article::getAuthor));
        }

        for (Article article : articles) {
            System.out.println(article);
        }
    }
}
