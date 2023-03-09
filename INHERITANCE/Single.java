//-------------------------I N H E R I T A N A C E-------------------------
public class singleInheritance {


     private int Legs;
protected String Eat;

    public void setEat(String Eat) {
        this.Eat=Eat;
    }
    public  String getEat(){
        return Eat;
    }

   public void setWalk(int Legs) {
       this.Legs=Legs;
   }
   public  int getWalk(){
       return Legs;
   }

}
class Bark extends OopsConcept{
    Boolean bark=true;
}
   class Main{
       public static void main(String[] args) {
           Bark s1=new Bark();
           s1.setEat("i am eat all foods");
          s1.setWalk(4);
//           s1.Eat="jhdgfj";
           System.out.println(s1.getWalk());
//            System.out.println(s1.getEat());
           System.out.println(s1.bark);
       }
   }

