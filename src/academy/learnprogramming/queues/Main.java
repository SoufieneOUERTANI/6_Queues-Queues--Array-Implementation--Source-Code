package academy.learnprogramming.queues;

public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        ArrayQueue queue = new ArrayQueue(10);
        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);
        queue.add(billEnd);
        System.out.println("1>>>>>>");
        queue.print();

        queue.remove();
        queue.remove();
        System.out.println("2>>>>>>");
        queue.print();

        System.out.println("2>>>>>>");
        System.out.println(queue.peek());
        queue.remove();
        queue.remove();
        queue.remove();
        // queue.remove();

        queue.add(mikeWilson);
        
        System.out.println("3>>>>>>");
        queue.print();

    // 1>>>>>>
    // Employee{firstName='Jane', lastName='Jones', id=123}
    // Employee{firstName='John', lastName='Doe', id=4567}
    // Employee{firstName='Mary', lastName='Smith', id=22}
    // Employee{firstName='Mike', lastName='Wilson', id=3245}
    // Employee{firstName='Bill', lastName='End', id=78}
    // 2>>>>>>
    // Employee{firstName='Mary', lastName='Smith', id=22}
    // Employee{firstName='Mike', lastName='Wilson', id=3245}
    // Employee{firstName='Bill', lastName='End', id=78}
    // 2>>>>>>
    // Employee{firstName='Mary', lastName='Smith', id=22}
    // 3>>>>>>
    // Employee{firstName='Mike', lastName='Wilson', id=3245}

    }
}
