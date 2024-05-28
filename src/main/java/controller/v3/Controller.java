package controller.v3;

import java.util.Map;
public interface Controller {
    ModelView process(Map<String, String> paramMap);
}
