package entities;

public class Student {

    public String name;
    public double n1;
    public double n2;
    public double n3;

    public double sumNot(){
        return n1 + n2 + n3;

    }

    public double missing(){
        if(sumNot() < 60){
            return 60 - sumNot();
        }else{
            return 0.0;
        }

    }


}
