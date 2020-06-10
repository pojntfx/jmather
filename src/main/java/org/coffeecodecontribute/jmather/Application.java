package org.coffeecodecontribute.jmather;

import io.grpc.ServerBuilder;
import org.coffeecodecontribute.jmather.core.MatherCore;
import org.coffeecodecontribute.jmather.core.MatherCoreImpl;
import org.coffeecodecontribute.jmather.service.MatherService;
import org.coffeecodecontribute.jmather.service.MatherServiceImpl;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException, InterruptedException {
        int port = Integer.valueOf(System.getenv("PORT"));

        System.out.printf("Starting jmather on port %d", port);

        MatherCore matherCore = new MatherCoreImpl();
        MatherService matherService = new MatherServiceImpl(matherCore);

        ServerBuilder.forPort(port).addService(matherService).build().start().awaitTermination();
    }
}
