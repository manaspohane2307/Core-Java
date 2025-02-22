interface Area{
    final static float pi = 3.14f;
    abstract float compute(float x, float y);
}

class Rectangle implements Area{
    public float compute(float x, float y){
        return x*y;
    }
}

class Circle implements Area{
    public float compute(float x, float y){
        return pi*x*x;
    }
}

class InterfaceProgram{
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println("Area of rectangle is=" + r.compute(10, 20));
        Circle c = new Circle();
        System.out.println("Area of circle is=" + c.compute(10, 0));
    }
}