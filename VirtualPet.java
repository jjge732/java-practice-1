public class VirtualPet {
    public static void main(String[] args) {
        System.out.println("This object will make virtual pets");
        String name = System.console().readLine("What would you like to call your dog?  ");
        Dog snoopie = new Dog(name);

        snoopie.feed();
        System.out.println("Your dog has been fed");
        snoopie.letOutside();
        System.out.println("Your dog has been let out");

    }
}