package com.example.app.rxjava.base;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

/**
 * Created by Administrator on 2016/3/4.
 */
public class ResultsDeserializer<T> implements JsonDeserializer<T> {
    @Override
    public T deserialize(JsonElement je, Type typeOfT,
                         JsonDeserializationContext context) throws JsonParseException {
        // 转换Json的数据, 获取内部有用的信息
        JsonElement results = je.getAsJsonObject();
        return new Gson().fromJson(results, typeOfT);
    }
}
