public class SNode <T> {

    T data;
    SNode<T> next;
    SNode(){
        this.data=null;
        this.next=null;
    }
    SNode(T data){
        this.data=data;
        this.next=null;
    }
}
