package com.mamba.creational.template;

/**
 * @author joe.zhang
 * @date 2020-10-29 10:46:10
 * Description: 操作jdbc 模拟类
 */
public class JdbcTemplate {

    public void query(JdbcCallback jdbcCallback){
        //建立连接...

        //处理返回值
        jdbcCallback.processData();

        //释放资源


    }


    public static void main(String[] args) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.query(new JdbcCallback() {
            @Override
            public void processData() {
                //自定义处理返回值的封装
            }
        });
    }

}
