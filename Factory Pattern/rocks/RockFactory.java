package rocks;

public class RockFactory {
   public Rock getRock(String rock){
      if(rock == null){
         return null;
      }
      else if(rock.toLowerCase().equals("igneous")){
         return new Igneous();
      }
      else if(rock.toLowerCase().equals("sedimentary")){
         return new Sedimentary();
      }
      else if(rock.toLowerCase().equals("metamorphic")){
         return new Metamorphic();
      }
      else{
         return null;
      }
   }
}