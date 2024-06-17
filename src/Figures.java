import java.util.Scanner;

abstract class Figure {
    public abstract double square();
    public abstract double perimeter();
}

class circle extends Figure {
    double radius;

    circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class quad extends Figure {
    double storona;

    quad(double storona) {
        this.storona = storona;
    }

    @Override
    public double square() {
        return storona * storona;
    }

    @Override
    public double perimeter() {
        return 4 * storona;
    }
}

class triangle extends Figure {
    double a, b, c;

    triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double square() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}

class pentagon extends Figure {
    double storona;

    pentagon(double storona) {
        this.storona = storona;
    }

    @Override
    public double square() {
        double apothem = storona / (2 * Math.tan(Math.PI / 5));
        return (5 * storona * apothem) / 2;
    }

    @Override
    public double perimeter() {
        return 5 * storona;
    }
}

class trapezoid extends Figure {
    double a, b, c, d, h;

    trapezoid(double a, double b, double c, double d, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
    }

    @Override
    public double square() {
        return (a + b) / 2 * h;
    }

    @Override
    public double perimeter() {
        return a + b + c + d;
    }
}

class rectangle extends Figure {
    double a, b;

    rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double square() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return 2 * (a + b);
    }
}

class parallelogram extends Figure {
    double a, h;
    double b;

    parallelogram(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double square() {
        return a * h;
    }

    @Override
    public double perimeter() {
        return 2 * (a + b);
    }
}
class parallelepiped extends Figure {
    double length, width, height;

    parallelepiped(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double square() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    public double perimeter() {
        return length * width * height;
    }
}

class cylinder extends Figure {
    double radius, height;

    cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double square() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double perimeter() {
        return Math.PI * radius * radius * height;
    }
}

class sphere extends Figure {
    double radius;

    sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }
}

class rhombus extends Figure {
    double d1, d2;

    rhombus(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    @Override
    public double square() {
        return 0.5 * d1 * d2;
    }

    @Override
    public double perimeter() {
        double a = Math.sqrt((d1 * d1 + d2 * d2) / 2);
        return 4 * a;
    }
}

class cone extends Figure {
    double radius, height;

    cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double square() {
        double l = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + l);
    }

    @Override
    public double perimeter() {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }
}

public class Figures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите фигуру:\n1 - Круг\n2 - Квадрат\n3 - Треугольник\n4 - Пятиугольник\n5 - Трапеция\n6 - Прямоугольник\n7 - Параллелограмм\n8 - Параллелепипед\n9 - Цилиндр\n10 - Сфера\n11 - Ромб\n12 - Конус");
        int vibor = scanner.nextInt();

        Figure Figure = null;
        switch (vibor) {
            case 1:
                System.out.println("Введите радиус круга:");
                double radius = scanner.nextDouble();
                Figure = new quad(radius);
                break;
            case 2:
                System.out.println("Введите длину стороны квадрата:");
                double storona = scanner.nextDouble();
                Figure = new quad(storona);

                break;
            case 3:
                System.out.println("Введите длину стороны a треугольника:");
                double a = scanner.nextDouble();
                System.out.println("Введите длину стороны b треугольника:");
                double b = scanner.nextDouble();
                System.out.println("Введите длину стороны c треугольника:");
                double c = scanner.nextDouble();
                Figure = new triangle(a, b, c);
                break;
            case 4:
                System.out.println("Введите длину стороны пятиугольника:");
                double storona1 = scanner.nextDouble();
                Figure = new pentagon(storona1);
                break;
            case 5:
                System.out.println("Введите длину основания a трапеции:");
                double a1 = scanner.nextDouble();
                System.out.println("Введите длину основания b трапеции:");
                double b1 = scanner.nextDouble();
                System.out.println("Введите длину боковой стороны c трапеции:");
                double c1 = scanner.nextDouble();
                System.out.println("Введите длину боковой стороны d трапеции:");
                double d1 = scanner.nextDouble();
                System.out.println("Введите высоту h трапеции:");
                double h1 = scanner.nextDouble();
                Figure = new trapezoid(a1, b1, c1, d1, h1);
                break;
            case 6:
                System.out.println("Введите длину стороны a прямоугольника:");
                double a2 = scanner.nextDouble();
                System.out.println("Введите длину стороны b прямоугольника:");
                double b2 = scanner.nextDouble();
                Figure = new rectangle(a2, b2);
                break;
            case 7:
                System.out.println("Введите длину стороны a параллелограмма:");
                double a3 = scanner.nextDouble();
                System.out.println("Введите длину смежной стороны b параллелограмма:");
                double b3 = scanner.nextDouble();
                System.out.println("Введите высоту h, опущенную на сторону a:");
                double h2 = scanner.nextDouble();
                Figure = new parallelogram(a3, b3, h2);
                break;
            case 8:
                System.out.println("Введите длину параллелепипеда:");
                double length = scanner.nextDouble();
                System.out.println("Введите ширину параллелепипеда:");
                double width = scanner.nextDouble();
                System.out.println("Введите высоту параллелепипеда:");
                double height = scanner.nextDouble();
                Figure = new parallelepiped(length, width, height);
                break;
            case 9:
                System.out.println("Введите радиус цилиндра:");
                double radius1 = scanner.nextDouble();
                System.out.println("Введите высоту цилиндра:");
                double height1 = scanner.nextDouble();
                Figure = new cylinder(radius1, height1);
                break;
            case 10:
                System.out.println("Введите радиус сферы:");
                double radius2 = scanner.nextDouble();
                Figure = new sphere(radius2);
                break;
            case 11:
                System.out.println("Введите длину диагонали d1 ромба:");
                double d11 = scanner.nextDouble();
                System.out.println("Введите длину диагонали d2 ромба:");
                double d22 = scanner.nextDouble();
                Figure = new rhombus(d11, d22);
                break;
            case 12:
                System.out.println("Введите радиус основания конуса:");

                double radius3 = scanner.nextDouble();
                System.out.println("Введите высоту конуса:");
                double height3 = scanner.nextDouble();
                Figure = new cone(radius3, height3);
                break;

            default:
                System.out.println("Неверный выбор. Попробуйте снова.");
                break;
        }

        if (Figure != null) {
            System.out.println("Площадь фигуры: " + Figure.square());
            System.out.println("Периметр фигуры: " + Figure.perimeter());
        }
    }
}