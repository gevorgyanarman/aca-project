package com.aca.classroom;

import java.util.Scanner;

public class HumanTest {

    public static void main(String[] args) {
        System.out.println(getConditionText());
    }

    public static String getConditionText() {
        boolean heightLowerThan180 = isHeightLowerThan180();
        final boolean wightEq50 = isWightEq50();
        final boolean ageGt59 = isAgeGt59();
        if ((!heightLowerThan180 && wightEq50) || (heightLowerThan180 && wightEq50 && !ageGt59)) {
            return "Պայմանը բավարարված է";
        }
        return "Պայմանը բավարարված Չէ";
    }

    public static boolean isHeightLowerThan180() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Մուտքագրեք հասակը");
        final int height = scanner.nextInt();
        return height < 180;
    }

    public static boolean isAgeGt59() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Մուտքագրեք տարիքը");
        final int age = scanner.nextInt();
        return age > 59;
    }

    public static boolean isWightEq50() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Մուտքագրեք քաշը");
        final int weight = scanner.nextInt();
        return weight == 50;
    }
}
