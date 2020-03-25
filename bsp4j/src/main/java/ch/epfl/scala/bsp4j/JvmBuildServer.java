package ch.epfl.scala.bsp4j;

import org.eclipse.lsp4j.jsonrpc.services.JsonRequest;

import java.util.concurrent.CompletableFuture;

public interface JvmBuildServer {
    @JsonRequest("buildTarget/jvmEnvironment")
    CompletableFuture<JvmEnvironmentResult> jvmEnvironment(JvmEnvironmentParams params);

    @JsonRequest("buildTarget/jvmTestEnvironment")
    CompletableFuture<JvmTestEnvironmentResult> jvmTestEnvironment(JvmTestEnvironmentParams params);
}
