package millet.dai.study.template;

public class CMBAgent extends AbstractAgentInterface {
    @Override
    public void checkData(String[] data) {
        System.out.println(this.getClass() + " 执行 checkData");
    }

    @Override
    public void parseData(String[] data) {
        System.out.println(this.getClass() + " 执行 parseData");
    }

    @Override
    public String parseResponse(String response) {
        System.out.println(this.getClass() + " 执行 parseResponse");
        return null;
    }
}
