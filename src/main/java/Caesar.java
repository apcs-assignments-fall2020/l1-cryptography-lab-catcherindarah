import java.util.Scanner;

public class Caesar {
    public static String encryptCaesar(String message) {
        String encmessage = "";
        for (int i = 0, i < message.length(), i++) {
            char ch = (char)((int)message.charAt(i)+3) % 26;
            encmessage.append(ch);

        }
        return encmessage;
        
    }

    public static String decryptCaesar(String message) {
        String a = message.toUpperCase();
        String b = "";
        String c = "";
        for (int i = 0; i < message.length(); i++;){
            char ray = a.charAt(i);
            if (ray >= 68 && ray <= 90) {
                ray = (char)(ray-3);
                b = b + ray;
            }
            if (ray == 67) {
                ray = char(90);
                b = b + ray;

            }
            if (ray == 66) {
                ray = (char)(89);
                b = b + ray;
            }
            if (ray == 65) {
                ray = (char)(88);
                b = b + ray;
            }
            c = b.toLowerCase();
            return (c);

        }
    }

    public static String encryptCaesarKey(String message, int key) {
        StringBuffer message= new StringBuffer(); 
  
        for (int i=0; i<text.length(); i++) 
        { 
            if (Character.isUpperCase(text.charAt(i))) 
            { 
                char ch = (char)(((int)text.charAt(i) + 
                                  s - 65) % 26 + 65); 
                message.append(ch); 
            } 
            else
            { 
                char ch = (char)(((int)text.charAt(i) + 
                                  s - 97) % 26 + 97); 
                message.append(ch); 
            } 
        } 
        return message; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String text = "ATTACKATONCE"; 
        int s = 4; 
        System.out.println("Text  : " + text); 
        System.out.println("Shift : " + s); 
        System.out.println("Cipher: " + encrypt(text, s)); 
    } 
} 
        
    }

    public static String decryptCaesarKey(String message, int key) {
        return message;
        // REPLACE THIS WITH YOUR CODE
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to \"encrypt\" or \"decrypt\" a message?");
        String command = scan.nextLine().trim().toLowerCase();

        if (command.equals("encrypt")) {
            System.out.println("Please enter your message to be encrypted: ");
            String message = scan.nextLine();
            System.out.println("Here is your encrypted message: ");
            System.out.println(encryptCaesar(message));
        }
        else if (command.equals("decrypt")) {
            System.out.println("Please enter your message to be decrypted: ");
            String message = scan.nextLine();
            System.out.println("Here is your decrypted message: ");
            System.out.println(decryptCaesar(message));
        }
        else {
            System.out.println("Unknown command; please type either \"encrypt\" or \"decrypt\"");
        }

        scan.close();
    }
}
