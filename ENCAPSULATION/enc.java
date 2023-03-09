//--------------------------------E N C A P S U L A T I O N --------------------------------------------

public class OopsConcept {
   int roll_no,ph_no;
   String str;
   public int getRoll_no(){
       return roll_no;
   }
   public void setRoll_no(int roll_no){
       this.roll_no=roll_no;
   }
   public int getPh_no(){
       return ph_no;
   }
   public void setPh_no(int ph_no){
       this.ph_no=ph_no;
   }
   public String getStr(){
       return str;
   }
   public void setStr(String str){
       this.str=str;
   }
}
   class Main{
   public static void main(String[] args) {
     OopsConcept s1=new OopsConcept();
     s1.setPh_no(123456);
     s1.setRoll_no(200);
     s1.setStr("lokesh");
       System.out.println("Phone no: " + s1.getPh_no());
   }
}
