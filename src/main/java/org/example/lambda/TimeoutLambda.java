package org.example.lambda;

import com.amazonaws.services.lambda.runtime.Context;


public class TimeoutLambda {

    /**
     * to test use some string i.e "ALLA"
     * @param input
     * @param context
     * @throws InterruptedException
     */
    public void handler(Object input, Context context) throws InterruptedException {
        while (true) {
            Thread.sleep(100);
            System.out.println("Context.getRemainingTimeInMillis() : " +
                    context.getRemainingTimeInMillis());
        }
    }
}

