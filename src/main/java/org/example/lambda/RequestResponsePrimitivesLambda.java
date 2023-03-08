package org.example.lambda;

public class RequestResponsePrimitivesLambda {

    /**
     * to test use true or "true"
     */
    public boolean handlerBoolean(boolean input) {
        return !input;
    }

    /**
     * to test use 101 or "101"
     */
    public boolean handlerInt(int input) {
        return input > 100;
    }

    /**
     *  to test use 101 or "101"
     */
    public boolean handlerInteger(Integer input) {
        return input > 100;
    }
}
