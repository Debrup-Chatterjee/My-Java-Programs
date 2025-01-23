public class GenericClass2<T> {
     T a[];

     GenericClass2(T x[]) {
          a = x;
     }

     T getData(int i) {
          return a[i];
     }

     void printData() {
          for (int i = 0; i < a.length; i++)
               System.out.print(getData(i) + " ,");
          System.out.println();
     }

     void reverseArray() {
          int f = 0, r = a.length - 1;
          T temp;
          while (f < r) {
               temp = a[r];
               a[r] = a[f];
               a[f] = temp;
               f++;
               r--;
          }
     }

     public static void main(String[] args) {
          Integer x[] = { 10, 20, 30, 40, 50 };
          GenericClass2<Integer> ob1 = new GenericClass2<Integer>(x);
          ob1.printData();
          ob1.reverseArray();
          ob1.printData();
          Double y[] = { 1.2, 2.2, 3.2 };
          GenericClass2<Double> ob2 = new GenericClass2<Double>(y);
          ob2.printData();
          ob2.reverseArray();
          ob2.printData();
          String z[] = { "hello", "hi", "hey", "aloha" };
          GenericClass2<String> ob3 = new GenericClass2<String>(z);
          ob3.printData();
          ob3.reverseArray();
          ob3.printData();
     }
}
