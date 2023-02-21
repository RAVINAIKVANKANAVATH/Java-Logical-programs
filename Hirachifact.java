class addition {
  int n;
  int fact = 1;

  void add() {
    int c;

    c = a + b;
    System.out.println("The Addition is:" + c);
  }
}

class subtract extends addition {
  void fact() {
    int d;
    fact = fact + c;
    System.out.println("The factorial is:" + fact);
  }
}

class Hirachifact {
  public static void main(String args[]) {
    subtract s = new subtract();
    s.add();
    s.fact();
  }
}