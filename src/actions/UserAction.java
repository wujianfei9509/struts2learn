package actions;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
    private  static final long serialVersionUID=1L;

    public String info;

    public String add() throws  Exception {
        info = "添加信息";
        return "add";
    }
    public String  update() {
        info = "更新信息";
        return "update";
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
