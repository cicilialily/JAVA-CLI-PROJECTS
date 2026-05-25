public class MagicPouch {
    public static void main(String[]args){
        pouch<String>pouch = new pouch<>();
        pouch.store("gem");
        System.out.println("item:"+pouch.retrive());
    }
}
class pouch<T>{
    private T item;

    public void store(T item){
        this.item = item;
    }
    public T retrive(){
        return item;
    }
}
