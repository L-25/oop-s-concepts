// ---------------------R E C U R S I O N--------------------------------

public class OopsConcept {
   public static void main(String[] args) {
       int n=1;
       Multipleprint(n);
   }
   static void Multipleprint(int n){
       if(n==10){
           System.out.println(10);
       }
       else{
           System.out.println(n);
           Multipleprint(n+1);
       }
   }

}