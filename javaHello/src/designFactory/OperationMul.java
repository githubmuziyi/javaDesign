package designFactory;

/**
 * Created by hewei on 2016/11/19.
 */
class OperationMul extends AbstractOperation {
    public double getresult(double numbera, double numberb) {
        double result = 0;
        result = numbera * numberb;
        return result;
    }
}
