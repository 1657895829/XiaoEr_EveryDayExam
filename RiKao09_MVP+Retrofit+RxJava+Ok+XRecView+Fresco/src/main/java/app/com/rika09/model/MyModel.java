package app.com.rika09.model;

import java.util.HashMap;
import java.util.Map;
import app.com.rika09.bean.Bean;
import app.com.rika09.utils.APIGet_Post_Factory;
import app.com.rika09.utils.AbstractObserver;

/**
 * model层实现类
 */
public class MyModel {
    /**
     * 使用Retrofit结合RxJava,Okhttp工具类get请求数据
     * @param callBack
     */
    public void getData(final ModelCallBack callBack){
        //调用封装的请求方式的单例模式执行类请求接口,传入集合参数，使用被观察者发起定阅事件
        Map<String,String>  map = new HashMap<>();
        map.put("key","71e58b5b2f930eaf1f937407acde08fe");
        map.put("num","10");

        APIGet_Post_Factory.getInstance().get("apple/?key=71e58b5b2f930eaf1f937407acde08fe&num=10", map, new AbstractObserver<Bean>() {
            @Override
            public void onSuccess(Bean bean) {
                callBack.onSuccess(bean);
            }

            @Override
            public void onFailure(Exception e) {
                callBack.onFailure(e);
            }
        });
    }
}
