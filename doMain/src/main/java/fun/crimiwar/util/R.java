package fun.crimiwar.util;


import lombok.Data;

@Data
public class R {

    private Boolean flag;//是否成功
    private Object Data;//具体数据
    private String message;//相关信息

    public R(){}

    public R(Boolean flag){
        this.flag=flag;
    }

    public R(Boolean flag,Object Data){
        this.Data=Data;
        this.flag=flag;
    }

    public R(Boolean flag,String message){
        this.message=message;
        this.flag=flag;
    }

    public R(String message){
        this.flag=false;
        this.message=message;
    }

}
