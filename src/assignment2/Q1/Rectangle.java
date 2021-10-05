package assignment2.Q1;

 class Rectangle extends Shape{
    private  int width;
    private  int height;

    public Rectangle(int side){
        this.width=side;
        this.height=side;
    }

     public Rectangle(int width, int height) {
         this.width = width;
         this.height = height;
     }

     public Rectangle(String name, String color, int width, int height) {
         super(name, color);
         this.width = width;
         this.height = height;
     }

     @Override
     public int getArea() {
       return this.height*this.width;
     }

     @Override
     public int getPerimeter() {
         return (this.height+this.width)*2;
     }
 }
