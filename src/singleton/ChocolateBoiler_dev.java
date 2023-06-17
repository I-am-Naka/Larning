package singleton;

public class ChocolateBoiler_dev {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler_dev uniqueInstance;

    private ChocolateBoiler_dev(){
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler_dev getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new ChocolateBoiler_dev();
        }
        return uniqueInstance;
    }

    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    public void drain(){
        if(!isEmpty() && isBoiled()){
            // 溶けた牛乳とチョコレートの混合液を空にする
            empty = true;
        }
    }

    public void boil(){
        if(!isEmpty() && !isBoiled()){
            // 中身を溶かす
            boiled = true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }
}
