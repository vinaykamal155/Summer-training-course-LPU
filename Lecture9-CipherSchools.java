class shape{
    double pi = 3.14;
    double get_square(int r){
        return r*r;
    }
}
class circle extends shape{
    void area(int t){
        System.out.println(pi*get_square(t));
    }
}
public class Lecture_9 {
    public static void main(String[] args) {
        circle c1 = new circle();
        c1.area(15);
    }
}
