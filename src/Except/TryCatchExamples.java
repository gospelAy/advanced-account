package Except;


public class TryCatchExamples {
    public static void main(String[] args){
        try {
            int [] grade = {23, 67, 78};
            System.out.println(grade[2]);
        }catch (Exception e){
            System.out.println("An Exception happened ");
        }

    }
}

