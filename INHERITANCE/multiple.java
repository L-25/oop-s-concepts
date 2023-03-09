//-----------------------MULTIPLE INHERITANCE USING INTERFACE-----------------

interface Father{
   abstract void hockey();
   abstract void Raider();
}
interface Mother{
 public   abstract void cooking();
abstract void Singing();
}
class Son implements Mother,Father{
   public void cooking(){
    System.out.println();
   }
public void Singing(){
 System.out.println("Mother is good singer");
}
public void hockey(){
 System.out.println("father is good hocker ply");
}
public void Raider(){
 System.out.println("Father is a best raider");
}
}
class Main{
public static void main(String[] args) {
 Son s1=new Son();
 s1.cooking();
 s1.hockey();
 s1.Raider();
 s1.Singing();
}
}