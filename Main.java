import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println(" ");
        System.out.println("JAVA CHATBOT");
        System.out.println(" ");
        System.out.print("Bot: What is your name? ");
        name = sc.nextLine();
        System.out.println("Bot: Nice to meet you, " + name + "!");
        System.out.println("Bot: Type 'bye' to exit.");
        while (true) {
            System.out.print(name + ": ");
            String input = sc.nextLine().toLowerCase();
            if (input.equals("hello") || input.equals("hi")) {
                System.out.println("Bot: Hello " + name + "! How are you?");
            }
            else if (input.contains("how are you")) {
                System.out.println("Bot: I am fine! Thanks for asking.");
            }
            else if (input.contains("java")) {
                System.out.println(
                        "Bot: Java is a high-level, object-oriented programming language."
                );
            }
            else if (input.contains("your name")) {

                System.out.println("Bot: My name is JavaBot.");
            }
            else if (input.contains("joke")) {

                System.out.println(
                        "Bot: Why do programmers prefer dark mode?"
                );
                System.out.println(
                        "Bot: Because light attracts bugs! 😄"
                );
            }
            else if (input.equals("bye") || input.equals("exit")) {
                System.out.println(
                        "Bot: Goodbye " + name + "! Have a great day."
                );
                break;
            }
            else {
                System.out.println(
                        "Bot: Sorry, I don't understand that yet."
                );
            }
        }
        sc.close();
    }
}
