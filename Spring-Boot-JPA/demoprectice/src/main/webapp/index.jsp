<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Log In</title>
    <%@include file="Links.jsp" %>
</head>
<body>
<%--<%@include file="nav.jsp"%>--%>
<section class="vh-100" style="background-color: #eee;">
    <div class="container h-100">
        <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col-lg-12 col-xl-11">
                <div class="card text-black" style="border-radius: 25px;">
                    <div class="card-body p-md-5">
                        <div class="row justify-content-center">
                            <div class="col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1">

                                <p class="text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4">Sign up</p>
                                <%
                                    String msg = (String) session.getAttribute("msg");
                                    if (msg != null) {
                                %> <p class="text-success text-center"><%=msg%>
                            </p><%
                                    session.removeAttribute("msg");
                                }
                            %>
                                <form action="login" class="mx-1 mx-md-4" method="post">


                                    <div class="d-flex flex-row align-items-center mb-4">
                                        <i class="fas fa-envelope fa-lg me-3 fa-fw"></i>
                                        <div class="form-outline flex-fill mb-0">
                                            <input type="email" name="email" id="email" class="form-control"/>
                                            <label class="form-label" for="email">Your Email</label>
                                        </div>
                                    </div>

                                    <div class="d-flex flex-row align-items-center mb-4">
                                        <i class="fas fa-lock fa-lg me-3 fa-fw"></i>
                                        <div class="form-outline flex-fill mb-0">
                                            <input type="password" name="password" id="password" class="form-control"/>
                                            <label class="form-label" for="password">Password</label>
                                        </div>
                                    </div>
                                    <div class="d-flex flex-row align-items-bottom mb-4">
                                        <%--<i class="fas fa-lock fa-lg me-3 fa-fw"></i>
                                        <div class="form-outline flex-fill mb-0">--%>
                                        <a href="forgotPassword.jsp">Forgot Password</a>
                                        <%--</div>--%>
                                    </div>


                                    <div class="d-flex justify-content-center mx-4 mb-3 mb-lg-4">
                                        <button type="submit" class="btn btn-primary btn-lg">Sign in</button>
                                    </div>
                                    <div class="text-center">
                                        <p>Not a member? <a href="Register.jsp">Register</a></p>
                                    </div>

                                </form>

                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>


</body>
</html>