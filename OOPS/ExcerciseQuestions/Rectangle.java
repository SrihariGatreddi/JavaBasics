package OOPS.ExcerciseQuestions;

public class Rectangle {
        private float length=1;
        float peri;
        private float width=1;
        public Rectangle() {

        }
            public void setLength ( float len1){
                if (len1 > 0.0 && len1 <= 20)
                    this.length = len1;
            }
            public void setWidth ( float wid){
                if (wid > 0.0 && wid <= 20)
                    this.width = wid;
            }
            public float getWidth () {
                return width;
            }
            public float getLegth () {
                return length;
            }
        void perimeter(){
            System.out.printf("Perimeter of the rectangle is :%f",2*(this.length+this.width));
        }
        public void area(){
            System.out.printf("Area of the rectangle is: %f",this.length*this.width);
        }
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.setLength(3.5f);
        r1.setWidth(4.5f);
        r1.perimeter();
        r1.area();
    }
}
