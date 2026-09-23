//import java.util.Scanner;
//class StudentInformation {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Enter Student Information");
//        System.out.print("Enter Name: ");
//        String name = sc.nextLine();
//        System.out.print("Enter Age: ");
//        int age = sc.nextInt();
//        System.out.print("Enter Roll Number: ");
//        int rollNumber = sc.nextInt();
//        System.out.print("Enter Percentage for Subject 1: ");
//        double p1 = sc.nextDouble();
//        System.out.print("Enter Percentage for Subject 2: ");
//        double p2 = sc.nextDouble();
//        System.out.print("Enter Percentage for Subject 3: ");
//        double p3 = sc.nextDouble();
//        double total = p1 + p2 + p3;
//        double average = total / 3;
//        // 3. Print All Information Section
//        System.out.println("\n----- Student Information -----");
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//        System.out.println("Roll Number: " + rollNumber);
//        System.out.println("Percentage Marks: " + p1 + "%, " + p2 + "%, " + p3 + "%");
//        System.out.println("\n----- Calculated Results -----");
//        System.out.println("Total: " + total);
//        System.out.println("Average: " + average + "%");
//
//        sc.close();
//    }
//}


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