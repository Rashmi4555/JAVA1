public class methoverloading {
    static int method(int a,int b){
        return a+b;
    }
    double method(double a,double b){
        return a+b;
    }
    public static void main(String[]args){
        int sum1 = method(5,4);
        methoverloading obj= new methoverloading();
        double sum = obj.method(5.4,2.4);
        System.out.println("Sum is"+sum1);
        System.out.println("Sum is"+sum);
        System.out.println("This is method overloading");
    }
}
