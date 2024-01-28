import java.util.Scanner;

public class all {

  private static void square(int n){
    for(int i = 0; i < n; i++){
      int j = 0;
      while(j < n){
        System.out.print("#");
        j = j + 1;
      }
      System.out.println();
    }
  }

  private static void triangle(int n){
    for(int i = 0; i < n;i++){
      int j = 0;
      while(j <= i){
        System.out.print("#");
        j = j + 1;
      }
      System.out.println();
    }
  }

  private static void triangle1(int n){
    for(int i = 0; i < n;i++){
      int j = 0;
      while(j <= i){
        System.out.print(j+1);
        j = j + 1;
      }
      System.out.println();
    }
  }

  private static void triangle2(int n){
    for(int i = 0; i < n;i++){
      int j = 0;
      while(j <= i){
        System.out.print(i+1);
        j = j + 1;
      }
      System.out.println();
    }
  }

  private static void inverted_triangle(int n){
    for(int i = 0; i < n; i++){
      int j = n-i;
      while (j > 0){
        System.out.print("#");
        j = j - 1;
      }
      System.out.println();
    }
  }

  private static void inverted_triangle1(int n){
    for(int i = n; i > 0; i--){
      int j = 1;
      while (j <= i){
        System.out.print(j);
        j = j + 1;
      }
      System.out.println();
    }
  }

  private static void tree(int n){
    for (int i = 0; i < n; i++){
      for(int j = 0; j < n-i-1; j++){
        System.out.print(" ");
      }
      for(int k = 0; k < i; k++){
        System.out.print("#");
      }
      for(int l = 0; l < i+1; l++){
        System.out.print("#");
      }
      System.out.println();
    }
  }

  private static void inverted_tree(int n){
    for(int i = 0; i < n; i++){
      for(int k = 0; k < i; k++){
        System.out.print(" ");
      }
      for(int j = n-i; j > 0; j --){
        System.out.print("#");
      }
      for(int l = n - i -1; l > 0; l--){
        System.out.print("#");
      }
      System.out.println();
    }
  }

  private static void binary_pattern(int n){
    boolean flag;
    for(int i = 1; i <= n; i++){
      if (i%2==0){
        flag = false;
      } else {
        flag = true;
      }
      for (int j = 0; j < i; j++){
        if(flag){
          System.out.print(1);
          flag = false;
        } else {
          System.out.print(0);
          flag = true;
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    System.out.println("Enter n: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    square(n);
    System.out.println();
    triangle(n);
    System.out.println();
    triangle1(n);
    System.out.println();
    triangle2(n);
    System.out.println();
    inverted_triangle(n);
    System.out.println();
    inverted_triangle1(n);
    System.out.println();
    tree(n);
    System.out.println();
    inverted_tree(n);
    System.out.println();
    binary_pattern(n);
  }
}
