public class Main {
    public static void main(String[] args){

        SimpleLogger sml = new SimpleLogger();
        sml.log("my first message");

        SmartLogger smartl = new SmartLogger();
        smartl.log("my seccond message");
        smartl.log("my first error message");
    }
}