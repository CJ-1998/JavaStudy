public class MyQueue<T> {

    private MyLinkedList<T> queueList;

    public MyQueue(){
        queueList=new MyLinkedList<T>();
    }

    public void enqueue(T data){
        queueList.add(data);
    }

    public T dequeue() throws Exception {
        T data=queueList.get(1);
        queueList.deleteHead();
        return data;
    }

    public MyLinkedList<T> getQueueList(){
        return queueList;
    }
}
