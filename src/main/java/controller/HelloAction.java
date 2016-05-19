package controller;

/**
 * @author xiaozhongbao
 * @date 16-5-19
 */
public class HelloAction {
    private String name;

    public String getCustomGreeting() {
        return customGreeting;
    }

    public void setCustomGreeting(String customGreeting) {
        this.customGreeting = customGreeting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private  String customGreeting;
    private  static final  String GREETING="hello";
    public  String execute(){
            setCustomGreeting(GREETING+getName());
        return  "SUCCESS";

    }
}
