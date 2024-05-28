package controller.v2;

import controller.v2.MemberInfoController;
//import controller.v2.MemberSaveController;
import controller.v2.Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "frontController2", urlPatterns = "/front-controller/member2/*")
public class FrontController extends HttpServlet {

    private Map<String, Controller> map = new HashMap<>();

    public FrontController(Map<String, Controller> map) {
        map.put("/front-controller/member2/retrieve", new MemberInfoController() );
//        map.put("/front-controller/member/save", new MemberSaveController() );
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Controller controller = map.get(req.getRequestURI());
        MyView myView = controller.process(req,resp);
        myView.render(req, resp);
    }
}
