public class Main {

        public static void main(String[] args){


        SList<Integer> list=new SList<>();
        SListIterator<Integer> it=new SListIterator<>(list);
        it.add(10);
        System.out.println(list.toString());
        it.add(12);
        System.out.println(list.toString());
        it.remove();
        System.out.println(list.toString());
        it.add(39);
        it.add(5);
        it.remove();
        System.out.println(it.isEmpty());
        System.out.println(list.toString());

    }
}
