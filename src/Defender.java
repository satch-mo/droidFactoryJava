public interface Defender {

    public default void defend() {
        System.out.println("Shocked Enemy");
    }
}
