package millet.dai.study.template;

public abstract class AbstractAgentInterface implements AgentInterface {

    @Override
    public String receiveData(String[] data) {
        checkData(data);
        parseData(data);
        checkBusiness(data);
        String response = store(data);
        return parseResponse(response);
    }

    public abstract void checkData(String[] data);

    public abstract void parseData(String[] data);

    public void checkBusiness(String[] data) {
        System.out.println(this.getClass() + " 执行 checkBusiness");
    }

    public String store(String[] data) {
        System.out.println(this.getClass() + " 执行 store");
        return null;
    }

    public abstract String parseResponse(String response);

}
