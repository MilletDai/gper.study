package millet.dai.study.pattern;

public class BaShiYiNan {
    public static void main(String[] args) {
        TangSanZang tangSanZang = new TangSanZang();
        // 遇到白骨精
        tangSanZang.hasProblem(Problem.BAI_GU_JING);
        // 饿了
        tangSanZang.hasProblem(Problem.HUNGRY);
        // 遇到蜘蛛精
        tangSanZang.hasProblem(Problem.ZHI_ZHU_JING);
        // 换取通关文牒
        tangSanZang.hasProblem(Problem.TONG_GUAN_WEN_DIE);
        // 遇到玉兔精
        tangSanZang.hasProblem(Problem.YU_TU_JING);
        // 遇到妖怪
        tangSanZang.hasProblem(Problem.YAO_GUAI);
        // 累了
        tangSanZang.hasProblem(Problem.TIRED);
    }
}
