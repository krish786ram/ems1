class test {void m1() {System.out.print("A");}}
class B extends test {void m1(){System.out.print("B");}}
class C extends B {void m1() {System.out.print("C");}}
class D extends C {
  void m1() {System.out.print("D");}
  void m2() {
    m1();
    ((C)this).m1(); // 1
    ((B)this).m1(); // 2
    ((test)this).m1(); // 3
  }
  public static void main (String[] args) {
    new D().m2(); // 4
}}
