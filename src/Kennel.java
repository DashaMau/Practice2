public class Kennel {
    public static void main(String[] args) {
        Kennel kennel = new Kennel(2);

        Dog dog1 = new Dog("Buddy", 2);
        Dog dog2 = new Dog("Max", 3);

        kennel.addDog(dog1);
        kennel.addDog(dog2);

        kennel.printDogs();

        System.out.println(kennel.dogs[0].getName());
        kennel.dogs[0].setName("Tuzik");
        System.out.println(kennel.dogs[0].getName());

        System.out.println(kennel.dogs[0].getAge());
        kennel.dogs[0].setAge(11);
        System.out.println(kennel.dogs[0].getAge());

        for (int i = 0; i < kennel.dogs.length; i++) {
            System.out.println("Кличка: "+ kennel.dogs[i].getName() +", возраст: "+kennel.dogs[i].getAge()+"("+kennel.dogs[i].convertToHumanAge()+")");
        }
    }
    private Dog[] dogs;
    private int currentIndex;

    public Kennel(int size) {
        dogs = new Dog[size];
        currentIndex = 0;
    }

    public void addDog(Dog dog) {
        if (currentIndex < dogs.length) {
            dogs[currentIndex] = dog;
            currentIndex++;
        } else {
            System.out.println("Kennel is full, cannot add more dogs.");
        }
    }

    public void printDogs() {
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(dogs[i]);
        }
    }

}