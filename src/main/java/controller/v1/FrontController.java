package controller.v1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import controller.v1.MemberInfoController;
import controller.v1.MemberSaveController;

@WebServlet(name = "frontController", urlPatterns = "/front-controller/member/*")
public class FrontController extends HttpServlet {

    private Map<String, Controller> map = new HashMap<>();

    public FrontController(Map<String, Controller> map) {
        map.put("/front-controller/member/retrieve", new MemberInfoController() );
        map.put("/front-controller/member/save", new MemberSaveController() );
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Controller controller = map.get(req.getRequestURI());
        controller.process(req,resp);
    }
}
