//     --------------------------   PASSING THE INPUT BY METHOD  --------------------------------------------

public class OopsConcept {
   String str;
   int rollno;
   int phno;

   public void Display() {
       System.out.println(str);
       System.out.println(rollno);
       System.out.println(phno);
   }
   public void SetValue(String s,int roll,int ph){
       str=s;
       rollno=roll;
       phno=ph;

   }

}
class Main{
   public static void main(String[] args) {
       OopsConcept op=new OopsConcept();
       op.SetValue("dfegwdv",20020,6357);
       op.Display();

       OopsConcept ip=new OopsConcept();
       ip.str="adcd";
       ip.phno=733439;
       ip.rollno=200;
       ip.Display();
   }
}