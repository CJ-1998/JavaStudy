import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList <T> implements Iterable<T>{

    private MyLinkedListNode head;
    private MyLinkedListNode tail;
    private int nowIndex;

    public MyLinkedList(){
        head=null;
        tail=null;
        nowIndex=0;
    }

    public void add(T data){
        MyLinkedListNode newNode=new MyLinkedListNode(data, null, nowIndex++);
        if(head==null){
            head=newNode;
        }
        if(tail!=null){
            tail.link=newNode;
        }

        tail=newNode;
    }

    public void addHead(T data){
        MyLinkedListNode newNode=new MyLinkedListNode(data, null, nowIndex++);
        if(head==null){
            tail=newNode;
        }
        if(head!=null){
            newNode.link=head;
        }

        head=newNode;
    }

    public T get(int index) throws Exception{
        MyLinkedListNode tempNode;

        if(nowIndex<index){
            throw new ArrayIndexOutOfBoundsException();
        }
        else{
            tempNode=head;
            for(int i=1;i<index;i++){
                tempNode=tempNode.link;
            }
            T tempData=(T)tempNode.getData();
            return tempData;
        }
    }

    public T delete(int index){
        MyLinkedListNode tempNode;

        if(nowIndex<index){
            throw new ArrayIndexOutOfBoundsException();
        }
        else{
            tempNode=head;
            for(int i=1;i<index-1;i++){
                tempNode=tempNode.link;
            }
            T tempData=(T)tempNode.link.getData();

            tempNode.link=tempNode.link.link;
            nowIndex--;

            return tempData;
        }
    }

    public T deleteHead(){
        if(head==null){
            throw new ArrayIndexOutOfBoundsException();
        }
        else{
            T data= (T) head.getData();
            head=head.link;

            return data;
        }
    }

    public int getNowIndex(){
        return nowIndex;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class MyIterator<T> implements Iterator<T> {
        private MyLinkedListNode<T> currentNode = head;

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T data = currentNode.getData();
            currentNode = currentNode.link;
            return data;
        }
    }
}

class MyLinkedListNode<T>{

    private T data;
    public MyLinkedListNode link;
    public int index;

    public MyLinkedListNode(T data, MyLinkedListNode link, int index){
        this.data=data;
        this.link=link;
        this.index=index;
    }

    public T getData(){
        return data;
    }
}