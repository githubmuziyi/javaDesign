package designFactory;
import java.lang.String;
import java.util.Scanner;
/**
 * Created by hewei on 2016/11/19.
 */
class OperationFactory {
    public static AbstractOperation createOperation(String operate) {
        AbstractOperation oper = null;
        switch (operate) {
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
        }
        return oper;
    }
}

class OperationFactoryTest {
    public static void main (String[] args) throws Exception {
        try {
            AbstractOperation oper;
            Scanner scan = new Scanner(System.in);
            oper = OperationFactory.createOperation("*");
            System.out.print("input number a: ");
            double numbera = Double.parseDouble(scan.nextLine());
            System.out.print("input number b ");
            double numberb = Double.parseDouble(scan.nextLine());
            double result = oper.getresult(numbera, numberb);
            System.out.print("output result: ");
            System.out.print(result);
        } catch (Exception e) {
            throw new Exception("input type is error!");
        }
    }
}
