

@WebServlet("/ex")
public class Ex extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int n = 0;
		String n_ = req.getParameter("n");
		if (n_ != null && !n_.equals(""))
			n = Integer.parseInt(n_);
		
		String result = "";
		if (n % 2 == 0) {
			result = "짝수";
		} else {
			result = "홀수";
		}
		
    // "result" 이름에 result 값을 저장한다.
		req.setAttribute("result", result);
		
		// 데이터 저장소 역할을 한다.
		RequestDispatcher dispatcher = req.getRequestDispatcher("ex.jsp");
		// result 값을 req를 통해 전달해준다.
		dispatcher.forward(req, res);
	}
  
  
  
