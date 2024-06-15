package academy.learnprogramming.queues;

import java.util.NoSuchElementException;

public class ArrayQueue extends EmployeeDSA{

    private Employee[] queue;
    private int front;
    private int back;

    ArrayQueue(int taille){
        queue = new Employee[taille];
    }

    @Override
    public void add(Employee employee) {
        if(queue.length==back){
            Employee[] tmpEmployeeTab = new Employee[queue.length*2];
            System.arraycopy(queue,  0, tmpEmployeeTab, 0, queue.length);
            queue = tmpEmployeeTab;
        }
        queue[back++]=employee;
    }

    @Override
    public Employee remove() {
        if(size()==0){
            throw new NoSuchElementException();
        }
        Employee retrunEmployye = queue[front];
        queue[front++] = null;  
        if(size()==0){
            front=back=0;
        }
        return retrunEmployye;     
    }

    @Override
    public Employee peek() {
        if(size()==0){
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    @Override
    public int size() {
        return back - front;
    }

    @Override
    public void print() {
        for(int i = front; i<back; i++){
            System.out.println(i +"===> "+queue[i]);
        }
    }
    
}
