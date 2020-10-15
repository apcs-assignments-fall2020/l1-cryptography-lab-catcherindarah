import java.util.Scanner; //help from Ryan 

public class Caesar {
    public static String encryptCaesar(String message) {
        String encmessage = "";
        int s = 3;
        int zero = 0;
        for (int i = 0; i < message.length(); i++) {
            char a = message.charAt(i);
            if(65 <= a && a <= 90){
                zero = (a + s - 65)%26;
                encmessage += (char)(zero + 65);
            }
            else if ( 97 <= a && a <= 122){
                zero = (a + s - 97)%26;
                encmessage += (char)(zero + 97);
            }
            else {
                encmessage += a;
            }

        }
        return encmessage;
        
    }

    public static String decryptCaesar(String message) {
        int s = 3;
        int zero = 0;
        String decmessage = "";

        for (int i = 0; i < message.length(); i++){
            char a = message.charAt(i);
            if ((65 <= a && a <= 90) || (97 <= a && a <= 122)){
                if ((65 <= a && a <= 67) || (97 <= a && a <= 99)){
                    decmessage += (char)(a + 23);
              }
                else {
                    decmessage += (char)(a - 3);
              }
          }
            else {
                decmessage += a;
          }

        }
        return decmessage;
    }

    public static String encryptCaesarKey(String message, int key) {
        String decmessage = "";
        key = key % 26;

        for (int i = 0; i < message.length(); i++){
              char a = message.charAt(i);
            if ((65 <= a && a <= 90) || (97 <= a && a <= 122)){
                if ((a >= (90-(key-1)) && a <= 90) || (a >= 122-(key-1) && a <= 122)){
                decmessage += (char)(a-(26-key));
              }
                else {
                    decmessage += (char)(a + key);
              }
          }
            else {
                decmessage += a;
          }

        }
        return decmessage;
         
    } 
     
        

    public static String decryptCaesarKey(String message, int key) {
        int s = key;
        int zero = 0;
        String ray ="";
        for (int i = 0; i < message.length(); i++){
            char a = message.charAt(i);
            if(65 <= a && a <= 90){
                zero= (a - s - 65)%26;
                if(zero < 0){
                    zero = 26 + zero;
                }
                ray += (char)(zero + 65);
            }
            else if (97 <= a && a <= 122){
                zero = (a - s - 97)%26;
                if(zero < 0){
                    zero = 26 + zero;
                }
                ray += (char)(zero +97);
            }
            else {
                ray += a;
            }
        }
        return ray;
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
