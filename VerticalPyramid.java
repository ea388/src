public class VerticalPyramid {
  public static void main(String args[]) {
    System.out.print("Enter height: ");
    int height = IO.readInt();

    for(int line = 1; line <= height; line++) {
      for(int spaces = height - line; spaces > 0; spaces--) {
        System.out.print(" ");
      }
      for(int stars = 1; stars <= (2*line) - 1; stars++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
