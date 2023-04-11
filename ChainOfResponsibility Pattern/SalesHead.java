public class SalesHead extends RequestHandler {
   public SalesHead(long amount){
      this.amount = amount;
   }

   @Override
   protected void handle(String message){
      System.out.println("Sales Head handling purchase request for "+ message);
   }
}