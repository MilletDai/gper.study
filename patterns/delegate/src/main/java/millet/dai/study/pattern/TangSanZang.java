package millet.dai.study.pattern;

import millet.dai.study.pattern.impl.BaiLongMa;
import millet.dai.study.pattern.impl.ShaHeShang;
import millet.dai.study.pattern.impl.SunWuKong;
import millet.dai.study.pattern.impl.ZhuBaJie;

import java.util.HashMap;
import java.util.Map;

class TangSanZang {

    private static Map<String, Apprentice> apprentices = new HashMap<>();
    private static Map<Problem, String> problems = new HashMap<>();

    static {
        apprentices.put("悟空", new SunWuKong());
        apprentices.put("敖闰", new BaiLongMa());
        apprentices.put("悟能", new ZhuBaJie());
        apprentices.put("悟净", new ShaHeShang());

        problems.put(Problem.BAI_GU_JING, "悟空");
        problems.put(Problem.HUNGRY, "悟净");
        problems.put(Problem.TIRED, "敖闰");
        problems.put(Problem.TONG_GUAN_WEN_DIE, "悟净");
        problems.put(Problem.YAO_GUAI, "悟空");
        problems.put(Problem.YU_TU_JING, "悟能");
        problems.put(Problem.ZHI_ZHU_JING, "悟能");
    }

    /**
     * 策略 + 委派
     * @param problem 老唐遇到的麻烦
     */
    void hasProblem(Problem problem){
        String apprentice = problems.get(problem);
        System.out.println("唐僧：" + apprentice + "!");
        System.out.print(apprentice + "：");
        apprentices.get(apprentice).fangZheWoLai();
    }

}
