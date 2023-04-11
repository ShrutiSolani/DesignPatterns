public class Manager extends RequestHandler {
   public Manager(long amount){
      this.amount = amount;
   }

   @Override
   protected void handle(String message){
      System.out.println("Manager handling purchase request for "+ message);
   }
}