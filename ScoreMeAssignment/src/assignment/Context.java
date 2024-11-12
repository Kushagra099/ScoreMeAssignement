package assignment;

import java.util.HashMap;
import java.util.Map;

public class Context {

    private final Map<String, Object> data = new HashMap<>();

    public void setData(String key, Object value) {
        data.put(key, value);
    }

    public <T> T getData(String key, Class<T> type) {
        return type.cast(data.get(key));
    }
}