public class MyStack<T> {
    private MyLinkedList<T> stackList;

    public MyStack(){
        stackList=new MyLinkedList<T>();
    }

    public void push(T data){
        stackList.add(data);
    }

    public T pop() throws Exception {
        T data=stackList.get(stackList.getNowIndex());
        stackList.delete(stackList.getNowIndex());
        return data;
    }

    public MyLinkedList<T> getStackList(){
        return stackList;
    }

}
