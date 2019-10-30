package demoday;

import java.util.concurrent.Callable;

public class thead implements Callable {

    @Override
    public Integer call() throws Exception {
        System.out.println("aaa");
        return 2;
    }
}
