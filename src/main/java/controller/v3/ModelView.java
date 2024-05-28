package controller.v3;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ModelView {
    private String viewPath;
    private Map<String, Objects> model = new HashMap<>();


    public ModelView(String viewPath) {
        this.viewPath = viewPath;

    }

    public Map<String, Objects> getModel() {
        return model;
    }

    public void setModel(Map<String, Objects> model) {
        this.model = model;
    }

    public String getViewPath() {
        return viewPath;
    }

    public void setViewPath(String viewPath) {
        this.viewPath = viewPath;
    }

    public void render(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher(viewPath);
        req.setAttribute("model", model);
        dispatcher.forward(req,res);

    }
}
