class Test<T>{
    void display(T[] ar){
        int sum=0;
        for(T i:ar){
            System.out.println(i);
            sum+=Integer.parseInt(i.toString());
        }
        System.out.println("SUM= "+sum);
    }    
}
public class NewClass4 {
    public static void main(String[] arg){
        Test ob1=new Test();
        Integer[] ar={1,2,3,4,5,6};
        ob1.display(ar);
    }    
}

o/p:
run:
1
2
3
4
5
6
SUM= 21
BUILD SUCCESSFUL (total time: 0 seconds)
