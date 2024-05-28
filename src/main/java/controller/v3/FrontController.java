package controller.v3;

import controller.v3.Controller;
import controller.v3.MemberInfoController;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "frontController3", urlPatterns = "/front-controller/member3/*")
public class FrontController extends HttpServlet {

    private Map<String, Controller> map = new HashMap<>();

    public FrontController(Map<String, Controller> map) {
        map.put("/front-controller/member3/retrieve", new MemberInfoController() );
//        map.put("/front-controller/member/save", new MemberSaveController() );
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Controller controller = map.get(req.getRequestURI());
        Map<String, String> paramMap = createParameterMap(req);
        ModelView modelView = controller.process(paramMap);


    }

    private Map<String, String> createParameterMap(HttpServletRequest request) {
        Map<String, String> paramMap = new HashMap<>();

        request.getParameterNames().asIterator().forEachRemaining(name -> paramMap.put(name, request.getParameter(name)));

        return paramMap;
    }

}
