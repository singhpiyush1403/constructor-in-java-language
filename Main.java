
  
class ekclass{
    int a;
    public int getA(){
        return a;
    }
    ekclass(int v){
        this.a = v;
    }
    public int returnone(){
        return 1;
    }
}
public class Main{
 public static void main(String[] args){
     ekclass e = new ekclass(6);
     System.out.println(e.getA());
 }
}