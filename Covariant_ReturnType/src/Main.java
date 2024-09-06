import java.util.Scanner;

class Flower {
    String whatsYourName() {
        return "I have many names and types.";
    }
}

class Jasmine extends Flower {
    @Override
    String whatsYourName() {
        return "Jasmine";
    }
}

class Lily extends Flower {
    @Override
    String whatsYourName() {
        return "Lily";
    }
}

class Region {
    Flower yourNationalFlower() {
        return new Flower();
    }
}

class WestBengal extends Region{
    @Override
    Jasmine yourNationalFlower() {
        return new Jasmine();
    }
}

class AndhraPradesh extends Region{
    @Override
    Lily yourNationalFlower() {
        return new Lily();
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a State name (AndhraPradesh, WestBengal): ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Region region = null;
        switch (s) {
            case "WestBengal":
                region = new WestBengal();
                break;
            case "AndhraPradesh":
                region = new AndhraPradesh();
                break;
        }
        Flower flower = region.yourNationalFlower();

        System.out.print("National flower: ");
        System.out.println(flower.whatsYourName());
    }
}