package millet.dai.study.pattern;

import millet.dai.study.template.AgentInterface;
import millet.dai.study.template.CBCAgent;
import millet.dai.study.template.CMBAgent;
import millet.dai.study.template.ICBCAgent;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentNavigableMap;

public class TemplateTest {
    private static Map<String, AgentInterface> context = new ConcurrentHashMap<>();
    static {
        context.put("cmb", new CMBAgent());
        context.put("cbc", new CBCAgent());
        context.put("icbc", new ICBCAgent());
    }
    public static void main(String[] args) {
        context.get("cmb").receiveData(new String[]{});
        System.out.println("======================================================");
        context.get("cbc").receiveData(new String[]{});
        System.out.println("======================================================");
        context.get("icbc").receiveData(new String[]{});
    }
}
