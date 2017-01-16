public class HorizontalPyramid {
  public static void main(String args[]) {
    System.out.print("Enter the height #: ");
    int height = IO.readInt();
    //int height = 5;
    String sym = "*";

    //Print out top part of the pyramid
    /* e.g. when height = 3
     *      *
     *      **
     *      ***
     */
    //for loop: keeps track of line #
    for (int line = 1; line <= height; line++) {
      // for loop: keeps track of # of stars to print
      for (int i = 1; i<=line; i++) {
        System.out.print(sym);
      }
      System.out.println();
    }



    // Print out bottom part of the pyramid
    /* e.g. when height = 3
     *           **
     *           *
     */
    for (int i = height - 1; i > 0; i--) {
      for(int j = i; j > 0; j--) {
        System.out.print(sym);
      }
      System.out.println();
    }
  }
}

