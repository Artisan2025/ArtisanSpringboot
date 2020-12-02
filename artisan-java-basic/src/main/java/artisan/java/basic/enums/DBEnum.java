package artisan.java.basic.enums;

/**
 * @author puxianfeng
 * @description
 * @date 2020/9/16 11:32 上午
 */
public enum DBEnum {

    ORACLE("oracle", 1),
    DB2("db2", 2),
    MYSQL("mysql", 3),
    SQLSERVER("sqlserver", 4);

    private String name;

    private Integer index;

    DBEnum(String name, int index) {
        this.name = name;
        this.index = index;
    }


}
