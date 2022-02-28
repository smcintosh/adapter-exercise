package ca.uwaterloo.cs446.designpatterns.adapter;

public class CircleAdapter implements Shape {
   private Circle adaptee;
   
   public CircleAdapter(Circle circle) {
       this.adaptee = circle;
   }

   @Override
   public void draw(int x1, int y1, int x2, int y2) {
       int centerX = (Math.max(x1, x2) - Math.min(x1, x2)) / 2;
       int centerY = (Math.max(y1, y2) - Math.min(y1, y2)) / 2;
       adaptee.draw(centerX, centerY, Math.min(Math.abs(x1 - x2), Math.abs(y1 - y2)));
   }
}
