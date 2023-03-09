//------------------------C L A S S - & - O B J E C T-----------------------------------
public class OopsConcept {
   String str;
   int rollno;
   int phno;
   public void Display(){
       System.out.println(str);
       System.out.println(rollno);
       System.out.println(phno);
   }

   public static void main(String[] args) {
       OopsConcept op=new OopsConcept();
      op.str="lokesh";
      op.phno=1234567;
      op.rollno=20020;
      op.Display();
   }