public class DogFactory {

    private static enum DogTypes{Basenji, Beagle, Chihuahua, Poodle}

    public Dog newDog(){
        int length = DogTypes.values().length;
        int rand = (int) Math.random()*length; // or initialize a random
        Dog newDog = null;
        try {
            newDog = (Dog)Class.forName(DogTypes.values()[rand].toString()).getDeclaredConstructor().newInstance();
        } catch (Exception e){
            System.out.println("Issue");
        }
        return newDog;
    }

}
