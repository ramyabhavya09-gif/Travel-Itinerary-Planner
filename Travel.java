import java.util.*;

class Travel {
    String place, date, activity, mode;

    Travel(String p, String d, String a, String m) {
        place=p; date=d; activity=a; mode=m;
    }

    void show() {
        System.out.println("\n--- Travel Itinerary ---");
        System.out.println("Destination: " + place);
        System.out.println("Date: " + date);
        System.out.println("Activity: " + activity);
        System.out.println("Travel Mode: " + mode);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Destination: ");
        String p=s.nextLine();
        System.out.print("Date: ");
        String d=s.nextLine();
        System.out.print("Activity: ");
        String a=s.nextLine();
        System.out.print("Travel Mode: ");
        String m=s.nextLine();

        new Travel(p,d,a,m).show();
    }
}
