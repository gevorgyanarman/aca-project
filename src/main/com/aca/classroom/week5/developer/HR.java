package com.aca.classroom.week5.developer;

public class HR {

    public static void main(String[] args) {
        Developer junior1 = new JuniorDeveloper("Eric", 300_000);
        Developer junior2 = new JuniorDeveloper("Jane", 350_000);
        Developer junior3 = new JuniorDeveloper("Jane", 290_000);

        Developer mid1 = new MidDeveloper("Yan");
        Developer mid2 = new MidDeveloper("Gascon");

        Developer[] devs = {junior1, junior2, junior3, mid1, mid2};


        System.out.println(calculateSalary(devs));

        Developer juniorToPrint = new JuniorDeveloper("Eric", 300_000);
        printSalary(juniorToPrint);
        Printers.printAll(devs);
    }

    public static void printSalary(Developer developer) {
        System.out.println(developer.getSalary());
    }

    public static long calculateSalary(Developer[] devs) {
        long sum = 0;
        for (int i = 0; i < devs.length; i++) {
            sum += devs[i].getSalary();
        }
        return sum;
    }

 /*   public static long calculateSalary(JuniorDeveloper[] juniors) {
        long sum = 0;
        for (int i = 0; i < juniors.length; i++) {
            sum += juniors[i].getSalary();
        }
        return sum;
    }

    public static long calculateSalary(MidDeveloper[] mids) {
        long sum = 0;
        for (int i = 0; i < mids.length; i++) {
            sum += mids[i].getSalary();
        }
        return sum;
    }*/
}
