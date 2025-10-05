import java.util.Scanner;
import java.util.Random;

public class lab1 {
    public int sumLastNums(int x) {
        int lastDigit = x % 10;
        int secondLastDigit = (x / 10) % 10;
        return lastDigit + secondLastDigit;
    }

    public boolean isPositive(int x) {
        return x > 0;
    }

    public boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }

    public boolean isDivisor(int a, int b) {
        if (a != 0 && b % a == 0) return true;
        if (b != 0 && a % b == 0) return true;
        return false;
    }

    public int lastNumSum(int a, int b) {
        int lastA = a % 10;
        int lastB = b % 10;
        return lastA + lastB;
    }

    public double safeDiv(int x, int y) {
        if (y == 0) return 0;
        return (double) x / y;
    }

    public String makeDecision(int x, int y) {
        if (x > y) return x + ">" + y;
        else if (x < y) return x + "<" + y;
        else return x + "==" + y;
    }

    public boolean sum3(int x, int y, int z) {
        return (x + y == z) || (x + z == y) || (y + z == x);
    }

    public String age(int x) {
        int lastDigit = x % 10;
        int lastTwo = x % 100;
        if (lastDigit == 1 && lastTwo != 11) return x + " год";
        else if ((lastDigit == 2 || lastDigit == 3 || lastDigit == 4) && !(lastTwo == 12 || lastTwo == 13 || lastTwo == 14))
            return x + " года";
        else return x + " лет";
    }

    public void printDays(String x) {
        switch (x.toLowerCase()) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
        }
    }

    public String reverseListNums(int x) {
        String res = "";
        for (int i = x; i >= 0; i--) {
            res += i;
            if (i != 0) res += " ";
        }
        return res;
    }

    public int pow(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result = result * x;
        }
        return result;
    }

    public boolean equalNum(int x) {
        int last = x % 10;
        while (x > 0) {
            if (x % 10 != last) return false;
            x = x / 10;
        }
        return true;
    }

    public void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void guessGame() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int target = rand.nextInt(10); // число от 0 до 9
        int attempts = 0;
        int guess = -1;

        while (guess != target) {
            System.out.print("Введите число от 0 до 9: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess == target) {
                System.out.println("Вы угадали!");
                System.out.println("Вы отгадали число за " + attempts + " попытки");
            } else {
                System.out.println("Вы не угадали, попробуйте ещё раз.");
            }
        }
    }

    public int findLast(int[] arr, int x) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) index = i;
        }
        return index;
    }

    public int[] add(int[] arr, int x, int pos) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == pos) {
                newArr[i] = x;
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }
        return newArr;
    }

    public void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public int[] concat(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            newArr[arr1.length + i] = arr2[i];
        }
        return newArr;
    }

    public int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) count++;
        }

        int[] newArr = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                newArr[j] = arr[i];
                j++;
            }
        }
        return newArr;
    }
}