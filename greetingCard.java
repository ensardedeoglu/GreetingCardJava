public class Main
{
   // main method for testing
   public static void main(String[] args)
   {
      cardOrganizer s1 = new cardOrganizer("Ensar Dedeoglu", "Sevgi Koyuncu", "Happy birthday Sevgi!", "Birthday");
      System.out.println(s1);
   }
 }
// cardOrganizer class contains String sender, String recipient, String message, String occasion
class cardOrganizer
{
   private String sender;
   private String recipient;
   private String message;
   private String occasion;

   public cardOrganizer(String initSender, String initRecipient, String initMessage, String initOccasion)
   {
      sender = initSender;
      recipient = initRecipient;
      message = initMessage;
      occasion = initOccasion;
   }
   // toString() method to display the message
   public String toString()
   {
     return "A greeting card from"+ " " + sender + " to " + recipient + ". Here is message: " + message + ". Occasion: " + occasion;
   }
}


// Output: 
// A greeting card from Ensar Dedeoglu to Sevgi Koyuncu. Here is message: Happy birthday Sevgi!. Occasion: Birthday