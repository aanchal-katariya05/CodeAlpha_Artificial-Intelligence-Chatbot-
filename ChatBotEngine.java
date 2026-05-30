public class ChatBotEngine {

    public static String getResponse(String input) {

        input = input.toLowerCase();

        if(input.contains("hello")) {
            return "Hi! How can I help you?";
        }

        if(input.contains("java")) {
            return "Java is a programming language.";
        }

        if(input.contains("bye")) {
            return "Goodbye!";
        }

        return "Sorry, I don't understand.";
    }
}

