package com.company;

public class InheritanceDemo {
    static AbstractTable [] tables = new AbstractTable[5];

    public static void main(String[] args) {
        //class
        //arrays
        //enum

        globalInit();
        for (int i = 0; i < tables.length; i++) {
            tables[i].init();
        }


    }

    public static void globalInit() {
        tables[0] = new UserTable();
        tables[1] = new NotificationTable();
        tables[2] = new AddressTable();
        tables[3] = new PasswordTable();
        tables[4] = new AccountTable();
    }
}

abstract class AbstractTable {
    abstract void init();
}

class UserTable extends AbstractTable {
    public UserTable() {
        //delete
        //create table
    }

    @Override
    void init() {
        System.out.println("UserTable initialization");
    }
}

class NotificationTable extends AbstractTable {
    public NotificationTable() {
        //delete
        //create table
    }

    @Override
    void init() {
        System.out.println("NotificationTable initialization");
    }
}

class AddressTable extends AbstractTable {
    @Override
    void init() {
        System.out.println("AddressTable init");
    }
}

class PasswordTable extends AbstractTable {
    @Override
    void init() {
        System.out.println("PasswordTable init");
    }
}

class AccountTable extends AbstractTable {
    @Override
    void init() {
        System.out.println("AccountTable init");
    }
}