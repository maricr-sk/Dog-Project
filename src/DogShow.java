public class DogShow {

    private static final int COUNT = 100;
    private Dog[] dogs;
    private DogFactory df;

    public DogShow(){
        dogs = new Dog[COUNT];
        df = new DogFactory();
        for(int i = 0; i < COUNT; i++){
            dogs[i] = df.newDog();
        }
    }

    public static void main(String[] args) {
        DogShow ds = new DogShow();
        for(Dog d : ds.dogs) d.speak();
    }
}
