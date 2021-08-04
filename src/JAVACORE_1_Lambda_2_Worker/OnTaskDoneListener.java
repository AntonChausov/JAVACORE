package JAVACORE_1_Lambda_2_Worker;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
