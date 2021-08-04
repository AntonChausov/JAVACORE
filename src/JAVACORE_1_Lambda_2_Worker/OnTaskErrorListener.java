package JAVACORE_1_Lambda_2_Worker;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
