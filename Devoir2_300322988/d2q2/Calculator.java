class Calculator {
    private double first, second; // two calculator operands
    private String oP;

    Calculator() {}

    void operation(String str) {
        first = second; // keep first operand
        second = 0; // initialize and get ready for second operand
        oP = str;
    }

    void add() {
        operation("+");
    }

    void subtract() {
        operation("-");
    }

    void multiply() {
        operation("*");
    }

    void divide() {
        operation("/");
    }

    void factorial() {
        operation("!");
    }

    void pow() {
        operation("POW");
    }

    void rootSquare() {
        operation("sqrt");
    }

    void nepLog() {
        operation("ln");
    }

    void compute() {
        if (oP.equals("+")) {
            second = first + second;
        } else if (oP.equals("-")) {
            second = first - second;
        } else if (oP.equals("*")) {
            second = first * second;
        } else if (oP.equals("/")) {
            second = first / second;
        } else if (oP.equals("!")) {
            double result = 1;
            for (int i = 1; i <= first; i++) {
                result *= i;
            }
            second = result;
        } else if (oP.equals("POW")) {
            second = Math.pow(first, second);
        } else if (oP.equals("sqrt")) {
            second = Math.sqrt(first);
        } else if (oP.equals("ln")) {
            second = Math.log(first);
        }
    }

    void clear() {
        first = 0;
        second = 0;
        oP = "";
    }

    double display() {
        return second;
    }

    
  public static void main(String[] args) {
    Calculator calculator = new Calculator(); // Create an instance of the Calculator class

        calculator.operation("2");
        calculator.add();
        calculator.operation("3");
        calculator.compute();
        System.out.println("Addition: " + calculator.display());

        calculator.operation("5");
        calculator.multiply();
        calculator.operation("4");
        calculator.compute();
        System.out.println("Multiplication: " + calculator.display());

        calculator.operation("10");
        calculator.divide();
        calculator.operation("2");
        calculator.compute();
        System.out.println("Division: " + calculator.display());

        calculator.operation("6");
        calculator.subtract();
        calculator.operation("2");
        calculator.compute();
        System.out.println("Subtraction: " + calculator.display());

        calculator.operation("9");
        calculator.pow();
        calculator.operation("2");
        calculator.compute();
        System.out.println("Power: " + calculator.display());

        calculator.operation("16");
        calculator.rootSquare();
        calculator.compute();
        System.out.println("Square Root: " + calculator.display());

        calculator.operation("7");
        calculator.nepLog();
        calculator.compute();
        System.out.println("Natural Logarithm: " + calculator.display());

        calculator.operation("5");
        calculator.factorial();
        calculator.compute();
        System.out.println("Factorial: " + calculator.display());

        calculator.clear();
        System.out.println("After clearing: " + calculator.display());
    }
}




