public class App {
    public static void main(String[] args) throws Exception {

        GenericList<Integer> list = new GenericList<>();
        list.add(3);
        list.add(4);

        System.out.println(list);
        System.out.println(list.get(0));
    }
}
