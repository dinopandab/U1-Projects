import java.util.Scanner;

public class MadLib {
    /*Create your own MadLibs. (https://www.madtakes.com/) You may use a story or example from the
    website if you don't wish to make up your own. This program must run entirely in the console.
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String name;
        String adjective;
        String place;
        String animal;
        String sillyName;

        System.out.println("Give me a name:");
        name = read.nextLine();

        System.out.println("Give me a adjective:");
        adjective = read.nextLine();

        System.out.println("Give me a place:");
        place = read.nextLine();

        System.out.println("Give me a animal:");
        animal = read.nextLine();

        System.out.println("Give me a silly name :");
        sillyName = read.nextLine();

        System.out.println("Wow did you know " + name + " has a " + adjective + " shirt and wore it to "
                + place + ". He told several people he has a " + animal + " named " + sillyName);

    }

}