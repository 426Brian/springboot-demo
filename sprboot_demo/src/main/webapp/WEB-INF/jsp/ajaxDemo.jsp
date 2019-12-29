<%--
  Created by IntelliJ IDEA.
  User: Brian
  Date: 2018/5/7
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>spring boot ajax</title>
</head>
<body>

</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>springBoot Ajax</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/4.0.0-2/css/bootstrap-jsf.css">
</head>
<body>
<nav class="navbar navbar-inverse">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="http://www.baidu.com">百度</a>
        </div>
    </div>
</nav>

<div class="container" style="min-height: 500px">
    <div class="starter-template">
        <h1>Spring boot Ajax Test</h1>
        <div id="feedback"></div>
        <form class="form-horizontal" id="search-form" name="form">
            <div class="form-group form-group-lg">
                <label class="col-sm-2 control-label">用户名：</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="userName"/>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" id="bth-search"
                            class="btn btn-primary btn-lg">搜索
                    </button>
                </div>
            </div>

        </form>
    </div>
</div>
<div class="container">
    <footer>
        <p>
            © <a href="http://www.yiibai.com">Yiibai.com</a> 2017
        </p>
    </footer>
</div>

<script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/js/ajaxDemo.js"></script>
</body>
</html>
