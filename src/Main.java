import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        lab1 tasks = new lab1(); // один объект для всех задач

        // сумма двух последних цифр
        System.out.print("Введите число (не меньше двух цифр): ");
        int x = scanner.nextInt();
        if (x >= 10 || x <= -10) {
            System.out.println("Сумма двух последних цифр = " + tasks.sumLastNums(x));
        } else {
            System.out.println("Ошибка: число должно содержать минимум две цифры!");
        }

        // проверка на позитив
        System.out.print("\nВведите число для проверки (положительное или нет): ");
        int y = scanner.nextInt();
        System.out.println("Результат: " + tasks.isPositive(y));

        // проверка на заглавную букву
        System.out.print("\nВведите один символ для проверки (заглавная или нет): ");
        char ch = scanner.next().charAt(0);
        System.out.println("Результат: " + tasks.isUpperCase(ch));

        // проверка делителя
        System.out.print("\nВведите два числа для проверки делимости: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Результат: " + tasks.isDivisor(a, b));

        // многократный вызов
        System.out.println("\nВведите 5 чисел для последовательного сложения:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();
        int n5 = scanner.nextInt();
        int result = tasks.lastNumSum(n1, n2);
        result = tasks.lastNumSum(result, n3);
        result = tasks.lastNumSum(result, n4);
        result = tasks.lastNumSum(result, n5);
        System.out.println("Итоговый результат = " + result);

        // безопасное деление
        System.out.print("\nВведите два числа для безопасного деления: ");
        int divX = scanner.nextInt();
        int divY = scanner.nextInt();
        System.out.println("Результат деления = " + tasks.safeDiv(divX, divY));

        // строка сравнения
        System.out.print("\nВведите два числа для сравнения: ");
        int cmpX = scanner.nextInt();
        int cmpY = scanner.nextInt();
        System.out.println("Результат сравнения: " + tasks.makeDecision(cmpX, cmpY));

        // тройная сумма
        System.out.print("\nВведите три числа для проверки тройной суммы: ");
        int t1 = scanner.nextInt();
        int t2 = scanner.nextInt();
        int t3 = scanner.nextInt();
        System.out.println("Можно ли сложить два числа и получить третье? " + tasks.sum3(t1, t2, t3));

        // возраст
        System.out.print("\nВведите возраст: ");
        int age = scanner.nextInt();
        System.out.println("Результат: " + tasks.age(age));

        // вывод дней недели
        System.out.print("\nВведите день недели: ");
        String day = scanner.next();
        System.out.println("Результат:");
        tasks.printDays(day);

        // числа наоборот
        System.out.print("\nВведите число для вывода от него до 0: ");
        int revNum = scanner.nextInt();
        System.out.println("Результат: " + tasks.reverseListNums(revNum));

        // степень числа
        System.out.print("\nВведите число и степень: ");
        int base = scanner.nextInt();
        int power = scanner.nextInt();
        System.out.println("Результат: " + tasks.pow(base, power));

        // одинаковость цифр
        System.out.print("\nВведите число для проверки одинаковости цифр: ");
        int eqNum = scanner.nextInt();
        System.out.println("Результат: " + tasks.equalNum(eqNum));

        // левый треугольник
        System.out.print("\nВведите высоту треугольника: ");
        int height = scanner.nextInt();
        System.out.println("Результат:");
        tasks.leftTriangle(height);

        // угадайка
        System.out.println("\nИгра 'Угадайка' (число от 0 до 9): ");
        tasks.guessGame();

        // поиск последнего значения
        System.out.print("\nВведите размер массива: ");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.print("Введите число для поиска: ");
        int search = scanner.nextInt();
        System.out.println("Последнее вхождение = " + tasks.findLast(arr1, search));

        // добавление в массив
        System.out.print("\nВведите размер массива: ");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }
        System.out.print("Введите число для вставки: ");
        int insNum = scanner.nextInt();
        System.out.print("Введите позицию: ");
        int pos = scanner.nextInt();
        int[] newArr = tasks.add(arr2, insNum, pos);
        System.out.print("Новый массив: ");
        for (int num : newArr) System.out.print(num + " ");
        System.out.println();

        // реверс массива
        System.out.print("\nВведите размер массива: ");
        int size3 = scanner.nextInt();
        int[] arr3 = new int[size3];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size3; i++) {
            arr3[i] = scanner.nextInt();
        }
        tasks.reverse(arr3);
        System.out.print("Реверс: ");
        for (int num : arr3) System.out.print(num + " ");
        System.out.println();

        // объединение массивов
        System.out.print("\nВведите размер первого массива: ");
        int size4 = scanner.nextInt();
        int[] arr4 = new int[size4];
        System.out.println("Введите элементы первого массива:");
        for (int i = 0; i < size4; i++) {
            arr4[i] = scanner.nextInt();
        }
        System.out.print("Введите размер второго массива: ");
        int size5 = scanner.nextInt();
        int[] arr5 = new int[size5];
        System.out.println("Введите элементы второго массива:");
        for (int i = 0; i < size5; i++) {
            arr5[i] = scanner.nextInt();
        }
        int[] concatArr = tasks.concat(arr4, arr5);
        System.out.print("Объединённый массив: ");
        for (int num : concatArr) System.out.print(num + " ");
        System.out.println();

        // удалить негатив
        System.out.print("\nВведите размер массива: ");
        int size6 = scanner.nextInt();
        int[] arr6 = new int[size6];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size6; i++) {
            arr6[i] = scanner.nextInt();
        }
        int[] noNeg = tasks.deleteNegative(arr6);
        System.out.print("Массив без отрицательных: ");
        for (int num : noNeg) System.out.print(num + " ");
        System.out.println();

        scanner.close();
    }
}