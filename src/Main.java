public class Main {

    public static void main(String[] args) {
        String name = "caminandoando";

        // Search index of character
        System.out.println(name.indexOf('c'));
        System.out.println(name.indexOf('a'));
        System.out.println(name.indexOf('a', 2));
        System.out.println(name.lastIndexOf('a'));
        System.out.println(name.indexOf('z'));

        // Search char at index
        System.out.println(name.charAt(1));

        // search substring in a string
        System.out.println(name.indexOf("ando"));
        System.out.println(name.lastIndexOf("ando"));
        System.out.println(name.indexOf("ando", 6));
        System.out.println(name.lastIndexOf("ando", 8));

        // verify if string contains a specific sequence
        System.out.println(name.contains("ando"));
        System.out.println(name.contains("camina"));
        System.out.println(name.contains("andoandoo"));
        System.out.println(name.startsWith("andoandoo"));
        System.out.println(name.endsWith("do"));
    }
}
