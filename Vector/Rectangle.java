class Rectangle{
    public static void main(String[] args) {
        Rectangle rect[] = new Rectangle[5]; //rect array will store 5 references of class Rectangle

        //creating 5 objects of Rectangle class
        for(int i=0;i<5;i++){
            rect[i] = new Rectangle();
        }

    }
}