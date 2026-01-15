public class FizzBuzz {
    public String fizzBuzz(int n) {
        if (n % 15 == 0) {
            return "FizzBuzz";
        }
        if (n % 3 == 0) {
            return "Fizz";
        }
        if (n % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(n);
    }

    public void executer() {
        for (int i = 1; i <= 100; i++) {
            String mot = "";
            if (i % 3 == 0) {
                mot += "fizz";
            }
            if (i % 5 == 0) {
                mot += "buzz";
            }
            if (mot.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(i + " : " + mot);
            }
        }
    }
}
