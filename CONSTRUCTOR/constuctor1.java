//------------------- C O N S T R U C T O R ------------------------------

public class OopsConcept {
   String str;
   int rollno;

   public void Constructor() {
       str = "kfjgfkl";
       rollno = 728;
   }

   public int cons() {
       return rollno;
   }
}
   class Main {
       public static void main(String[] args) {
           OopsConcept s1 = new OopsConcept();
           s1.Constructor();
           System.out.println(s1.cons());
       }
   }
