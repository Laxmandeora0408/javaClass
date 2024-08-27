public class Main {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.protectedField ="newOne";
        child.accessProtectedMembers();
        System.out.println(child.protectedField);
    }

}