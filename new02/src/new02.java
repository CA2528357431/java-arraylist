import java.util.ArrayList;

public class new02 {
    public static void main(String[] args){
        int a[] = {1,2,3};
        int b[] = {9,8,7};
        double c = 3.14;


        int m[][] = {a,b};
        int n[][] = {a,b};

        m[0][0]=1000000;
        System.out.println(n[0][0]);

        // 本质上是引址

        int mm[][] = m.clone();
        m[0][0]=-9999;
        System.out.println(mm[0][0]);
        // clone 只是表层copy


        ArrayList li1 = new ArrayList();
        li1.add(a);
        li1.add(b);
        li1.add(c);
        Object ne = li1.get(0);
        int[] neo = (int[])ne;
        neo[0] = 9999999;
        Object li2be = li1.clone();
        ArrayList li2 = (ArrayList) li2be;
        Object ne2 = li1.get(0);
        int[] neo2 = (int[])ne;
        System.out.println(neo2[0]);
        // clone 只是表层copy



    }
}
