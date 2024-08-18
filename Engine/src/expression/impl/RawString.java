package expression.impl;
import expression.api.Data;
import expression.api.DataType;
import expression.api.Expression;

public class RawString extends ExpressionImpl {

    private String value;

    public RawString(String value) {
        this.value = value;
        setDataType(DataType.STRING);
        isValidArgs(value);
    }

    @Override
    public Data evaluate() {

        return new DataImpl(DataType.STRING, (String)this.value);
    }

    @Override
    public boolean isValidArgs(Object... args) {
        return false;
    }
    //    @Override
//    public String getOperationSign() {
//        return "";
//    }
//
//    @Override
//    public String toString() {
//        return value;
//    }
}