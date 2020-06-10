package org.coffeecodecontribute.jmather.service;

import io.grpc.stub.StreamObserver;
import mather.MatherGrpc;
import mather.MatherOuterClass;
import org.coffeecodecontribute.jmather.core.MatherCore;

public class MatherServiceImpl extends MatherGrpc.MatherImplBase implements MatherService {
    MatherCore matherCore;

    public MatherServiceImpl(MatherCore matherCore) {
        this.matherCore = matherCore;
    }

    @Override
    public void add(MatherOuterClass.MathRequest request, StreamObserver<MatherOuterClass.MathResponse> responseObserver) {
        double res = this.matherCore.add(request.getA(), request.getB());

        responseObserver.onNext(MatherOuterClass.MathResponse.newBuilder().setResult(res).build());

        responseObserver.onCompleted();
    }

    @Override
    public void subtract(MatherOuterClass.MathRequest request, StreamObserver<MatherOuterClass.MathResponse> responseObserver) {
        double res = this.matherCore.subtract(request.getA(), request.getB());

        responseObserver.onNext(MatherOuterClass.MathResponse.newBuilder().setResult(res).build());

        responseObserver.onCompleted();
    }
}
