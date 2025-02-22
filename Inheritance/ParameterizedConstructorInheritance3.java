class Room{
    int length, breadth;

    Room(int l, int b){
        length = l;
        breadth = b;
    }

    int area(){
        return length*breadth;
    }
}

class BedRoom extends Room{
    int height;

    BedRoom(int x, int y, int z){
        super(x,y);
        height = z;
    }

    int volume(){
        return length*breadth*height;
    }
}


public class ParameterizedConstructorInheritance3 {
    public static void main(String[] args) {
        BedRoom b = new BedRoom(10,20,30);
        int a = b.area();
        int v = b.volume();

        System.out.println("area="+a);
        System.out.println("volume="+v);
    }
}
