package FI_Proj12_Suppliers;

import java.util.function.Supplier;

public class CurrentJavaVesion {
    public static void main(String[] args) {
        Supplier<String> version = ()-> System.getProperty("java.version");
        System.out.println(version.get());
    }
}
