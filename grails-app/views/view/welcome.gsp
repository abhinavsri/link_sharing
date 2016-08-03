<%--
  Created by IntelliJ IDEA.
  User: abhinav
  Date: 2/8/16
  Time: 11:18 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
    <link rel="stylesheet" href="${resource(dir: "css", file: "bootstrap.min.css")}"/>
    <script src="${resource(dir: "js", file: "bootstrap.min.js")}"></script>
    <style type="text/css">
    .row{
        margin-bottom: 80px;
        text-align: justify;
        padding: 10px;
    }
    </style>

</head>

<body>
<div class="container">
    <div class="col-xs-7 col-sm-7 col-md-7 col-lg-7">
        for link sharing and database
    </div>


    <div class="col-xs-5 col-sm-5 col-md-5 col-lg-5">

        <div class="row" style="background-color: #66afe9">
            <div class="headers-region back" style="background-color: #5cb85c" >LOGIN IF YOU ARE REGISTERED</div>
            <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
                <form action="" controller="" method="post">
                    <label class="input">
                        <input type="text" placeholder="enter the username">
                        <input type="password" placeholder="enter the password">
                        <input type="checkbox" name="checkbox-inline">keep me logged in
                        <button type="submit" class="button">LOG IN</button>
                    </label>
                </form>
            </div>
        </div>


        <div class="row" style="background-color: #31b0d5">

            <div class="headers-region back" style="background-color: #5cb85c" >PLEASE REGISTER</div>
            <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
                <form action="" controller="" method="post">
                    <label class="input">
                        <input type="text" placeholder="enter the username">
                        <input type="password" placeholder="enter the password">
                        <input type="password" placeholder="enter the password">
                        <input type="text" placeholder="first name">
                        <input type="text" placeholder="last name">
                        <input type="text" placeholder="E-Mail">
                        <input type="file" placeholder="choose image">

                        <input type="checkbox" name="checkbox-inline">I agree to all conditions
                        <button type="submit" class="button">LOG IN</button>
                    </label>
                </form>
            </div>

        </div>
    </div>
</div>

</body>
</html>