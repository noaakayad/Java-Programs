package Point;

public class MainFigure {

	public static void main(String[] args) {
        Point p1 = new Point(6,7);
        Point p2 = new Point(5,2);
        Point p3 = new Point(25,25);
        //point p4 = new Point(90,90);
        Circle c1 = new Circle(p1,-10);
        Circle c2 = new Circle(p1,150);
        Circle c3 = new Circle(p2,10);
        Circle c4 = new Circle(p3,100);

        //rayon négatif
        System.out.print("rayon négatif :");
        c1.display();
        //trop grand
        System.out.println("rayon trop grand : ");
        c2.display();
        c3.display();
        c4.display();

        //p2 est dans le disque formé par c1 puis p3
        System.out.println("p2 est dans le disque que forem c1 ?"+ c1.inDisque(p2));
        System.out.println("p3 est dans le disque que forem c1 ?"+ c1.inDisque(p3));

        //c1 et c3 se superposent, mais pas c3 et c4
        System.out.println("c1 et c3 se superposent ?"+ c1.superpose(c3));
        System.out.println("c1 et c4 se superposent ?"+ c1.superpose(c4));
    }

}
