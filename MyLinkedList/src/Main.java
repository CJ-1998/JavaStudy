import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws Exception {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();

        list.add(1);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        for (Integer data: list) {
            System.out.println(data);
        }

        System.out.println("==========");

        System.out.println(list.get(1));
        System.out.println(list.get(2));

        System.out.println("==========");

        list.delete(3);

        for (Integer data: list) {
            System.out.println(data);
        }

        System.out.println("==========");

        list.addHead(199);

        for (Integer data: list) {
            System.out.println(data);
        }

        System.out.println("=====QUEUE=====");

        MyQueue<Integer> q = new MyQueue<Integer>();

        q.enqueue(1);
        q.enqueue(22);
        q.enqueue(33);
        q.enqueue(44);

        for (Integer data: q.getQueueList()) {
            System.out.println(data);
        }

        System.out.println("==========");

        q.dequeue();

        for (Integer data: q.getQueueList()) {
            System.out.println(data);
        }

        System.out.println("=====STACK=====");
        MyStack<Integer> s = new MyStack<Integer>();

        s.push(100);
        s.push(200);
        s.push(300);
        s.push(400);

        for (Integer data: s.getStackList()) {
            System.out.println(data);
        }

        System.out.println("==========");

        s.pop();
        s.pop();

        for (Integer data: s.getStackList()) {
            System.out.println(data);
        }

        System.out.println("==========");
    }
}
