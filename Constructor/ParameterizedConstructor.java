public class ParameterizedConstructor {
    public static void main(String[] args) {
        Rectangle R = new Rectangle(100, 200);
        R.showData();
    }
}

class Rectangle{
    int height, width;

    Rectangle(int h, int w){ //parameterized constructor
        height=h;
        width=w;
    }

    void showData(){
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
    }

}


