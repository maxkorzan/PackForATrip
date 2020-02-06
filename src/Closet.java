import java.util.ArrayList;

public class Closet {
        Jacket jacket;
        Shirt shirt;
        Pants pants;
        Footwear footwear;


    public static void main(String[] args) {
        ArrayList<Clothes> work = new ArrayList<>();
        ArrayList<Clothes> play = new ArrayList<>();

        work.add(new Jacket("blazer","navy","wool"));
        work.add(new Shirt("shirt1","navy","wool"));
        work.add(new Pants("asbc","navy","wool"));
        work.add(new Footwear("1123","navy","wool"));

        play.add(new Jacket("rainjacket","navy","wool"));
        play.add(new Shirt("t-shirt","navy","wool"));
        play.add(new Pants("jeans","NAVYYYY","wool"));
        play.add(new Footwear("sneakers","navy","wool"));

        //print work suitcase (names)
        for(int i=0; i<work.size(); i++){
            System.out.println(work.get(i).getName());
        }

        //print play suitcase (names)
        for(int i=0; i<play.size(); i++){
            System.out.println(play.get(i).getColor()+play.get(i).getName());
        }

        //test - get just the color of play pants
        System.out.println(play.get(2).getColor());


    }
}
