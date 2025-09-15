public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("OS: " + System.getProperty("os.name"));
        System.out.println("OS Version: " + System.getProperty("os.version"));
        System.out.println("OS Architecture: " + System.getProperty("os.arch"));
        System.out.println("User Name: " + System.getProperty("user.name"));
        System.out.println("User Home: " + System.getProperty("user.home"));
        System.out.println("Working Dir: " + System.getProperty("user.dir"));
        System.out.println("File Separator: " + System.getProperty("file.separator"));
        System.out.println("Line Separator: " + System.getProperty("line.separator").replace("\n", "\\n"));
    }
}