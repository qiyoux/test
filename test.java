public class Demo01 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.speak();
        p1.calculate(100);
        int returnRes = p1.getSum(2,6);
        System.out.println(returnRes);
    }
}
class Person{
    String name;
    int age;

    public void speak(){
        System.out.println("我是一个好人");
    }

    public void calculate(int n){
        int res = 0;
        for (int i = 1; i <= n; i++)
        {
            res += i;
        }
        System.out.println("计算结果="+ res);
    }
  public int getSum(int num1,int nmu2){
        int res = num1 +nmu2;
        return res;
    }
}
