// array list

import java.util.ArrayList;

public class new01 {
    public static void main(String[] args){
        ArrayList li = new ArrayList();
        // 构造

        li.add(3);
        li.add(12.999);
        li.add(3);
        li.add(3);
        li.add(3);
        li.add("glad");
        li.add(3.14);
        li.add("hello");
        li.add(999);
        li.add(3);
        li.add(4);

        // 单体添加
        // 不限类型

        Object it = li.get(5);
        String ittrue = (String) it;
        System.out.println(ittrue);
        // 获取指定元素
        // 由于类型不确定，object接受
        // 转化即可

        boolean judge = li.contains(12);
        System.out.println(judge);
        // 是否包含

        boolean emp = li.isEmpty();
        System.out.println(emp);
        // 是否空

        int ind = li.indexOf(3.14);
        System.out.println(ind);
        // 获取index

        System.out.println(li.get(4));
        li.remove(4);
        System.out.println(li.get(4));
        // 删除index

        System.out.println(li.get(2));
        li.remove("glad");
        System.out.println(li.get(2));
        // 删除第一个元素

        System.out.println(li.get(0));
        li.remove((Integer)3);
        System.out.println(li.get(0));
        // 删除int

        System.out.println(li.set(1,"gkvvukj"));
        System.out.println(li.get(1));
        // 设置

        System.out.println(li.size());
        // 大小

        li.clear();
        System.out.println(li.size());
        // 清空




    }
}
