public class Main {
  public static void createRectangle(int width, int height) {
    if (width < 1 || height < 1) {
      System.out.println("Invalid dimensions. Width and height must be greater than 0.");
      return;
    }
    for (int i = 0; i < height; i++) {
      System.out.println("#");
    }
    System.out.println("");
  }

  public static void createIsocelesRightTriangle(int size) {
    if (size < 1) {
      System.out.println("Invalid size. Size must be greater than 0.");
      return;
    }
    for (int i = 0; i < size; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("#");
      }
      System.out.println("");
    }
    System.out.println("");
  }

  public static void main(String[] args) {
    createRectangle(5, 3);
    createIsocelesRightTriangle(5);
  }
}
