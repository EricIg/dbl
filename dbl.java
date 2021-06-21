import java.util.Scanner;

public class dbl {
  
    public static void main(String [] args) {
    
    
    Scanner word = new Scanner(System.in);
    System.out.println("Enter doubloon word");
    String doubloon = word.nextLine();
    isDoubloon(doubloon);

  }
  
  public static boolean isDoubloon(String e) {
    
    String eric = e.toLowerCase();
    boolean check = true;
    
    for(int i = 0; i < eric.length(); i++){
      int count = 0;
      for(int j = 0; j < eric.length(); j++){
        if(eric.charAt(i) == eric.charAt(j)) count++;
      }
      if (count != 2) {
        check = false;
        break;
      }
    }
    if(check == true){
      System.out.println("True, This is a doubloon");
    }else
      System.out.println("False, This is not a doubloon");
    return false;
  }
}
