public class ChatBotEngine {

    public static String getResponse(String input) {

        input = input.toLowerCase().trim();

        if (input.contains("hello") || input.contains("hi")) {
            return "Hello! How can I help you?";
        }

        if (input.contains("java")) {
            return "Java is a popular object-oriented programming language.";
        }

        if (input.contains("oop")) {
            return "OOP stands for Object Oriented Programming.";
        }

        if (input.contains("jvm")) {
            return "JVM stands for Java Virtual Machine.";
        }

        if (input.contains("inheritance")) {
            return "Inheritance allows one class to acquire properties of another class.";
        }

        if (input.contains("polymorphism")) {
            return "Polymorphism allows one action to have many forms.";
        }

        if (input.contains("encapsulation")) {
            return "Encapsulation means wrapping data and methods together.";
        }

        if (input.contains("abstraction")) {
            return "Abstraction hides implementation details from the user.";
        }

        if (input.contains("bye")) {
            return "Goodbye! Have a great day.";
        }

        return "Sorry, I don't understand that question.";
    }
}