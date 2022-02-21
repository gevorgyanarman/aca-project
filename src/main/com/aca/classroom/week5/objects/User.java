package com.aca.classroom.week5.objects;

public class User {

    private String name;
    private String password;
    private int age;

    public User(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }
/*
    @Override
    public boolean equals(Object obj) {
        User user = (User) obj;

        Integer integerAge = user.age;
        Integer integerThisAge = this.age;

        return integerAge.equals(integerThisAge);
    }
*/

    public static void main(String[] args) {
        User user1 = new User("Koryun", "karyoun2005", 16);
        User user2 = new User("Koryun", "karyoun2005", 16);
        User user5 = new User("Koryun", "karyoun2005", 16);

        User user3 = new User("Koryun1", "karyoun2006789", 15);
        User user4 = new User("Koryun1", "karyoun2006", 15);

        System.out.println(user1 == user2);

        //ChildUser childUser = new ChildUser("KoryunPoqr", "karyoun2015", 6);
        //System.out.println(user1.equals(childUser));

        System.out.println(user1.equals(user2));
        System.out.println(user3.equals(user4));
        System.out.println(user3.equals(user3));

        User user8 = user3;

        User[] users = {user1, user2, user3, user4};
        System.out.println(getUserIndex(users, user1));

        System.out.println("sentence".equals(user3));
        System.out.println(user3.equals("sentence"));
        System.out.println("sentence".equals(null));
        System.out.println(user1.equals(null));
        System.out.println(user1.equals(user1));

        System.out.println(user1.equals(user2));
        System.out.println(user2.equals(user5));
        System.out.println(user1.equals(user5));

        //1) a.equals(b) == b.equals(a)
        //2) a.equals(null) -> false
        //3) a.equals(a)    -> true
        //4) a.equals(b) is true, b.equals(c) is true => a.equals(c) -> true
        //5) equals does not depends on invocation number
    }

    public static int getUserIndex(User[] users, User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(user)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || obj.getClass() != User.class) {
            return false;
        }

        User user = (User) obj;

        return user.age == this.age
            && user.name.equals(this.name)
            && user.password.equals(this.password);
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

}
