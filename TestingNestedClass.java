class OuterClass{
    int x=10;
    class InnerClass{
        int y=5;
    }
}

public class TestingNestedClass {
    int x;
    TestingNestedClass(){}
    TestingNestedClass(int y){
        x=y;
    }
    public static void main(String[] args) {
        TestingNestedClass obj = new TestingNestedClass(12);
        TestingNestedClass myObjClass = new TestingNestedClass();
        System.out.println(obj.x);
        OuterClass myOuterClass = new OuterClass();
        OuterClass.InnerClass myInnerClass = myOuterClass.new InnerClass();
        System.out.println(myInnerClass.y+myOuterClass.x);
    }    
}
