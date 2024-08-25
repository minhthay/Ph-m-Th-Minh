package Bai2;

public class Interaction {
    public static void main(String[] args) {
        //while
        int i = 0;
        while (i < 5) {
        System.out.println(i); //0 1 2 3 4
        i++;
        }
        //For
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i); // return value: 0 2 4 6 8 10
          }
        //for each
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
        System.out.println(i); // return value: Volvo BMW Ford Mazda
        }
        //switch-case
        int day = 4;
        switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
        System.out.println("Wednesday");
            break ;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        }
        //return value: Thurday
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
              break;
            }
            System.out.println(i); // return value: 0 1 2 3 
          }
          for (int i = 0; i < 10; i++) {
            if (i == 4) {
              continue;
            }
            System.out.println(i);// reuturn value: 0 1 2 3 5 6 7 8 9
          }
    }
}

