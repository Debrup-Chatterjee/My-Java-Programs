class GenDemo<T>
{
    static void gprint(T t)
    {
        System.out.println(t);
    }
    public static void main(String[] args) {
        gprint(101);
        gprint("Joy with java");
        gprint(3.1423);
    }
}