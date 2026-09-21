package polymorphism;

public class Calculator {
    int sum(int a,int b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }

    double sum(int a,int b,double c){
        return a+b+c;
    }
}
