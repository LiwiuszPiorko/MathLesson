public class MathLesson {

    public static void main(String[]args){

    Triangle triangle1= new Triangle(5.5,6.6, 7.7);
    Method check= new Method();
    boolean isRightTriangle = check.isRightTriangle(triangle1);

    if (isRightTriangle){
        System.out.println("Trójkąt jest trójkątem prostokątnym");
    }else{
        System.out.println("Trójkąt nie jest trójkątem prostokątnym");
        }
    }
}
