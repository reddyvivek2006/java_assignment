public class SListIterator<T> {
    SNode<T> head;
    public SListIterator(SList<T> list){
        this.head=list.head;
    }
    public void add(T data){
        SNode<T> temp=head;
        if(!this.isEmpty()){
            SNode<T> last=new SNode<T>(data);
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=last;
        }
        else{
            temp.data=data;
            temp.next=null;
        }

    }
    public void remove(){
        SNode<T> temp=head;
        SNode<T> pre=new SNode<T>();
        if(temp.next==null) {
            temp.data = null;
        }
        else {
            while(temp.next!=null){
                pre=temp;
                temp=temp.next;
            }
            pre.next=null;

        }
    }
    boolean isEmpty(){
        if(head.data==null){
            return true;
        }
        else{
            return false;
        }
    }


}

