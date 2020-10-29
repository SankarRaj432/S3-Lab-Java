//program to find the factor of a given number 

class Factor{

  public static void main(String[] args) {

    int number = 8;

    System.out.print("Factors of " + number + " are: ");

    for (int i = 1; i <= number; ++i) {

      if (number % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}
