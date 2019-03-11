package millet.dai.study.pattern;

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Man man = new Man();
        man.setDeep(false);
        man.setName("张三");
        man.setSex("男");

        Body body = new Body();
        body.setBody("瘦子");
        body.setFoot("高个");
        body.setHead("小脑袋");

        man.setBody(body);

        Man cl = (Man) man.clone();
        sout(man, cl);

        man.setDeep(true);
        cl = (Man) man.clone();
        sout(man, cl);
    }

    private static void sout(Man man, Man cl) {
        System.out.println(man == cl);
        System.out.println(man.hashCode() + ":" + man);
        System.out.println(cl.hashCode() + ":" + cl);
        System.out.println(man.getBody() == cl.getBody());
        System.out.println(man.getBody().hashCode() + ":" + man.getBody());
        System.out.println(cl.getBody().hashCode() + ":" + cl.getBody());
    }

}
