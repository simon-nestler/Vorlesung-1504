public class App {
    public static void main(String[] args) throws Exception {

        GenericList<Integer> list = new GenericList<>();

        int a = 3;
        int b = 4;

        // Integer aObject = Integer.valueOf(a);
        // Integer bObject = Integer.valueOf(b);

        list.add(a);
        list.add(b);

        System.out.println(list);
        System.out.println(list.get(0));
    }
}
