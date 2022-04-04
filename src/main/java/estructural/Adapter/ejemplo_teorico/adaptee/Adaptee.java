package estructural.Adapter.ejemplo_teorico.adaptee;

public class Adaptee {

    public double specificRequest(int[] arr) {
        System.out.println("Executing old logic of Adaptee");
        double result = 0;
        for(int i : arr){
            result += i;
        }
        return result;
    }

}
