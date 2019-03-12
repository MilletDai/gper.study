package millet.dai.study.pattern;

import millet.dai.study.pattern.statics.JobHunter;

public class StaticProxyTest {
    public static void main(String[] args) {
        JobHunter hunter = new JobHunter();
        Human man = new Man();
        hunter.proxy(man).findJob();
        Human woman = new Woman();
        hunter.proxy(woman).findJob();
    }
}
