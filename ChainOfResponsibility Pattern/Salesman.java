public class Salesman extends RequestHandler {
   public Salesman(long amount){
      this.amount = amount;
   }

   @Override
   protected void handle(String message){
      System.out.println("Salesman handling purchase request for "+ message);
   }
}